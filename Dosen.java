/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Nilai;

/**
 *
 * @author ASUS
 */
public class Dosen extends Manusia{
    private String nip;

    public Dosen(String nama, String jenisKelamin, String nip) {
        super(nama, jenisKelamin);
        this.nip = nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nip=" + nip + '}';
    }
  
}
