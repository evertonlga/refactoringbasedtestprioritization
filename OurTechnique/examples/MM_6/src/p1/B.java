package p1;

public class B extends A{

	public C f=null;
	public long m(){
		return 0;
	}
	
	public static boolean sequentialSeach(int[] a, int b){
		for (int i : a) {
			if (i==b){
				return true;
			}
		}
		return false; 
	}


	public static boolean binarySearch(int[] a, int b) {
		if (a.length == 0) {
			return false;
		}
		int low = 0;
		int high = a.length-1;

		while(low <= high) {
			int middle = (low+high) /2; 
			if (b> a[middle]){
				low = middle +1;
			} else if (b< a[middle]){
				high = middle -1;
			} else { // The element has been found
				return true; 
			}
		}
		return false;
	}

	public static int recursiveBinarySearch(int[] sorted, int first, int upto, int key) {

		if (first < upto) {
			int mid = first + (upto - first) / 2;  // Compute mid point.
			if (key < sorted[mid]) {
				return recursiveBinarySearch(sorted, first, mid, key);

			} else if (key > sorted[mid]) {
				return recursiveBinarySearch(sorted, mid+1, upto , key);

			} else {
				return mid;   // Found it.
			}
		}
		return -(first + 1);  // Failed to find key
	}

	public static boolean ternarySearch (int[] A, int value, int start, int end)
	{
		if (start > end) {
			return false;
		}

		// First boundary: add 1/3 of length to start.
		int mid1 = start + (end-start) / 3;

		// Second boundary: add 2/3 of length to start.
		int mid2 = start + 2*(end-start) / 3;

		if (A[mid1] == value) {
			return true;
		}
		else if (A[mid2] == value) {
			return true;
		}
		else if (value < A[mid1]) {
			// Search 1st third.
			return ternarySearch (A, value, start, mid1-1);
		}
		else if (value > A[mid2]) {
			// Search 3rd third.
			return ternarySearch (A, value, mid2+1, end);
		}
		else {
			// Middle third.
			return ternarySearch (A, value, mid1,mid2);
		}
	}

}
