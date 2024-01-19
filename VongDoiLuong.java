
package baitaptuan2;

public class VongDoiLuong {
    public static void main(String[] args) {
        // Taon 1 luong moi
        Thread t1 = new Thread(new MyRunable1());
        t1.start();
        try {
            Thread.sleep(2000);
                  
        } catch (Exception e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }
}

class MyRunable1 implements Runnable{
    public void run(){
        System.out.println("Luong dang chay - Trang Thai "+
                Thread.currentThread().getState());
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Luong bi ngat giac ngu - Trang Thai "+
                    Thread.currentThread().getState());
        }
        System.out.println("Luong da ket thuc - Trang Thai "+
                Thread.currentThread().getState());
    }

}