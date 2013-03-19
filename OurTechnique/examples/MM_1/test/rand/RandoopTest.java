package rand;

import junit.framework.*;

public class RandoopTest extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    double var1 = p1.C.convertKmToMi(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 62.1d);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    java.util.List var1 = p1.C.primeFactors(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    java.math.BigInteger[] var0 = new java.math.BigInteger[] { };
    java.math.BigInteger[] var1 = new java.math.BigInteger[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var2 = p1.C.multiply(var0, var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    double[] var3 = new double[] { 10.0d, (-1.0d), 10.0d};
    double var4 = p1.C.mean(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 6.333333333333333d);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    java.util.List var1 = p1.C.primeFactors2(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    int[] var0 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = p1.C.max(var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

//  public void test7() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test7");
//
//
//    p1.C.move(1, (-1), 1);
//
//  }

//  public void test8() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test8");
//
//
//    // The following exception was thrown during execution.
//    // This behavior will recorded for regression testing.
//    try {
//      p1.C.move(100, 1, 10);
//      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//    } catch (Exception e) {
//      // Expected exception.
//    }
//
//  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    java.math.BigInteger var1 = p1.C.slowFibonacci(0);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    java.math.BigInteger[] var4 = p1.C.pow(var2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    p1.A var0 = new p1.A();
    int[] var1 = new int[] { };
    int[] var2 = var0.shellSort(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.max(var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    p1.A var0 = new p1.A();
    int[] var3 = new int[] { (-1), 1};
    int[] var4 = var0.InsertionSort(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    java.util.List var1 = p1.C.calcPrimeNumbers(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 100, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(1);
    java.math.BigInteger var3 = p1.C.fastFibonacciMatrix(0);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

//  public void test15() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test15");
//
//
//    p1.C.move(10, (-1), 1);
//
//  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    java.util.List var1 = p1.C.primeFactors(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    java.util.List var1 = p1.C.calcPrimeNumbers(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    java.util.List var1 = p1.C.calcPrimeNumbers(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    java.util.List var1 = p1.C.primeFactors(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    int[] var3 = new int[] { 1, 1, 100};
    p1.C.reverse(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    java.util.List var1 = p1.C.primeFactors2((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var1 = p1.C.fastFibonacciMatrix((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    java.math.BigInteger var1 = p1.C.slowFibonacci(1);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p1.C.pow(var2, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    java.util.List var1 = p1.C.primeFactors2(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(1);
    java.math.BigInteger var3 = p1.C.slowFibonacci(1);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    double var1 = p1.C.convertKmToMi(6.333333333333333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.933d);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    p1.A var0 = new p1.A();
    int[] var2 = new int[] { 10};
    int[] var3 = var0.mergeSort(var2);
    p1.C.shuffleArray(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

//  public void test28() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test28");
//
//
//    p1.A var0 = new p1.A();
//    int[] var1 = new int[] { };
//    int[] var2 = var0.shellSort(var1);
//    long var3 = var0.k();
//    long var4 = var0.k();
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertNotNull(var1);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertNotNull(var2);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var3 == 29L);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var4 == 29L);
//
//  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    double var1 = p1.C.convertKmToMi(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    int var2 = p1.C.greatestCommonDivisor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    java.util.List var1 = p1.C.primeFactors2(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    p1.A var0 = new p1.A();
    int[] var3 = new int[] { 10, 0};
    int[] var4 = var0.bubbleSort(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 0, 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    java.util.List var1 = p1.C.calcPrimeNumbers(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", (-1), 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    p1.A var0 = new p1.A();
    int[] var2 = new int[] { 10};
    int[] var3 = var0.mergeSort(var2);
    p1.C.shuffleArray(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    p1.A var0 = new p1.A();
    int[] var2 = new int[] { 10};
    int[] var3 = var0.mergeSort(var2);
    p1.C.reverse(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    double var1 = p1.C.convertKmToMi(3.933d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.442393d);

  }

//  public void test39() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test39");
//
//
//    p1.C.move(0, (-1), 0);
//
//  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    int[] var0 = new int[] { };
    int var4 = p1.B.recursiveBinarySearch(var0, 100, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-101));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(0);
    java.math.BigInteger var3 = p1.C.slowFibonacci(0);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    java.util.List var1 = p1.C.primeFactors2((-101));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

//  public void test43() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test43");
//
//
//    // The following exception was thrown during execution.
//    // This behavior will recorded for regression testing.
//    try {
//      java.math.BigInteger var1 = p1.C.fastFibonacciDoubling((-101));
//      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//    } catch (Exception e) {
//      // Expected exception.
//    }
//
//  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

//  public void test45() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test45");
//
//
//    // The following exception was thrown during execution.
//    // This behavior will recorded for regression testing.
//    try {
//      java.math.BigInteger var1 = p1.C.fastFibonacciDoubling((-1));
//      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//    } catch (Exception e) {
//      // Expected exception.
//    }
//
//  }

//  public void test46() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test46");
//
//
//    p1.C.move(10, 0, 0);
//
//  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    double var1 = p1.C.convertKmToMi(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.21d);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    int var2 = p1.C.greatestCommonDivisor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var1 = p1.C.calcPrimeNumbers((-101));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(0);
    java.math.BigInteger var3 = p1.C.slowFibonacci((-1));
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }
  
  
  public void test51() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test1");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("", (-1), (-101));
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

	  public void test52() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test2");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("", 100, 0);
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

	  public void test53() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test3");


	    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(10);
	    java.math.BigInteger var3 = p1.C.fastFibonacciDoubling(0);
	    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var4);

	  }

	  public void test54() throws Throwable {

	    if (debug) System.out.printf("%nRandooptest_1.test_4");


	    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(0);
	    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      java.math.BigInteger[] var4 = p1.C.pow(var2, 100);
	      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
	    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
	      // Expected exception.
	    }
	    
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var2);

	  }

	  public void test55() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test5");


	    p1.A var0 = new p1.A();
	    int[] var1 = new int[] { };
	    int[] var2 = var0.shellSort(var1);
	    boolean var4 = p1.B.binarySearch(var1, 100);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var2);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == false);

	  }

	  public void test56() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test6");


	    int var2 = p1.C.greatestCommonDivisor(100, (-1));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == (-1));

	  }

	  public void test57() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test7");


	    java.math.BigInteger var1 = p1.C.slowFibonacci(0);
	    java.math.BigInteger var3 = p1.C.slowFibonacci(1);
	    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var4);

	  }

	  public void test58() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test8");


	    p1.C var0 = new p1.C();
	    long var1 = var0.test();
	    boolean var2 = var0.validation();
	    long var3 = var0.test();
	    long var4 = var0.test();
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == true);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == 18L);

	  }

	  public void test59() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test9");


	    double var1 = p1.C.convertKmToMi(1.0d);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == 0.621d);

	  }

	  public void test60() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test10");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("hi!", 0, 0);
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

	  public void test61() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test11");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("hi!", (-1), (-101));
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

	  public void test62() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test12");


	    java.util.List var1 = p1.C.primeFactors((-1));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);

	  }

	  public void test63() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test13");


	    int var2 = p1.C.greatestCommonDivisor((-1), 10);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == (-1));

	  }

	  public void test64() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test14");


	    int[] var1 = new int[] { 100};
	    p1.C.shuffleArray(var1);
	    int var3 = p1.C.max(var1);
	    p1.C.shuffleArray(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == 100);

	  }

	//  public void test15() throws Throwable {
	//
