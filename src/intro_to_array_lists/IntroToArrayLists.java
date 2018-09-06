package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> n = new ArrayList<String>();
		//2. Add five Strings to your list
		n.add("h");
		n.add("b");
		n.add("t");
		n.add("y");
		n.add("j");
		n.add("e");
		//3. Print all the Strings using a standard for-loop
	//	for(int i=0;i<6;i++) {
		//System.out.println(n.get(i));
	//	}
		//4. Print all the Strings using a for-each loop
	//	for(String s: n) {
		//	System.out.println(s);
		//}
		//5. Print only the even numbered elements in the list.
		for(int i= 0; i<6; i++) {
		//for(i%2==0) {
		//		System.out.println(n.get(i));
			if(n.get(i).contains("e")) {
			System.out.println(n.get(i));	
			}
			}
			
	//	}
		//6. Print all the Strings in reverse order.
		//for(int i= 5; i>-1; i--) {
			//System.out.println(n.get(i));
		//}
		//7. Print only the Strings that have the letter 'e' in them.
		
	}
}
