import java.util.ArrayList;

class Day5_3 {
	public static void main(String[] args) {
		int[] intArray = {9, 8, 7, 6, 5};
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//		Collections.addAll(intArrayList, intArray); // only works if intArray is of type Integer[]
		System.out.println(intArrayList);
		intArrayList.add(5);
		intArrayList.add(new Integer(30));
		System.out.println(intArrayList);
		System.out.println(intArrayList.size()); // notice the parentheses
		
		intArrayList.add(521);
		intArrayList.add(12);
		intArrayList.add(523);
		intArrayList.add(32);
		System.out.println(intArrayList);
		System.out.println(intArrayList.size());
		System.out.println(intArrayList);
		System.out.println(intArrayList.get(3));
		intArrayList.set(3, 999);
		System.out.println(intArrayList);
		intArrayList.add(5, 9999);
		System.out.println(intArrayList);
		intArrayList.remove(5);
		System.out.println(intArrayList);
		
		for (int i = 0; i < intArrayList.size(); i++) {
			System.out.println(intArrayList.get(i));
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
}