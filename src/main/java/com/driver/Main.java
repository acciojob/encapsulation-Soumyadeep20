package com.driver;

public class Main {
    public static void main (String[] args)
    {
        RWOnly a=new RWOnly();
        /*a.var=2;
        System.out.println(a.var);
        output: java: var has private access in com.driver.RWOnly
         */
        a.setName("Soumo");
        System.out.println(a.getName());//output: 2
    }
  
}