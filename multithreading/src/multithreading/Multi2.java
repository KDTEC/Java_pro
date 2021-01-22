package multithreading;

public class Multi2 implements Runnable{
	public void run()
	{
		System.out.println("Thread using runnable..");
	}
	public static void main(String a[])
	{
		Multi2 m=new Multi2();
		Thread t1=new Thread(m);
		t1.start();
	}

}
