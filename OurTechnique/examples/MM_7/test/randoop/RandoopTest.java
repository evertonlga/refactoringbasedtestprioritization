package randoop;

import junit.framework.*;

public class RandoopTest extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    int var2 = p2.A_0.greatestCommonDivisor(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    int[] var0 = new int[] { };
    boolean var4 = p1.ClassId_1.ternarySearch(var0, 1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    java.util.List var1 = p2.A_0.primeFactors2((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    int var2 = p2.A_0.greatestCommonDivisor(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    int[] var0 = new int[] { };
    boolean var4 = p1.ClassId_1.ternarySearch(var0, (-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    java.math.BigInteger var1 = p2.A_0.slowFibonacci(0);
    java.math.BigInteger var3 = p2.A_0.slowFibonacci(0);
    java.math.BigInteger var4 = p2.A_0.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    java.util.List var1 = p2.A_0.primeFactors((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    int[] var0 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var1 = p2.A_0.max(var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(1L);
    long var4 = var0.m_0((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    java.util.List var1 = p2.A_0.primeFactors(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", 0, 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    double var1 = p2.A_0.convertKmToMi(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.621d);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    int var2 = p2.A_0.greatestCommonDivisor((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    java.util.List var1 = p2.A_0.primeFactors(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    int var2 = p2.A_0.greatestCommonDivisor(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    int var2 = p2.A_0.greatestCommonDivisor((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    p2.A_0 var0 = new p2.A_0();
    int[] var2 = new int[] { 1};
    int[] var3 = var0.mergeSort(var2);
    int var4 = p2.A_0.max(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    java.math.BigInteger var1 = p2.A_0.fastFibonacciDoubling(100);
    java.math.BigInteger var3 = p2.A_0.fastFibonacciMatrix(100);
    java.math.BigInteger var4 = p2.A_0.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    int var2 = p2.A_0.greatestCommonDivisor(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(0L);
    long var4 = var0.m_0(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("hi!", 10, 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    double var1 = p2.A_0.convertKmToMi(0.621d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.385641d);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(1L);
    long var3 = var0.methodid_0();
    long var4 = var0.methodid_0();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(0L);
    int[] var3 = new int[] { };
    int[] var4 = var0.InsertionSort(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    java.util.List var1 = p2.A_0.calcPrimeNumbers(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    int var2 = p2.A_0.greatestCommonDivisor(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    java.util.List var1 = p2.A_0.primeFactors(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    java.math.BigInteger var1 = p2.A_0.fastFibonacciDoubling(1);
    java.math.BigInteger var3 = p2.A_0.fastFibonacciMatrix(1);
    java.math.BigInteger var4 = p2.A_0.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    java.util.List var1 = p2.A_0.primeFactors2(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    p1.ClassId_1 var0 = new p1.ClassId_1();

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    java.util.List var1 = p2.A_0.primeFactors2(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    p2.A_0 var0 = new p2.A_0();
    int[] var2 = new int[] { 1};
    int[] var3 = var0.mergeSort(var2);
    int var4 = p2.A_0.max(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    java.util.List var1 = p2.A_0.primeFactors2(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    java.util.List var1 = p2.A_0.calcPrimeNumbers(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    int var2 = p2.A_0.greatestCommonDivisor(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    java.util.List var1 = p2.A_0.calcPrimeNumbers(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    int var2 = p2.A_0.greatestCommonDivisor((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    double var1 = p2.A_0.convertKmToMi(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3105d);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    java.math.BigInteger var1 = p2.A_0.slowFibonacci(0);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p2.A_0.pow(var2, 10);
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


    double[] var2 = new double[] { 1.0d, 0.0d};
    double var3 = p2.A_0.mean(var2);
    double var4 = p2.A_0.mean(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5d);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    double var1 = p2.A_0.convertKmToMi(0.3105d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1928205d);

  }

//  public void test42() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test42");
//
//
//    // The following exception was thrown during execution.
//    // This behavior will recorded for regression testing.
//    try {
//      java.math.BigInteger var1 = p2.A_0.fastFibonacciDoubling((-1));
//      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
//    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
//      // Expected exception.
//    }
//
//  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    int var2 = p2.A_0.greatestCommonDivisor(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    p2.A_0 var0 = new p2.A_0();
    int[] var2 = new int[] { 1};
    int[] var3 = var0.mergeSort(var2);
    long var4 = var0.methodid_0();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    java.util.List var1 = p2.A_0.calcPrimeNumbers(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    int var2 = p2.A_0.greatestCommonDivisor(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    p2.A_0 var0 = new p2.A_0();
    int[] var2 = new int[] { 1};
    int[] var3 = var0.mergeSort(var2);
    p2.A_0.reverse(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    java.util.List var1 = p2.A_0.primeFactors(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    java.math.BigInteger var1 = p2.A_0.fastFibonacciMatrix(1);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    java.math.BigInteger[] var4 = p2.A_0.pow(var2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    java.math.BigInteger var1 = p2.A_0.slowFibonacci(1);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p2.A_0.pow(var2, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var1 = p2.A_0.fastFibonacciMatrix((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    java.util.List var1 = p2.A_0.primeFactors2(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", (-1), 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    p2.A_0 var0 = new p2.A_0();
    int[] var2 = new int[] { 1};
    int[] var3 = var0.mergeSort(var2);
    p2.A_0.reverse(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("hi!", 0, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    double var1 = p2.A_0.convertKmToMi(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 62.1d);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", 1, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    java.util.List var1 = p2.A_0.calcPrimeNumbers((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0((-1L));
    long var3 = var0.methodid_0();
    long var4 = var0.methodid_0();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    java.math.BigInteger var1 = p2.A_0.fastFibonacciMatrix(0);
    java.math.BigInteger var3 = p2.A_0.slowFibonacci(10);
    java.math.BigInteger var4 = p2.A_0.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", 100, (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("hi!", (-1), 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    double var1 = p2.A_0.convertKmToMi(62.1d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 38.5641d);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    double var1 = p2.A_0.convertKmToMi(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(1L);
    long var4 = var0.m_0(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    java.math.BigInteger var1 = p2.A_0.fastFibonacciMatrix(0);
    java.math.BigInteger var3 = p2.A_0.fastFibonacciMatrix(0);
    java.math.BigInteger var4 = p2.A_0.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    java.math.BigInteger var1 = p2.A_0.fastFibonacciMatrix(1);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p2.A_0.pow(var2, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(1L);
    int[] var3 = new int[] { };
    int[] var4 = var0.mergeSort(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", (-1), 0);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    double var1 = p2.A_0.convertKmToMi(38.5641d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.948306100000003d);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    java.math.BigInteger var1 = p2.A_0.slowFibonacci(10);
    java.math.BigInteger var3 = p2.A_0.fastFibonacciMatrix(1);
    java.math.BigInteger var4 = p2.A_0.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("hi!", (-1), (-1));
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("hi!", 1, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(1L);
    long var4 = var0.m_0(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    int var2 = p2.A_0.greatestCommonDivisor(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    int[] var0 = new int[] { };
    boolean var2 = p1.ClassId_1.sequentialSeach(var0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.max(var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", 1, 100);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

//  public void test78() throws Throwable {
//
//    if (debug) System.out.printf("%nRandoopTest0.test78");
//
//
//    double var1 = p2.A_0.convertKmToMi(Double.NaN);
//    
//    // Regression assertion (captures the current behavior of the code)
//    assertTrue(var1 == Double.NaN);
//
//  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    int var2 = p2.A_0.greatestCommonDivisor(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    int var2 = p2.A_0.greatestCommonDivisor(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    int var2 = p2.A_0.greatestCommonDivisor((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    double var1 = p2.A_0.convertKmToMi(23.948306100000003d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 14.871898088100002d);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    p2.A_0 var0 = new p2.A_0();
    int[] var2 = new int[] { 1};
    int[] var3 = var0.mergeSort(var2);
    p2.A_0.shuffleArray(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    int[] var0 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = p1.ClassId_1.recursiveBinarySearch(var0, 0, 1, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    int[] var1 = new int[] { 100};
    boolean var3 = p1.ClassId_1.sequentialSeach(var1, 100);
    p2.A_0.reverse(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    int var2 = p2.A_0.greatestCommonDivisor(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    int var2 = p2.A_0.greatestCommonDivisor(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    int[] var1 = new int[] { 0};
    boolean var3 = p1.ClassId_1.binarySearch(var1, 10);
    p2.A_0.reverse(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    p2.A_0 var0 = new p2.A_0();
    long var2 = var0.m_0(100L);
    long var4 = var0.m_0(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1L);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", 0, 1);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    int[] var1 = new int[] { 100};
    boolean var3 = p1.ClassId_1.sequentialSeach(var1, 100);
    int var4 = p2.A_0.max(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = p2.A_0.getInt("", 100, 10);
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    java.math.BigInteger var1 = p2.A_0.slowFibonacci(1);
    java.math.BigInteger var3 = p2.A_0.fastFibonacciMatrix(0);
    java.math.BigInteger var4 = p2.A_0.multiply(var1, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    int[] var0 = new int[] { };
    p2.A_0.shuffleArray(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = p2.A_0.max(var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    double var1 = p2.A_0.convertKmToMi(0.1928205d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1197415305d);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    int var2 = p2.A_0.greatestCommonDivisor(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    java.math.BigInteger var1 = p2.A_0.slowFibonacci(1);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p2.A_0.pow(var2, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    int[] var1 = new int[] { 0};
    boolean var3 = p1.ClassId_1.binarySearch(var1, 10);
    int var4 = p2.A_0.max(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    double var1 = p2.A_0.convertKmToMi(0.385641d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.239483061d);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    java.math.BigInteger var1 = p2.A_0.fastFibonacciMatrix(0);
    java.math.BigInteger[] var2 = new java.math.BigInteger[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger[] var4 = p2.A_0.pow(var2, (-1));
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


	    int[] var0 = new int[] { };
	    boolean var2 = p1.ClassId_1.sequentialSeach(var0, (-1));
	    boolean var4 = p1.ClassId_1.sequentialSeach(var0, (-1));
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertNotNull(var0);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var2 == false);
	    
	    // Regression assertion (captures the current behavior of the code)
	    assertTrue(var4 == false);

	  }

	  public void test102() throws Throwable {

	    if (debug) System.out.printf("%nRandoopTest1.test2");


	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      int var3 = p2.A_0.getInt("hi!", 100, 1);
	      fail("Expected exception of type java.lang.NumberFormatException");
	    } catch (java.lang.NumberFormatException e) {
	      // Expected exception.
	    }

	  }

}
