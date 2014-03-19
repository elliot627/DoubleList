
public class DoubleList {
	private double [] myList;
	private int mySize;
	static int INITIAL_SIZE = 20;
	
	
	/**
	 * Default constructor for DoubleList
	 */
	public DoubleList(){
		myList= new double [INITIAL_SIZE];
		mySize=0;
	}
	
	/** Overload constructor for DoubleList, given a list length
	 * @param length Size of the list
	 */
	public DoubleList(int length){
		myList= new double [length];
		mySize=0;
	}
	
	/**Overload constructor for Doublelist, given an array
	 * @param a Given array to instantiate DoubleList
	 */
	public DoubleList(double[]a){
		myList = new double [a.length+INITIAL_SIZE];
		mySize=0;
		for(double val:a){
			add(val);
		}
	}
	
	public DoubleList(double[]a,boolean keepSorted){
		
	}
	
	/**
	 * @return returns the size of myList 
	 */
	public int getSize(){
		return mySize;
	}
	
	/**
	 * @return returns the current size of myList
	 */
	public int getMaxSize(){
		return myList.length;
	}
	
	/**
	 * Adds an item to the end of the DoubleList
	 * @param item the value to be added
	 * Precondition: list is not full
	 * Postcondition: item is added to the end of the list
	 * @throws RuntimeException if list is full
	*/
	public void add(double val){
		if(mySize<myList.length){
			myList[mySize]=val;
			mySize++;
		}
		else{
			throw new RuntimeException("OBOE, fool.");
		}
	}
	
	/**Adds a given value to a specific place in the array
	 * @param addLoc Location to add value
	 * @param val Value to be placed at location
	 */
	public void add(int addLoc,double val){
		if(mySize==0)throw new RuntimeException();
		else{
			mySize++;
			for(int i=mySize-1;i>addLoc;i--){
				myList[i]=myList[i-1];
			}
			myList[addLoc]=val;
		}
	}
	
	/**
	 * Returns a string representation of the Double List
	 */
	public String toString(){
		if(mySize>0){
			String  str="";
			for(int i=0;i<mySize;i++){
				str+="[" + i + "]=> " + myList[i] + "\n";
			}
			return str;
		}
		else{
			return "Sorry, The list is empty..";
		}
	}
	
	/** Removes the last double in the array
	 * @return Returns the double that was removed
	 * Pre-condition
	 */
	public double remove(){
		if(mySize==0)throw new RuntimeException();
		else{
			double ret = myList[mySize-1];
			mySize-=1;
			return ret;
		}
	}
	
	/**Removes an item from a given location in the array
	 * @param removeLoc Location of item to be removed
	 * @return Value that was removed
	 */
	public double remove(int removeLoc){
		if(mySize==0)throw new RuntimeException();
		else{
			double ret=myList[removeLoc];
			for(int i=removeLoc;i<mySize-1;i++){
				myList[i]=myList[i+1];
			}
			mySize--;
			return ret;
		}
	}
	
	/**Searches through the list for a given value
	 * @param val Value to be searched for
	 * @return returns index value if found, else, -1
	 */
	public int search(double val){
		for(int i=0;i<mySize;i++){
			if (myList[i]==val)
			return i;
		}
		return -1;
	}
	
	/**Returns the sum of the list
	 * @return sum of DoubleList
	 */
	public double sum(){
		double sum=0.0;
		for (int i=0;i<mySize;i++){
			sum+=myList[i];
		}
		return sum;
	}
	
	/**Calculates the average of the list
	 * @return Returns the average of values in the array
	 */
	public double average(){
		double sum=0.0;
		if(mySize==0){
			throw new RuntimeException();
		}
		for(int i=0;i<mySize;i++){
			sum+=myList[i];
		}
		double average=sum/mySize;
		return average;
	}
	
	/**Returns the largest value in the array
	 * @return Largest value found in array
	 */
	public double max(){
		double max=myList[0];
		for(int i=0;i<mySize;i++){
			if(myList[i]>max){
				max=myList[i];
			}
		}
		return max;
	}
	
	/**Returns the smallest value in the array
	 * @return Smallest value found in array
	 */
	public double min(){
		double min=myList[0];
		for(int i=0;i<mySize;i++){
			if(myList[i]<min){
				min=myList[i];
			}
		}
		return min;
	}
	
	
	/**Return the index of the smallest value in the array, after given index
	 * @param first index of starting point
	 * @return
	 */
	public int findMinimum(int first){
		int minIndex=first;
		for(int i = first + 1; i < mySize; i++){
			if(myList[i] < myList[minIndex]){
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	/**Swaps two values in myList 
	 * @param x index of value to be swapped with y
	 * @param y index of value to be swapped with x
	 */
	public void swap(int x,int y){
		double temp=myList[x];
		myList[x]=myList[y];
		myList[y]=temp;
		
	}
	
	/**Sorts array using selection sort algorithm
	 * 
	 */
	public void selectionSort(){
		for(int i = 0; i < mySize; i++){
			int minIndex = findMinimum(i);
			if(minIndex != i){
				swap(i, minIndex);
			}
		}
	}
	
	/**Sorts array using bubble sort algorithm
	 * 
	 */
	public void bubbleSort(){
		int k = 0;
		boolean exchangeMade = true;
		while((k < mySize - 1) && exchangeMade){
			exchangeMade=false;
			k++;
			for(int j = 0; j < mySize - k; j++){
				if(myList[j] > myList[j + 1]){
					swap(j,j + 1);
					exchangeMade=true;
				}
			}
		}
	}
	
	/**
	 * Sorts array using insertion sort algorithm
	 */
	public void insertionSort(){
		double itemToInsert;
		int j;
		boolean stillLooking;
		
		for(int k = 1; k < mySize; k++){
			itemToInsert=myList[k];
			j = k-1;
			stillLooking=true;
			while((j >= 0) && stillLooking){
				if(itemToInsert < myList[j]){
					myList[j+1] = myList[j];
					j--;
				}
				else{
					stillLooking=false;
				}
			}
			myList[j+ 1] = itemToInsert;
		}
	}
}


