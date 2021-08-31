package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class WordSummation {
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord){
        
        if(value(firstWord) + value(secondWord) == value(targetWord))
        return true;
        
        return false;
    }
    
    public static int value(String word){
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] ch = new char[word.length()];
        char[] sortedCh = new char[word.length()];
        for(int i=0; i<word.length();i++){
            ch[i] = word.charAt(i);
        }
        for(int j=0; j<ch.length; j++)
        sortedCh[j] = ch[j];
        
        Arrays.sort(sortedCh);
        
        for(int i=0; i<sortedCh.length; i++ ){
          map.put(sortedCh[i], i);
        }
        
        
        int num = 0;
        for(int i=0; i<ch.length; i++){
            num = num + map.get(ch[ch.length-(i+1)])*((int)Math.pow(10,i));
        }
        
        System.out.println(num);
        return num;
        }
    
    public static void main(String agrs[]) {
    	isSumEqual("abc","cba","cdb");
    }
    
}
