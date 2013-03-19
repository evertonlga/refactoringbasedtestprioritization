package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    int[] var3 = new int[] { 100, 1, (-1)};
    int var4 = p1.C.max(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    int[] var1 = new int[] { 10};
    boolean var3 = p1.B.binarySearch(var1, 100);
    int var4 = p1.C.max(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    java.util.List var1 = p1.C.primeFactors(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    java.util.List var1 = p1.C.primeFactors2((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var1 = p1.C.fastFibonacciMatrix((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    int[] var3 = new int[] { (-1), (-1), (-1)};
    int var4 = p1.C.max(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    java.math.BigInteger[] var0 = new java.math.BigInteger[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var2 = p1.C.pow(var0, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    int var2 = p1.C.greatestCommonDivisor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    java.math.BigInteger[] var0 = new java.math.BigInteger[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var2 = p1.C.pow(var0, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    p1.C var0 = new p1.C();

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 10, 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(10);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p1.C.pow(var2, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    double var1 = p1.C.convertKmToMi((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.621d));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 10, 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.shellSort(var1);
    long var3 = var0.test();
    long var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 49L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 49L);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    double var1 = p1.C.convertKmToMi(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 62.1d);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 0, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


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

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    p1.B var0 = new p1.B();
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

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    int[] var1 = new int[] { 10};
    boolean var3 = p1.B.binarySearch(var1, 100);
    p1.C.reverse(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.shellSort(var1);
    boolean var4 = p1.B.sequentialSeach(var2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    java.math.BigInteger var1 = p1.C.slowFibonacci(1);
    java.math.BigInteger var3 = p1.C.fastFibonacciMatrix(10);
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


    java.util.List var1 = p1.C.calcPrimeNumbers(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    java.util.List var1 = p1.C.calcPrimeNumbers(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    java.util.List var1 = p1.C.calcPrimeNumbers(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.shellSort(var1);
    p1.C.shuffleArray(var2);
    p1.C.reverse(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 1, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    double var1 = p1.C.convertKmToMi(62.1d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 38.5641d);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    int[] var2 = new int[] { 10, 10};
    int var3 = p1.C.max(var2);
    p1.C.shuffleArray(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", (-1), 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

//  public void test32() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test32");
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

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    p1.A var0 = new p1.A();
    p1.B var1 = new p1.B();
    int[] var2 = new int[] { };
    int[] var3 = var1.shellSort(var2);
    int[] var4 = var0.InsertionSort(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    p1.A var0 = new p1.A();
    p1.B var1 = new p1.B();
    int[] var2 = new int[] { };
    int[] var3 = var1.shellSort(var2);
    int[] var4 = var0.shellSort(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    java.util.List var1 = p1.C.primeFactors(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    int var2 = p1.C.greatestCommonDivisor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    java.util.List var1 = p1.C.calcPrimeNumbers(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    java.util.List var1 = p1.C.primeFactors2(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    java.math.BigInteger var1 = p1.C.slowFibonacci(1);
    java.math.BigInteger var3 = p1.C.slowFibonacci(1);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 10, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

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


    java.util.List var1 = p1.C.primeFactors(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    java.util.List var1 = p1.C.primeFactors2(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    java.util.List var1 = p1.C.primeFactors2(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    int var2 = p1.C.greatestCommonDivisor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    java.util.List var1 = p1.C.primeFactors2(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.shellSort(var1);
    p1.C.shuffleArray(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = p1.C.max(var2);
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


    int[] var0 = new int[] { };
    p1.C.reverse(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = p1.C.max(var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(0);
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

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    double var1 = p1.C.convertKmToMi(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.21d);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    double var1 = p1.C.convertKmToMi(38.5641d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.948306100000003d);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    int var2 = p1.C.greatestCommonDivisor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    java.util.List var1 = p1.C.primeFactors(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

//  public void test54() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test54");
//
//
//    double var1 = p1.C.convertKmToMi(Double.NaN);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var1 == Double.NaN);
//
//  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 100, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", (-1), 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

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


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", (-1), 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    int[] var1 = new int[] { 10};
    boolean var3 = p1.B.binarySearch(var1, 100);
    p1.C.shuffleArray(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 100, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    double var1 = p1.C.convertKmToMi((-0.621d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.385641d));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 1, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    java.util.List var1 = p1.C.calcPrimeNumbers((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    java.util.List var1 = p1.C.primeFactors((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    int var2 = p1.C.greatestCommonDivisor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    int var2 = p1.C.greatestCommonDivisor((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 100, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    double var1 = p1.C.convertKmToMi(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 1, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    java.math.BigInteger var1 = p1.C.slowFibonacci((-1));
    java.math.BigInteger var3 = p1.C.slowFibonacci((-1));
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("", 0, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(10);
    java.math.BigInteger var3 = p1.C.fastFibonacciMatrix(1);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    java.math.BigInteger var1 = p1.C.slowFibonacci(10);
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

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    p1.A var0 = new p1.A();
    int[] var1 = new int[] { };
    p1.C.reverse(var1);
    int[] var3 = var0.InsertionSort(var1);
    p1.C.shuffleArray(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    int var2 = p1.C.greatestCommonDivisor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 100, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    int var2 = p1.C.greatestCommonDivisor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    int[] var0 = new int[] { };
    p1.C.reverse(var0);
    boolean var3 = p1.B.sequentialSeach(var0, 0);
    p1.C.shuffleArray(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

//  public void test79() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test79");
//
//
//    double[] var0 = new double[] { };
//    double var1 = p1.C.mean(var0);
//    double var2 = p1.C.mean(var0);
//    double var3 = p1.C.mean(var0);
//    double var4 = p1.C.mean(var0);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertNotNull(var0);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var1 == Double.NaN);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var2 == Double.NaN);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var3 == Double.NaN);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var4 == Double.NaN);
//
//  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    int[] var0 = new int[] { };
    p1.C.reverse(var0);
    boolean var3 = p1.B.sequentialSeach(var0, 0);
    p1.C.reverse(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    int[] var2 = new int[] { 10, 10};
    int var3 = p1.C.max(var2);
    int var4 = p1.C.max(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    int var2 = p1.C.greatestCommonDivisor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    int var2 = p1.C.greatestCommonDivisor(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

//  public void test84() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test84");
//
//
//    p1.B var0 = new p1.B();
//    long var1 = var0.test();
//    long var3 = var0.k(0);
//    long var4 = var0.test();
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var1 == 49L);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var3 == 49L);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var4 == 49L);
//
//  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    java.math.BigInteger var1 = p1.C.fastFibonacciDoubling(0);
    java.math.BigInteger var3 = p1.C.fastFibonacciDoubling(1);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(10);
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

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p1.C.getInt("hi!", 100, 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    java.math.BigInteger var1 = p1.C.fastFibonacciMatrix(1);
    java.math.BigInteger var3 = p1.C.fastFibonacciMatrix(100);
    java.math.BigInteger var4 = p1.C.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

//  public void test89() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test89");
//
//
//    p1.B var0 = new p1.B();
//    int[] var1 = new int[] { };
//    int[] var2 = var0.shellSort(var1);
//    long var4 = var0.k(1);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertNotNull(var1);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertNotNull(var2);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var4 == 49L);
//
//  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


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

    if (debug) System.out.printf("%nRandoopTest0.test91");


    int var2 = p1.C.greatestCommonDivisor(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    p1.B var0 = new p1.B();
    int[] var1 = new int[] { };
    int[] var2 = var0.shellSort(var1);
    p1.C.reverse(var2);
    p1.C.reverse(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    int var2 = p1.C.greatestCommonDivisor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    int var2 = p1.C.greatestCommonDivisor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    double[] var1 = new double[] { 1.0d};
    double var2 = p1.C.mean(var1);
    double var3 = p1.C.mean(var1);
    double var4 = p1.C.mean(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    int var2 = p1.C.greatestCommonDivisor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

//  public void test97() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test97");
//
//
//    p1.B var0 = new p1.B();
//    long var2 = var0.k((-1));
//    long var4 = var0.k(0);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var2 == 49L);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var4 == 49L);
//
//  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    int[] var2 = new int[] { 1, 10};
    boolean var4 = p1.B.sequentialSeach(var2, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    int var2 = p1.C.greatestCommonDivisor(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    java.math.BigInteger var1 = p1.C.slowFibonacci(100);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p1.C.pow(var2, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }
  
  public void test101() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test1");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p1.C.getInt("hi!", 1, 0);
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

public void test102() throws Throwable {

  if (debug) System.out.printf("%nRandoopTest26.test53");


  int var2 = p1.C.greatestCommonDivisor((-2), (-11));
  
  // Regression assertion (captures the current behavior of the code)
  assertTrue(var2 == (-1));

}

public void test103() throws Throwable {

  if (debug) System.out.printf("%nRandoopTest26.test54");


  int var2 = p1.C.greatestCommonDivisor(1, (-2));
  
  // Regression assertion (captures the current behavior of the code)
  assertTrue(var2 == 1);

}

public void test104() throws Throwable {

  if (debug) System.out.printf("%nRandoopTest26.test55");


  // The following exception was thrown during execution.
  // This behavior will recorded for regression testing.
  try {
    int var3 = p1.C.getInt("hi!", (-2), (-101));
    fail("Expected exception of type java.lang.NumberFormatException");
  } catch (java.lang.NumberFormatException e) {
    // Expected exception.
  }

}

public void test105() throws Throwable {

  if (debug) System.out.printf("%nRandoopTest26.test56");


  // The following exception was thrown during execution.
  // This behavior will recorded for regression testing.
  try {
    int var3 = p1.C.getInt("", (-2), 1);
    fail("Expected exception of type java.lang.NumberFormatException");
  } catch (java.lang.NumberFormatException e) {
    // Expected exception.
  }

}

public void test106() throws Throwable {

  if (debug) System.out.printf("%nRandoopTest26.test57");


  int var2 = p1.C.greatestCommonDivisor(100, (-2));
  
  // Regression assertion (captures the current behavior of the code)
  assertTrue(var2 == (-2));

}


}
