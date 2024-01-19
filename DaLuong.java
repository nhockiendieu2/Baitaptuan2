/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan2;

/**
 *
 * @author dacla
 */
public class DaLuong {
    
    
    
    public static void main(String[] args) {
        // Tao va goi luong 1
        Thread t1 = new Thread(new MyRunable("Luong 1"));
        t1.start();
        Thread t2 = new Thread(new MyRunable("Luong 2"));
        t2.start();
        
    }
}
// Dinh nghia cac luong
class MyRunable implements Runnable{
    private String threadName; // ten cua thread
    public MyRunable(String name) // Ham  khoi tao
    {
        this.threadName = name;
    }    
    // Ham run se thuc hien khi ham strat duoc goi
    @Override
    public void run(){
        System.out.println("Bat dau thuc hien cong viec trong "
        + threadName);
        
        // Thuc hien cong viec
        for(int i=0;i<=5;i++)
        {
            System.out.println(threadName + " buoc "+i);
            try {
                Thread.sleep(2000); // ngu 2s
            } catch (Exception e) {
            }
        }
        System.out.println("Bat dau thuc hien cong viec luong "
        +threadName);
    }
}