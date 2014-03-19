
public class TimeSort {
	public static void main(String[] args) {
		
		for(int n = 1000; n <= 20000; n += 1000){
			double selSortTime;
			double insSortTime;
			double bubSortTime;
			
			double[] numArray; 
			numArray = new double[n];
			
			for(int i = 0; i < n; i++){
				numArray[i]=(Math.random()*100);
			}
			
			
			
			//Selection Sort method
			DoubleList selSort = new DoubleList(n);
			
			for(int i = 0; i < n  ; i++){
				selSort.add(numArray[i]);
			}

			double selSortOne = System.nanoTime();
			selSort.selectionSort();
			double selSortTwo = System.nanoTime();
			selSortTime = selSortTwo - selSortOne;
			
			
			
			//Insertion Sort method
			DoubleList insSort= new DoubleList(n);
			
			for(int i = 0; i < n; i++){
				insSort.add(numArray[i]);
			}

			double insSortOne = System.nanoTime();
			insSort.insertionSort();
			double insSortTwo = System.nanoTime();
			insSortTime = insSortTwo - insSortOne;
			
			
			
			//Bubble Sort method
			DoubleList bubSort = new DoubleList(n);
			
			for(int i = 0; i < n; i++){
				bubSort.add(numArray[i]);
			}

			double bubSortOne = System.nanoTime();
			bubSort.bubbleSort();
			double bubSortTwo = System.nanoTime();
			bubSortTime = bubSortTwo - bubSortOne;
			
			System.out.println(n + "\t" + selSortTime + "\t" + insSortTime + "\t" + bubSortTime);
			
		}
	}

}
