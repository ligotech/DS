package com.learning.java8;

public class PassByValueTest {
    private String name;

    PassByValueTest(String name){
        this.name = name;
    }

    public static void main(String[] args) throws Exception{
        PassByValueTest p1 = new PassByValueTest("p1");

        PassByValueTest p2 = new PassByValueTest("p2");
        //p1.fun(p2);
        //p1 = null;
        Thread.sleep(2000);
    }

    private void fun(PassByValueTest passByValueTest) throws Exception{
        passByValueTest = null;
        PassByValueTest p3 = new PassByValueTest("p3");
        System.gc();
        Thread.sleep(5000);
    }

    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println("Finalizing " +this.name);
    }
}
