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
			
			if (!Thread.currentThread().getName().equals("T4")) {
				Thread.yield();// objetivo colocar a thread atual em runnable e colocar em running, threads de mesma prioridade
			}
			
			try {
				Thread.sleep(200);// 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}


public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ThreadExemplo.currentThread().getName());
		// A JVM vai fazer o schedule de qual thread começa e qual termina
		// thread Daemon e user, enqto tiver uma thread User executando, a JVM não para a execução, diferente de uma thread Daemon
		// toda thread tem um nome | thread = processamento paralelo
		// uma thread pode afetar a execução de outra
		// O Scheduler da JVM que vai definir qndo uma thread começa e a outra termina
		// uma vez iniciado uma thread, ela não pode ser iniciada novamente
		// estado das threads: new, runnable (viva), running e dead
		
//		ThreadExemplo t1 = new ThreadExemplo('A');
//		ThreadExemplo t2 = new ThreadExemplo('B');
//		ThreadExemplo t3 = new ThreadExemplo('C');
//		ThreadExemplo t4 = new ThreadExemplo('D');
		
		Thread t1 = new Thread(new ThreadExemploRunnable('A'), "T1");
		Thread t2 = new Thread(new ThreadExemploRunnable('B'), "T2");
		Thread t3 = new Thread(new ThreadExemploRunnable('C'), "T3");
		Thread t4 = new Thread(new ThreadExemploRunnable('D'), "T4");
		
		t4.setPriority(Thread.MAX_PRIORITY); // a execução de t4 será prioridade
		t1.start(); 
		t1.join(); // main só executa t2, depois de executar t1 inteiro... t1 join main
		t2.start();
//		t3.start();
//		t4.start();
		
		
	}

}