//	    if (debug) System.out.printf("%nRandoopTest1.test15");
	//
	//
//	    p1.C.move(10, 1, (-1));
	//
	//  }
	//
	//  public void test16() throws Throwable {
	//
//	    if (debug) System.out.printf("%nRandoopTest1.test16");
	//
	//
//	    // The following exception was thrown during execution.
//	    // This behavior will recorded for regression testing.
//	    try {
//	      p1.C.move(100, 1, 1);
//	      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//	    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//	      // Expected exception.
//	    }
	//
	//  }
	//
	//  public void test17() throws Throwable {
	//
//	    if (debug) System.out.printf("%nRandoopTest1.test17");
	//
	//
//	    p1.C.move(0, (-101), (-101));
	//
	//  }

	  public void test68() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test18");


	    int var2 = p1.C.greatestCommonDivisor((-101), 10);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == (-1));

	  }

	  public void test69() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test19");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("hi!", 10, 100);
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

	  public void test70() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test20");


	    p1.C var0 = new p1.C();
	    long var1 = var0.k();
	    long var2 = var0.k();
	    boolean var3 = var0.validation();
	    boolean var4 = var0.validation();
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == true);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == true);

	  }

	  public void test71() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test21");


	    java.util.List var1 = p1.C.primeFactors((-101));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);

	  }

	  public void test72() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test22");


	    p1.A var0 = new p1.A();
	    int[] var1 = new int[] { };
	    int[] var2 = var0.shellSort(var1);
	    p1.C.reverse(var2);
	    p1.C.shuffleArray(var2);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var2);

	  }

	//  public void test23() throws Throwable {
	//
