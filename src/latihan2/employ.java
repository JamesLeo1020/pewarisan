/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author USER
 */
public class employ extends person {
    private String noKaryaawan;
    //kostruktor
    public employ (String noKaryawan, String nama, int usia){
        super(nama, usia);
        this.noKaryaawan = noKaryawan;
    }
    //metode
    public void info(){
        System.out.println("No. Karyawan: "+ this.noKaryaawan);
        super.info();
    }
}
