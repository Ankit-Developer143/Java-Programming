package multithreading_Demo;

class Demo { 
    public static void m1() 
    { 
        System.out.println("Hello Visitors"); 
    } 
} 
  
// Here we can extends any other class 
class Test1 extends Demo implements Runnable { 
    public void run() 
    { 
        System.out.println("Run method executed by child Thread"); 
    } 
    public static void main(String[] args) 
    { 
        Test1 t = new Test1(); 
        t.m1(); 
        Thread t1 = new Thread(t); 
        t1.start(); 
        System.out.println("Main method executed by main thread"); 
    } 
} 