//	    if (debug) System.out.printf("%nRandoopTest1.test23");
	//
	//
//	    // The following exception was thrown during execution.
//	    // This behavior will recorded for regression testing.
//	    try {
//	      p1.C.move(100, (-1), 1);
//	      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//	    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//	      // Expected exception.
//	    }
	//
	//  }

	  public void test74() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test24");


	    double[] var1 = new double[] { (-1.0d)};
	    double var2 = p1.C.mean(var1);
	    double var3 = p1.C.mean(var1);
	    double var4 = p1.C.mean(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == (-1.0d));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == (-1.0d));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == (-1.0d));

	  }

	  public void test75() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test25");


	    double var1 = p1.C.convertKmToMi(62.1d);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == 38.5641d);

	  }

	  public void test76() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test26");


	    double var1 = p1.C.convertKmToMi(6.21d);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == 3.85641d);

	  }

	  public void test77() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test27");


	    p1.A var0 = new p1.A();
	    int[] var2 = new int[] { 10};
	    int[] var3 = var0.mergeSort(var2);
	    int var4 = p1.C.max(var2);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var2);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == 10);

	  }

	  public void test78() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test28");


	    int[] var0 = new int[] { };
	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      boolean var4 = p1.B.ternarySearch(var0, 10, (-101), (-101));
	      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
	    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
	      // Expected exception.
	    }
	    
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var0);

	  }

	  public void test79() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test29");


	    int[] var3 = new int[] { 10, 10, (-1)};
	    p1.C.reverse(var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var3);

	  }

	  public void test80() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test30");


	    int var2 = p1.C.greatestCommonDivisor(10, 0);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == 10);

	  }

	  public void test81() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test31");


	    int var2 = p1.C.greatestCommonDivisor((-1), 1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == 1);

	  }

	  public void test82() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test32");


	    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(0);
	    java.math.BigInteger var3 = p1.C.fastFibonacciDoubling(10);
	    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var4);

	  }

	  public void test83() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test33");


	    p1.A var0 = new p1.A();
	    int[] var1 = new int[] { };
	    int[] var2 = var0.shellSort(var1);
	    p1.C.shuffleArray(var1);
	    p1.C.reverse(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var2);

	  }

	  public void test84() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test34");


	    int[] var1 = new int[] { 100};
	    p1.C.shuffleArray(var1);
	    boolean var4 = p1.B.sequentialSeach(var1, (-1));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == false);

	  }

	//  public void test35() throws Throwable {
	//
//	    if (debug) System.out.printf("%nRandoopTest1.test35");
	//
	//
