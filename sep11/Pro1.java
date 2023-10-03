import java.sql.Timestamp;

class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<=5000;i++){
            System.out.println("Thread1 : "+i);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<=5000;i++){
            System.out.println("Thread2 : "+i);
        }
    }
}

class Thread3 extends Thread{
    public void run(){
        for(int i=0;i<=5000;i++){
            System.out.println("Thread3 : "+i);
        }
    }
}


class Pro1{
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t1.start();
        t2.start();
        t3.start();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Timestamp timestampend = new Timestamp(System.currentTimeMillis());
        System.out.println(timestampend);
        
    }
}