//9. Search a number in a sorted array in o(log n) time?
package q1to10;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int high= array.length-1, low=0;
		int target = 5;
		
		while(low<=high) {
			int mid = low + (high - low)/2;
			
			if(array[mid]==target)
				{System.out.println("Element present on index: "+mid);break;}
			
			else if(array[mid]<target)
				low = mid+1;
			else
				high = mid-1;
		}
	}
}
