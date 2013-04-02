package p2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import p1.A;

public class B extends A{

	protected long k(int a){
		return 2;
	}
	
	public long test(){
		return m();
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
	
	public static int getInt(String prompt, int min, int max) throws Exception {
		int result;
		do {
			String strVal = prompt;
			result = Integer.parseInt(strVal);
			if (result < min || result > max) {
				throw new Exception(
						"ERROR: Input must be between " + min + " and " + max);
			}
		} while (result < min || result > max);

		return result;
	}


	public static int[] reverse(int[] b) {
		int left  = 0;          // index of leftmost element
		int right = b.length-1; // index of rightmost element

		while (left < right) {
			// exchange the left and right elements
			int temp = b[left]; 
			b[left]  = b[right]; 
			b[right] = temp;

			// move the bounds toward the center
			left++;
			right--;
		}
		
		return b;
	}//endmethod reverse

	public static int max(int[] t) {
		int maximum = t[0];   // start with the first value
		for (int i=1; i<t.length; i++) {
			if (t[i] > maximum) {
				maximum = t[i];   // new maximum
			}
		}
		return maximum;
	}//end method max


	public static double mean(double[] p) {
		double sum = 0;  // sum of all the elements
		for (int i=0; i<p.length; i++) {
			sum += p[i];
		}
		return sum / p.length;
	}//end method mean



	public static List<Integer> primeFactors(int number) {
		int n = number;
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors;
	}
	
	public static List<Integer> primeFactors2(int numbers) {
	    int n = numbers;
	    List<Integer> factors = new ArrayList<Integer>();
	    for (int i = 2; i <= n / i; i++) {
	      while (n % i == 0) {
	        factors.add(i);
	        n /= i;
	      }
	    }
	    if (n > 1) {
	      factors.add(n);
	    }
	    return factors;
	  }
	
	public static List<Integer> calcPrimeNumbers(int n) {
	    boolean[] isPrimeNumber = new boolean[n + 1]; // boolean defaults to
	    // false
	    List<Integer> primes = new ArrayList<Integer>();
	    for (int i = 2; i < n; i++) {
	      isPrimeNumber[i] = true;
	    }
	    for (int i = 2; i < n; i++) {
	      if (isPrimeNumber[i]) {
	        primes.add(i);
	        // Now mark the multiple of i as non-prime number
	        for (int j = i; j * i <= n; j++) {
	          isPrimeNumber[i * j] = false;
	        }
	      }

	    }

	    return primes;
	  }
	
	
	public static int[] shuffleArray(int[] a) {
	    int n = a.length;
	    Random random = new Random();
	    random.nextInt();
	    for (int i = 0; i < n; i++) {
	      int change = i + random.nextInt(n - i);
	      swap(a, i, change);
	    }
	    return a;
	  }

	  private static void swap(int[] a, int i, int change) {
	    int helper = a[i];
	    a[i] = a[change];
	    a[change] = helper;
	  }
	  
	  
	  public static int greatestCommonDivisor(int p, int q) {
		    if (q == 0) {
		      return p;
		    }
		    return greatestCommonDivisor(q, p % q);
		  }
	  
	  public static BigInteger fastFibonacciDoubling(int n) {
			BigInteger a = BigInteger.ZERO;
			BigInteger b = BigInteger.ONE;
			int m = 0;
			for (int i = 31; i >= 0; i--) {
				// Loop invariant: a = F(m), b = F(m+1)
				assert a.equals(slowFibonacci(m));
				assert b.equals(slowFibonacci(m+1));
				
				// Double it
				BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
				BigInteger e = multiply(a, a).add(multiply(b, b));
				a = d;
				b = e;
				m *= 2;
				assert a.equals(slowFibonacci(m));
				assert b.equals(slowFibonacci(m+1));
				
				// Advance by one conditionally
				if (((1 << i) & n) != 0) {
					BigInteger c = a.add(b);
					a = b;
					b = c;
					m++;
					assert a.equals(slowFibonacci(m));
					assert b.equals(slowFibonacci(m+1));
				}
			}
			return a;
		}
		
		
		/* 
		 * Fast matrix method. Easy to describe, but has a constant factor slowdown compared to doubling method.
		 * [1 1]^n   [F(n+1) F(n)  ]
		 * [1 0]   = [F(n)   F(n-1)]
		 */
	  public static BigInteger fastFibonacciMatrix(int n) {
			BigInteger[] matrix = {BigInteger.ONE, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO};
			return pow(matrix, n)[1];
		}
		
		// Computes the power of a matrix
		public static BigInteger[] pow(BigInteger[] matrix, int n) {
			if (n < 0)
				throw new IllegalArgumentException();
			BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE};
			while (n != 0) {  // Exponentiation by squaring
				if (n % 2 != 0)
					result = multiply(result, matrix);
				n /= 2;
				matrix = multiply(matrix, matrix);
			}
			return result;
		}
		
		// Multiplies two matrices
		public static BigInteger[] multiply(BigInteger[] x, BigInteger[] y) {
			return new BigInteger[] {
				multiply(x[0], y[0]).add(multiply(x[1], y[2])),
				multiply(x[0], y[1]).add(multiply(x[1], y[3])),
				multiply(x[2], y[0]).add(multiply(x[3], y[2])),
				multiply(x[2], y[1]).add(multiply(x[3], y[3]))
			};
		}
		
		
		/* 
		 * Simple slow method, using dynamic programming
		 * F(n+2) = F(n+1) + F(n)
		 */
		public static BigInteger slowFibonacci(int n) {
			BigInteger a = BigInteger.ZERO;
			BigInteger b = BigInteger.ONE;
			for (int i = 0; i < n; i++) {
				BigInteger c = a.add(b);
				a = b;
				b = c;
			}
			return a;
		}
		
		
		// Multiplies two BigIntegers
		public static BigInteger multiply(BigInteger x, BigInteger y) {
			return x.multiply(y);  // Replace this line with Karatsuba multiplication, etc. if available
		}

		
		/* 
		 * Computes the discrete Fourier transform (DFT) of the given vector.
		 * All the array arguments must have the same length.
		 */
		public static void computeDft(double[] inreal, double[] inimag, double[] outreal, double[] outimag) {
			int n = inreal.length;
			for (int k = 0; k < n; k++) {  // For each output element
				double sumreal = 0;
				double sumimag = 0;
				for (int t = 0; t < n; t++) {  // For each input element
					sumreal +=  inreal[t]*Math.cos(2*Math.PI * t * k / n) + inimag[t]*Math.sin(2*Math.PI * t * k / n);
					sumimag += -inreal[t]*Math.sin(2*Math.PI * t * k / n) + inimag[t]*Math.cos(2*Math.PI * t * k / n);
				}
				outreal[k] = sumreal;
				outimag[k] = sumimag;
			}
		}
}
