package com.dom;

public class Horse2 extends Thread {

	public  void run(){
		int i;
		for(i=0;i<=3000;i++){
			System.out.println("Horse2 "+i);
		}
	}

}
