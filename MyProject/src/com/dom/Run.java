package com.dom;

public class Run {

	public static void main(String[] args) {
		int i;
		Horse2 horse = new Horse2();
		horse.start();
		for(i=0;i<=3000;i++){
			System.out.println("Horse1 "+i);
		}
		HorseRunnable horse3 = new HorseRunnable();
		Thread thread =new Thread(horse3);
		thread.start();
	}

}
