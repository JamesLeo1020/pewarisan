/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author USER
 */
public class gajah extends hewan{
    public static void testClassMethod(){
        System.out.println("The class method in Hewan...");
    }
    //meng-override method pada kelas hewan
    public void testIntanceMethod(){
        System.out.println("The Instance method gajah...");
    }
    public static void main(String[] args) {
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
    }
}
