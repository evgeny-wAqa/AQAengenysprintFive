package org.example;

import lombok.Data;


public class Lead {
    private String name;


  public Lead (String name) {
    this.name = name ;
  }
  public String getName(){
      return name ;
  }
  public void setName(String name){
      this.name=name ;

  }
}