//	    // The following exception was thrown during execution.
//	    // This behavior will recorded for regression testing.
//	    try {
//	      p1.C.move(100, 1, 100);
//	      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//	    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//	      // Expected exception.
//	    }
	//
	//  }

	  public void test86() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test36");


	    int[] var1 = new int[] { 1};
	    boolean var3 = p1.B.binarySearch(var1, 1);
	    p1.C.shuffleArray(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == true);

	  }

	//  public void test37() throws Throwable {
	//
//	    if (debug) System.out.printf("%nRandoopTest1.test37");
	//
	//
//	    p1.A var0 = new p1.A();
//	    int[] var2 = new int[] { 10};
//	    int[] var3 = var0.mergeSort(var2);
//	    long var4 = var0.k();
	//    
//	    // Regression assertion (captures the current behavior of the code)
//	    assertNotNull(var2);
	//    
//	    // Regression assertion (captures the current behavior of the code)
//	    assertNotNull(var3);
	//    
//	    // Regression assertion (captures the current behavior of the code)
//	    assertTrue(var4 == 29L);
	//
	//  }

	  public void test88() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test38");


	    p1.C var0 = new p1.C();
	    long var1 = var0.k();
	    long var2 = var0.k();
	    long var3 = var0.k();
	    long var4 = var0.k();
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == 18L);

	  }

	  public void test89() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test39");


	    int var2 = p1.C.greatestCommonDivisor(1, 10);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == 1);

	  }

	  public void test90() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test40");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("", 0, 1);
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

	  public void test91() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test41");


	    int var2 = p1.C.greatestCommonDivisor(0, (-101));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == (-101));

	  }

	  public void test92() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test42");


	    int var2 = p1.C.greatestCommonDivisor(10, 1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == 1);

	  }

	  public void test93() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test43");


	    java.util.List var1 = p1.C.calcPrimeNumbers((-1));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);

	  }

	  public void test94() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test44");


	    p1.A var0 = new p1.A();
	    int[] var1 = new int[] { };
	    int[] var2 = var0.shellSort(var1);
	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.max(var1);
	      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
	    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
	      // Expected exception.
	    }
	    
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var2);

	  }

	  public void test95() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test45");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      java.math.BigInteger var1 = p1.C.fastFibonacciMatrix((-101));
	      fail("Expected exception of type java.lang.IllegalArgumentException");
	    } catch (java.lang.IllegalArgumentException e) {
	      // Expected exception.
	    }

	  }

	  public void test96() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test46");


	    p1.A var0 = new p1.A();
	    int[] var1 = new int[] { };
	    int[] var2 = var0.shellSort(var1);
	    boolean var4 = p1.B.sequentialSeach(var1, 1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var2);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == false);

	  }

	  public void test97() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test47");


	    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(100);
	    java.math.BigInteger var3 = p1.C.slowFibonacci(1);
	    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var1);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var3);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var4);

	  }

	  public void test98() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test48");


	    p1.C var0 = new p1.C();
	    long var1 = var0.k();
	    long var2 = var0.test();
	    long var3 = var0.k();
	    long var4 = var0.test();
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == 18L);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == 18L);

	  }

	  public void test99() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test49");


	    p1.C var0 = new p1.C();
	    boolean var1 = var0.validation();
	    boolean var2 = var0.validation();
	    boolean var3 = var0.validation();
	    long var4 = var0.test();
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var1 == true);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == true);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var3 == true);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == 18L);

	  }

	  public void test100() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test50");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("", 100, (-101));
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }
	  
	  public void test101() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test1");


		    java.util.List var1 = p1.C.primeFactors(1);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);

		  }

		//  public void test2() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test2");
		//
		//
//		    p1.C.move(1, 1, (-101));
		//
		//  }

		  public void test103() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test3");


		    p1.A var0 = new p1.A();
		    int[] var1 = new int[] { };
		    int[] var2 = var0.shellSort(var1);
		    p1.C.shuffleArray(var1);
		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var4 = p1.C.max(var1);
		      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
		    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
		      // Expected exception.
		    }
		    
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var2);

		  }

		  public void test104() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test4");


		    p1.C var0 = new p1.C();
		    long var1 = var0.k();
		    long var2 = var0.test();
		    long var3 = var0.k();
		    long var4 = var0.k();
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 18L);

		  }

		//  public void test5() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test5");
		//
		//
