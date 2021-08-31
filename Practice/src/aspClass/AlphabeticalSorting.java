package aspClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlphabeticalSorting {
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Names in the list(List Size = 5)");
	ArrayList<String> list = new ArrayList<String>();
	while(list.size() < 5 && s.hasNext()) {
		list.add(s.nextLine());
	}
	SortNamesPreDef(list);
	System.out.println(list);
	s.close();
}

public static List<String> SortNamesPreDef(ArrayList<String> list) {
	java.util.Collections.sort(list);
	return list;
}

public static List<String> SortNames(ArrayList<String> list) {
	char[] ch = new char[list.get(0).length()];
	for(int i=0; i<list.size(); i++) {
		ch[i] = list.get(i).charAt(i);	
	}
	
	return list;
}
}
