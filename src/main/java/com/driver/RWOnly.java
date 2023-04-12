package com.driver;

public class RWOnly {
    private String Name="";
     RWOnly(String name){
         this.Name=name;
     }

    public String getName() { 
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
