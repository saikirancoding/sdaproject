package com;


class ThreadGroupDemo extends Thread{  
	
	ThreadGroupDemo( ThreadGroup tgrp,String tName)  
			{  
		super(tgrp,tName);  
		
			}
	
    public void run() {    
        System.out.println("Name"+currentThread().getName());    
  }    
}

public class TestThreadGroup {

	public static void main(String[] args) {
		
			ThreadGroup tg=new ThreadGroup("parent grp");
			
			
			ThreadGroupDemo t1=new ThreadGroupDemo(tg,"one");
             t1.start();
			
             ThreadGroupDemo t2=new ThreadGroupDemo(tg,"two");
             t2.start();
             tg.list();  
			}
	}




