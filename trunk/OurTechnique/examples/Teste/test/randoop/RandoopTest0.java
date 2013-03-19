package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    p1.A var0 = new p1.A();
    int var2 = var0.k(1L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(0L);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    p1.A var0 = new p1.A();
    int var2 = var0.k((-1L));
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(100);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    p1.A var0 = new p1.A();
    int var2 = var0.k(0L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    p1.A var0 = new p1.A();
    int var2 = var0.k(1L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k((-1L));
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(100L);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    p1.A var0 = new p1.A();
    int var2 = var0.k(1L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    p1.A var0 = new p1.A();
    int var2 = var0.k(0L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k((-1));
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    p1.A var0 = new p1.A();
    int var2 = var0.k(100L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    p1.A var0 = new p1.A();
    int var2 = var0.k((-1L));
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(0);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    p1.A var0 = new p1.A();
    int var2 = var0.k(100L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    p1.A var0 = new p1.A();
    int var2 = var0.k(1L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(20);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    p1.A var0 = new p1.A();
    int var2 = var0.k(100L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(1L);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(10L);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    p1.A var0 = new p1.A();
    int var2 = var0.k((-1L));
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    p1.A var0 = new p1.A();
    int var2 = var0.k(100L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    p1.A var0 = new p1.A();
    int var2 = var0.k((-1L));
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    p1.A var0 = new p1.A();
    int var2 = var0.k(1L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    p1.A var0 = new p1.A();
    int var2 = var0.k(0L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    p1.A var0 = new p1.A();
    int var2 = var0.k((-1L));
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(1);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    p1.A var0 = new p1.A();
    int var2 = var0.k(0L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1));
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    p1.A var0 = new p1.A();
    int var2 = var0.k(0L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    p1.A var0 = new p1.A();
    int var2 = var0.k(10L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    p1.A var0 = new p1.A();
    int var2 = var0.k(10L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    p1.A var0 = new p1.A();
    int var2 = var0.k(10L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    p1.A var0 = new p1.A();
    int var2 = var0.k(100L);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    p1.B var0 = new p1.B();
    int var2 = var0.k((-1L));
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var3 = var0.test();
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var2 = var0.test();
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    p1.A var0 = new p1.A();
    int var2 = var0.k(10L);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    p1.A var0 = new p1.A();
    int var2 = var0.k(10L);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    p1.B var0 = new p1.B();
    int var2 = var0.k(20);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    p1.B var0 = new p1.B();
    int var2 = var0.k(0L);
    int var4 = var0.k(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    p1.B var0 = new p1.B();
    int var2 = var0.k(1L);
    int var4 = var0.k(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    p1.B var0 = new p1.B();
    int var1 = var0.test();
    int var3 = var0.k(10);
    int var4 = var0.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10);
    int var4 = var0.k(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    p1.B var0 = new p1.B();
    int var2 = var0.k(100L);
    int var4 = var0.k(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 20);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    p1.B var0 = new p1.B();
    int var2 = var0.k(10L);
    int var4 = var0.k(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

}
