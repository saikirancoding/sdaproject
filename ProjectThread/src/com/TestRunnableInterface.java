package com;

class DemoThread implements Runnable
{
	public void run()
	{
		System.out.println("creating thread using runnable interface");
	}
}

public class TestRunnableInterface {

	public static void main(String[] args) {
		
		DemoThread t1=new DemoThread();
		Thread thread1=new Thread(t1);
		
		thread1.start();

	}

}
