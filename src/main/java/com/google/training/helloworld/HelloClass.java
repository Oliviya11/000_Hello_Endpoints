package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    //function from lection
    public HelloClass (String name, String period) {
    	this.message ="Good " + period + ", " + name + "!";
    }

    public String getMessage() {
        return message;
    }
    
    public HelloClass (String name, String period, String times) {
    	int t = Integer.parseInt(times);
    	this.message = "";
    	for (int i=0; i<t; ++i){
    		this.message+="Good " + period + ", " + name + "!"+" ";
    	}
    }
    
   
}
