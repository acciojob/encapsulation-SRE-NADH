package com.driver;

public class Main {
    public static void main(String[] args) {
      RWOnly rw = new RWOnly();
      rw.Name="sreenadh";
      // name variable is private cnnot access
      rw.setName("gopinath");
      System.out.println(rw.getName());
    }
}