//		    p1.C.move(1, 100, 0);
		//
		//  }

		  public void test106() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test6");


		    int var2 = p1.C.greatestCommonDivisor((-101), (-1));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == (-1));

		  }

		  public void test107() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test7");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("", 1, 10);
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		//  public void test8() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test8");
		//
		//
//		    p1.C.move(1, 100, (-101));
		//
		//  }

		  public void test109() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test9");


		    int var2 = p1.C.greatestCommonDivisor((-101), 0);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == (-101));

		  }

		  public void test110() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test10");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("hi!", 10, 10);
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		  public void test111() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test11");


		    java.util.List var1 = p1.C.primeFactors2(100);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);

		  }

		  public void test112() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test12");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("", 100, (-1));
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		  public void test113() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test13");


		    int var2 = p1.C.greatestCommonDivisor(10, (-101));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == (-1));

		  }

		//  public void test14() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test14");
		//
		//
//		    // The following exception was thrown during execution.
//		    // This behavior will recorded for regression testing.
//		    try {
//		      p1.C.move(100, 100, 100);
//		      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//		    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//		      // Expected exception.
//		    }
		//
		//  }

		//  public void test15() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test15");
		//
		//
//		    p1.C.move(0, 100, 1);
		//
		//  }

		  public void test116() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test16");


		    java.math.BigInteger var1 = p1.C.slowFibonacci((-101));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);

		  }

		  public void test117() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test17");


		    int var2 = p1.C.greatestCommonDivisor(10, 10);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 10);

		  }

		  public void test118() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test18");


		    p1.C var0 = new p1.C();
		    long var1 = var0.k();
		    long var2 = var0.k();
		    long var3 = var0.k();
		    long var4 = var0.test();
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 18L);

		  }

		//  public void test19() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test19");
		//
		//
//		    p1.C.move(0, 1, (-101));
		//
		//  }

		  public void test120() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test20");


		    int var2 = p1.C.greatestCommonDivisor((-1), (-1));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == (-1));

		  }

		  public void test121() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test21");


		    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(10);
		    java.math.BigInteger var3 = p1.C.fastFibonacciMatrix(1);
		    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var3);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var4);

		  }

		  public void test122() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test22");


		    p1.A var0 = new p1.A();
		    int[] var2 = new int[] { 10};
		    int[] var3 = var0.mergeSort(var2);
		    p1.C.reverse(var3);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var2);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var3);

		  }

		  public void test123() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test23");


		    double[] var0 = new double[] { };
		    double var1 = p1.C.mean(var0);
		    double var2 = p1.C.mean(var0);
		    double var3 = p1.C.mean(var0);
		    double var4 = p1.C.mean(var0);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var0);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == Double.NaN);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == Double.NaN);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == Double.NaN);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == Double.NaN);

		  }

		  public void test124() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test24");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("hi!", 100, (-101));
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		  public void test125() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test25");


		    double var1 = p1.C.convertKmToMi(0.621d);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == 0.385641d);

		  }

		  public void test126() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test26");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("hi!", 1, 1);
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		  public void test127() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test27");


		    int[] var1 = new int[] { 100};
		    p1.C.shuffleArray(var1);
		    int var3 = p1.C.max(var1);
		    p1.C.reverse(var1);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == 100);

		  }

		  public void test128() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test28");


		    p1.C var0 = new p1.C();
		    long var1 = var0.test();
		    boolean var2 = var0.validation();
		    long var3 = var0.test();
		    long var4 = var0.k();
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == true);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 18L);

		  }

		  public void test129() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test29");


		    p1.C var0 = new p1.C();
		    long var1 = var0.k();
		    long var2 = var0.test();
		    long var3 = var0.test();
		    long var4 = var0.k();
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 18L);

		  }

		  public void test130() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test30");


		    p1.A var0 = new p1.A();
		    int[] var2 = new int[] { 100};
		    p1.C.shuffleArray(var2);
		    int[] var4 = var0.InsertionSort(var2);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var2);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var4);

		  }

		  public void test131() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test31");


		    double var1 = p1.C.convertKmToMi(Double.NaN);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == Double.NaN);

		  }

		  public void test132() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test32");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("", 1, 0);
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		  public void test133() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test33");


		    double var1 = p1.C.convertKmToMi(3.85641d);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == 2.39483061d);

		  }

		  public void test134() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test34");


		    int var2 = p1.C.greatestCommonDivisor((-1), (-101));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == (-1));

		  }

		  public void test135() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test35");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("hi!", (-101), (-101));
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		//  public void test36() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test36");
		//
		//
