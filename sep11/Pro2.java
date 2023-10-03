class T1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}

class T2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}

class T3 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}

class Pro2 {
    public static void main(String[] args) {        
        Thread t1=new Thread(new T3());
        t1.start();

        Thread t2=new Thread(new T3());
        t2.start();

        Thread t3=new Thread(new T3());
        t3.start();
    }
}
