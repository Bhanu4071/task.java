
class task extends Thread
{
    public void run()
    {
        System.out.println("Hello all");

    }
    public static void main(String[]args)
    {
        task a1=new task();
        a1.start();
        task a2=new task();
        a2.start();
        task a3=new task();
        a3.start();
        task a4=new task();
        a4.start();
        task a5=new task();
        a5.start();

    }

}