//		    p1.C.move(1, 100, 100);
		//
		//  }

		  public void test137() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test37");


		    p1.C var0 = new p1.C();
		    boolean var1 = var0.validation();
		    long var2 = var0.test();
		    boolean var3 = var0.validation();
		    long var4 = var0.k();
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == true);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == true);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 18L);

		  }

		  public void test138() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test38");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("hi!", 1, 100);
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		  public void test139() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test39");


		    p1.C var0 = new p1.C();
		    long var1 = var0.test();
		    long var2 = var0.k();
		    long var3 = var0.test();
		    long var4 = var0.test();
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == 18L);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 18L);

		  }

		  public void test140() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test40");


		    int var2 = p1.C.greatestCommonDivisor(0, 0);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 0);

		  }

		//  public void test41() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test41");
		//
		//
//		    // The following exception was thrown during execution.
//		    // This behavior will recorded for regression testing.
//		    try {
//		      p1.C.move(100, 100, 10);
//		      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//		    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//		      // Expected exception.
//		    }
		//
		//  }

		  public void test142() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test42");


		    p1.C var0 = new p1.C();
		    boolean var1 = var0.validation();
		    boolean var2 = var0.validation();
		    boolean var3 = var0.validation();
		    long var4 = var0.k();
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var1 == true);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == true);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var3 == true);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 18L);

		  }

		  public void test143() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test43");


		    int var2 = p1.C.greatestCommonDivisor(100, 1);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var2 == 1);

		  }

		  public void test144() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test44");


		    int[] var0 = new int[] { };
		    int var4 = p1.B.recursiveBinarySearch(var0, 10, (-1), (-1));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var0);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == (-11));

		  }

		  public void test145() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test45");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("hi!", 10, (-1));
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

		//  public void test46() throws Throwable {
		//
//		    if (debug) System.out.printf("%nRandoopTest2.test46");
		//
		//
//		    // The following exception was thrown during execution.
//		    // This behavior will recorded for regression testing.
//		    try {
//		      java.math.BigInteger var1 = p1.C.fastFibonacciDoubling((-11));
//		      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//		    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//		      // Expected exception.
//		    }
		//
		//  }

		  public void test147() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test47");


		    java.util.List var1 = p1.C.primeFactors((-11));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);

		  }

		  public void test148() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test48");


		    double[] var3 = new double[] { (-1.0d), 10.0d, 10.0d};
		    double var4 = p1.C.mean(var3);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var3);
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertTrue(var4 == 6.333333333333333d);

		  }

		  public void test149() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test49");


		    java.util.List var1 = p1.C.primeFactors2((-11));
		    
		    // Regression assertion (captures the current behavior of the code)
		    assertNotNull(var1);

		  }

		  public void test150() throws Throwable {

		    if (debug) System.out.printf("%nRandoopTest2.test50");


		    // The following exception was thrown during execution.
		    // This behavior will recorded for regression testing.
		    try {
		      int var3 = p1.C.getInt("hi!", 0, 100);
		      fail("Expected exception of type java.lang.NumberFormatException");
		    } catch (java.lang.NumberFormatException e) {
		      // Expected exception.
		    }

		  }

}
