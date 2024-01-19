/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan2;

/**
 *
 * @author dacla
 */
public class MyThread extends Thread{
    // cong viec ma luong thuc hien trong phan run
    @Override
    public void run()
    {
        System.out.println("Luong bat dau chay");
    }
    
    public static void main(String[] args) {
        // Tao luong
        MyThread myThread = new MyThread();
        // Bat dau luong
        myThread.start();
    }
}
