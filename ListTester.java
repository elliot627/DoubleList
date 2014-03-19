
public class ListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Testing Constructors...");
		DoubleList aList = new DoubleList ();
		System.out.println ("size: " + aList.getSize());
		System.out.println ("max size: " + aList.getMaxSize());
		aList = new DoubleList (3);
		System.out.println ("size: " + aList.getSize());
		System.out.println ("max size: " + aList.getMaxSize());

		System.out.println ("\nTesting add and toString...");
		System.out.println ("List is: " + aList);
		aList.add (12.0);
		aList.add (-1.0E305);
		System.out.println ("List is: " + aList);
		aList.add (0.0);
		//aList.add (100.0);		// should generate an error

		System.out.println("\nTesting third overload constructor...");
		double[] List={1.0,2.0,3.0,4.0,5.0};
		DoubleList bList = new DoubleList(List);
		System.out.println(bList);
		
		System.out.println("\nTesting the remove method...");
		System.out.println("The removed value was: " + bList.remove());
		System.out.println("The resulting array is: " +bList);
		
		System.out.println("\nTesting the search method...");
		System.out.println("Searching for 4.0... | Location is: " + bList.search(4.0));
		System.out.println("Searching for 9.0... | Location is: " + bList.search(9.0));
		System.out.println("Searching for 1.0... | Location is: " + bList.search(1.0));
		
		System.out.println("\nTesting the add method...");
		System.out.println("The sum of bList is: " + bList.sum());
		System.out.println("The sum of aList is: " + aList.sum());
		
		System.out.println("\nTesting the average method...");
		System.out.println("The average of bList is: " + bList.average());
		
		System.out.println("\nTesting the maximum method...");
		System.out.println("The max of the array bList is: " + bList.max());
		
		System.out.println("\nTesting the minimum method...");
		System.out.println("The min of the array bList is: " + bList.min());
		
		System.out.println("\nTesting the overloaded remove method...");
		System.out.println("Printing bList..." + bList);
		System.out.println("Removing " + bList.remove(1) + "...");
		System.out.println("The resulting array is: " + bList);
		System.out.println("Removing " + bList.remove(0) + "...");
		System.out.println("The resulting array is: " + bList);
		
		System.out.println("\nTesting the overloaded add method...");
		System.out.println("Adding 1.0 to position 0...");
		bList.add(0,1.0);
		System.out.println(bList);
		System.out.println("Adding 2.0 to position 1...");
		bList.add(1,2.0);
		System.out.println(bList);
		
		
	}

}
