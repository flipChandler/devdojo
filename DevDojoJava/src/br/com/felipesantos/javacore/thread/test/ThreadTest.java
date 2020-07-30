package br.com.felipesantos.javacore.thread.test;

class ThreadExemplo extends Thread{
	private char c;
	
	public ThreadExemplo(char c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		System.out.println("Thread executando.. " + ThreadExemplo.currentThread().getName());
		for (int i = 0; i < 1000; i++) {
			System.out.print(c);
			if ( i % 100 == 0) {
				System.out.println();
			}
		}
	}
}


class ThreadExemploRunnable implements Runnable{

private char c;
	
	public ThreadExemploRunnable(char c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		System.out.println("Thread executando.. " + ThreadExemplo.currentThread().getName());
		for (int i = 0; i < 1000; i++) {
			System.out.print(c);
			if ( i % 100 == 0) {
				System.out.println();
			}
		}
	}

	
}


public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(ThreadExemplo.currentThread().getName());
		// A JVM vai fazer o schedule de qual thread começa e qual termina
		// thread Daemon e user, enqto tiver uma thread User executando, a JVM não para a execução, diferente de uma thread Daemon
		// toda thread tem um nome | thread = processamento paralelo
		// uma thread pode afetar a execução de outra
		
//		ThreadExemplo t1 = new ThreadExemplo('A');
//		ThreadExemplo t2 = new ThreadExemplo('B');
//		ThreadExemplo t3 = new ThreadExemplo('C');
//		ThreadExemplo t4 = new ThreadExemplo('D');
		
		Thread t1 = new Thread(new ThreadExemploRunnable('A'));
		Thread t2 = new Thread(new ThreadExemploRunnable('B'));
		Thread t3 = new Thread(new ThreadExemploRunnable('C'));
		Thread t4 = new Thread(new ThreadExemploRunnable('D'));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
