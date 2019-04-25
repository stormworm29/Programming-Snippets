package test;

class MultithreadingDemo implements Runnable 
{ 
    public void run() 
    { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running "); 
            try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    } 
}

public class multithreading{
	
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            Thread object = new Thread( new MultithreadingDemo() ); 
            object.start();
            object.join(1000);
        } 
    } 
}
