package linkedList_i_element_from_end;

import java.util.LinkedList;
import java.util.*;

public class LinkedList_i_element_from_end {
	public static void main(String[] args)
	{
		//declaring the LinkedList
		var staff = new LinkedList<String>();
		//asking about length of LinkedList
		System.out.println("How many elements in the LinkedList?");
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		//asking to type elements of LinkedList
		System.out.println("Type them");
		for (int i = 0; i < length; i++) {
			String item = in.next();
			staff.add(item);
		};
		//asking to type i
		System.out.println("Type i");
		int i = in.nextInt();
		//searching for the element
		String item = staff.get(length - i);
		//counting the element's index
		int index = length - i;
		//showing element and it's index
		System.out.print("The element is " + item);
		System.out.println();
		System.out.print("It's index is " + index);
	}
}
