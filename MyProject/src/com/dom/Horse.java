package com.dom;

public class Horse extends Thread{
	public Horse(String name){
		setName(name);
	}
		public void run(){
			for(int i=0;i<=3000;i++);
		}
}
