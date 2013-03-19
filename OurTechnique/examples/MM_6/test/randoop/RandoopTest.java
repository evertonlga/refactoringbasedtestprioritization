package randoop;

import junit.framework.*;

public class RandoopTest extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var1 = p1.C.fastFibonacciMatrix((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(0);
    java.math.BigInteger var3 = p1.C.fastFibonacciDoubling(10);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    int[] var2 = new int[] { 0, 1};
    boolean var4 = p1.B.sequentialSeach(var2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    int[] var1 = new int[] { 10};
    boolean var3 = p1.B.sequentialSeach(var1, 100);
    int var4 = p1.C.max(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    p1.C var0 = new p1.C();

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", (-1), 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    int var2 = p1.C.greatestCommonDivisor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    int[] var1 = new int[] { 10};
    boolean var3 = p1.B.sequentialSeach(var1, 100);
    p1.C.shuffleArray(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    double[] var2 = new double[] { 0.0d, (-1.0d)};
    double var3 = p1.C.mean(var2);
    double var4 = p1.C.mean(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.5d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-0.5d));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", (-1), 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    java.util.List var1 = p1.C.calcPrimeNumbers(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    java.util.List var1 = p1.C.primeFactors2(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(10);
    java.math.BigInteger var3 = p1.C.fastFibonacciDoubling(10);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    int var2 = p1.C.greatestCommonDivisor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    java.util.List var1 = p1.C.primeFactors(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    java.util.List var1 = p1.C.primeFactors(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    java.util.List var1 = p1.C.calcPrimeNumbers(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", (-1), 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    java.util.List var1 = p1.C.primeFactors(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    p1.B var0 = new p1.B();
    long var1 = var0.m();
    int[] var2 = new int[] { };
    int[] var3 = var0.bubbleSort(var2);
    p1.C.shuffleArray(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    int var2 = p1.C.greatestCommonDivisor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(100);
    java.math.BigInteger var3 = p1.C.slowFibonacci(100);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    int[] var1 = new int[] { 10};
    boolean var3 = p1.B.sequentialSeach(var1, 100);
    p1.C.reverse(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    int var2 = p1.C.greatestCommonDivisor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    int[] var0 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = p1.B.recursiveBinarySearch(var0, (-1), 100, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    p1.B var0 = new p1.B();
    long var1 = var0.m();
    int[] var2 = new int[] { };
    int[] var3 = var0.bubbleSort(var2);
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    double var1 = p1.C.convertKmToMi(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.21d);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.bubbleSort(var1);
    boolean var4 = p1.B.sequentialSeach(var2, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    int var2 = p1.C.greatestCommonDivisor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    java.util.List var1 = p1.C.calcPrimeNumbers(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 1, 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 0, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    java.util.List var1 = p1.C.primeFactors2((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    int var2 = p1.C.greatestCommonDivisor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    int var2 = p1.C.greatestCommonDivisor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    int var2 = p1.C.greatestCommonDivisor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.bubbleSort(var1);
    long var3 = var0.m();
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    p1.A var0 = new p1.A();
    int[] var1 = new int[] { };
    int[] var2 = var0.InsertionSort(var1);
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

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    java.math.BigInteger var1 = p1.C.slowFibonacci((-1));
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p1.C.pow(var2, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    double var1 = p1.C.convertKmToMi((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.621d));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    int var2 = p1.C.greatestCommonDivisor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 100, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 1, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    double var1 = p1.C.convertKmToMi(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 62.1d);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    p1.A var0 = new p1.A();
    p1.A var1 = new p1.A();
    int[] var2 = new int[] { };
    int[] var3 = var1.InsertionSort(var2);
    int[] var4 = var0.mergeSort(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    p1.A var0 = new p1.A();
    int[] var1 = new int[] { };
    int[] var2 = var0.InsertionSort(var1);
    p1.C.reverse(var1);
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

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    double var1 = p1.C.convertKmToMi((-0.621d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.385641d));

  }

//  public void test49() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test49");
//
//
//    // The following exception was thrown during execution.
//    // This behavior will recorded for regression testing.
//    try {
//      java.math.BigInteger var1 = p1.C.fastFibonacciDoubling((-1));
//      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//      // Expected exception.
//    }
//
//  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    p1.C.shuffleArray(var1);
    int[] var3 = var0.selectionSort(var1);
    p1.C.shuffleArray(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    java.util.List var1 = p1.C.primeFactors2(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.bubbleSort(var1);
    long var3 = var0.m();
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    p1.C.shuffleArray(var1);
    int[] var3 = var0.selectionSort(var1);
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    java.util.List var1 = p1.C.calcPrimeNumbers((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.bubbleSort(var1);
    boolean var4 = p1.B.binarySearch(var1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


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

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 0, 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    java.util.List var1 = p1.C.calcPrimeNumbers(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(100);
    java.math.BigInteger var3 = p1.C.fastFibonacciMatrix(10);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    int var2 = p1.C.greatestCommonDivisor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    int var2 = p1.C.greatestCommonDivisor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    p1.C.shuffleArray(var1);
    int[] var3 = var0.selectionSort(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = p1.C.max(var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    p1.C.shuffleArray(var1);
    int[] var3 = var0.selectionSort(var1);
    p1.C.shuffleArray(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.bubbleSort(var1);
    long var3 = var0.m();
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    java.util.List var1 = p1.C.primeFactors2(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    int[] var0 = new int[] { };
    p1.C.shuffleArray(var0);
    p1.C.reverse(var0);
    boolean var4 = p1.B.binarySearch(var0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    p1.A var0 = new p1.A();
    int[] var2 = new int[] { 1};
    p1.C.reverse(var2);
    int[] var4 = var0.quickSort(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    double var1 = p1.C.convertKmToMi((-0.385641d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.239483061d));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    int var2 = p1.C.greatestCommonDivisor(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    java.util.List var1 = p1.C.primeFactors2(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    p1.B var0 = new p1.B();
    long var1 = var0.m();
    long var2 = var0.m();
    long var3 = var0.m();
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    double var1 = p1.C.convertKmToMi((-0.5d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.3105d));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    java.util.List var1 = p1.C.primeFactors((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    java.math.BigInteger var1 = p1.C.slowFibonacci(10);
    java.math.BigInteger var3 = p1.C.fastFibonacciDoubling(10);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    p1.B var0 = new p1.B();
    long var1 = var0.m();
    long var2 = var0.m();
    long var3 = var0.m();
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    int var2 = p1.C.greatestCommonDivisor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    int var2 = p1.C.greatestCommonDivisor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    double var1 = p1.C.convertKmToMi(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    p1.B var0 = new p1.B();
    long var1 = var0.m();
    long var2 = var0.m();
    long var3 = var0.m();
    long var4 = var0.m();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    double var1 = p1.C.convertKmToMi((-0.239483061d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.148718980881d));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    double var1 = p1.C.convertKmToMi(62.1d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 38.5641d);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 10, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    int[] var1 = new int[] { 1};
    p1.C.reverse(var1);
    boolean var4 = p1.B.binarySearch(var1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    p1.A var0 = new p1.A();
    int[] var1 = new int[] { };
    int[] var2 = var0.InsertionSort(var1);
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

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    double var1 = p1.C.convertKmToMi((-0.148718980881d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.092354487127101d));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 100, 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.bubbleSort(var1);
    boolean var4 = p1.B.sequentialSeach(var1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    int[] var3 = new int[] { 10, 0, 1};
    int var4 = p1.C.max(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    int[] var0 = new int[] { };
    p1.C.shuffleArray(var0);
    boolean var3 = p1.B.sequentialSeach(var0, 0);
    p1.C.shuffleArray(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", (-1), (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    java.util.List var1 = p1.C.primeFactors(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    int[] var2 = new int[] { 100, 1};
    p1.C.reverse(var2);
    p1.C.reverse(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 1, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    p1.A var0 = new p1.A();
    int[] var1 = new int[] { };
    int[] var2 = var0.InsertionSort(var1);
    p1.C.reverse(var1);
    p1.C.shuffleArray(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    int[] var1 = new int[] { 1};
    p1.C.reverse(var1);
    boolean var4 = p1.B.sequentialSeach(var1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 10, 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 100, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    int var2 = p1.C.greatestCommonDivisor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    p1.C.shuffleArray(var1);
    p1.C.reverse(var1);
    int[] var4 = var0.bubbleSort(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(100);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p1.C.pow(var2, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

}
