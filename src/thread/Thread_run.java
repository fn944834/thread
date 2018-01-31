package thread;

public class Thread_run extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("スレッド1 から出力 : "+i);
		}
	}

}
