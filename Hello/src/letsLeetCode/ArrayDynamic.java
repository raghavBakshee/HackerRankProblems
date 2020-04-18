package letsLeetCode;

import java.util.ArrayList;
import java.util.List;

public class ArrayDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<Integer>(3);
		
		l1.add(5);
		l1.add(21);
		List<Integer> l2= l1;
		l2.add(2, 100);
		System.out.println(l1 + "    "  + l2.subList(0, 1));
	}

}
						