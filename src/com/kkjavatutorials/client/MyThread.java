package com.kkjavatutorials.client;

import com.kkjavatutorials.singleton.Singleton;

public class MyThread implements Runnable {

	@Override
	public void run() {
		Singleton singleton  = Singleton.getInstance();
		System.out.println(Thread.currentThread().getName()+" "+singleton.hashCode());
	}

}
