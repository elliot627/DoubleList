
public class TestSort {
	public static void main(String[] args) {
		//Insertion Sort
		double[] numArray;
		numArray = new double[20];
		
		for(int i = 0; i < numArray.length; i++){
			numArray[i]=(Math.random()*100);
		}
		
		DoubleList list1 = new DoubleList();
		
		for(int i = 0; i < numArray.length; i++){
			list1.add(numArray[i]);
		}
		
		System.out.println("List BEFORE Insertion Sort:");
		System.out.println(list1);
		System.out.println("List AFTER Insertion Sort:");
		list1.insertionSort();
		System.out.println(list1);
		
		//Selection Sort
		double[] numArray2;
		numArray2 = new double[20];
		
		for(int i = 0; i < numArray2.length; i++){
			numArray[i]=(Math.random()*100);
		}
		
		DoubleList list2 = new DoubleList();
		
		for(int i = 0; i < numArray2.length; i++){
			list2.add(numArray[i]);
		}
		
		System.out.println("List BEFORE Selection Sort:");
		System.out.println(list2);
		System.out.println("List AFTER Selection Sort:");
		list2.selectionSort();
		System.out.println(list2);
		
		//Bubble Sort
		double[] numArray3;
		numArray3 = new double[20];
		
		for(int i = 0; i < numArray3.length; i++){
			numArray[i]=(Math.random()*100);
		}
		
		DoubleList list3 = new DoubleList();
		
		for(int i = 0; i < numArray3.length; i++){
			list3.add(numArray[i]);
		}
		
		System.out.println("List BEFORE Bubble Sort:");
		System.out.println(list3);
		System.out.println("List AFTER Bubble Sort:");
		list3.bubbleSort();
		System.out.println(list3);
	}

}
