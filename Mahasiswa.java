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
public class Mahasiswa extends Manusia{
    private String noInduk;
    private Mapel mapel;
    private int hitungMapel = 0;

    public Mahasiswa(String nama, String jenisKelamin, String noInduk) {
        super(nama, jenisKelamin);
        this.noInduk = noInduk;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public Mapel getMapel() {
        return mapel;
    }

    public void setMapel(Mapel mapel) {
        this.mapel = mapel;
    }

    public int getHitungMapel() {
        return hitungMapel;
    }

    public void setHitungMapel(int hitungMapel) {
        this.hitungMapel = hitungMapel;
    }
    
    public void addMapel(Mapel mapel){
        mapel = new Mapel();
        hitungMapel += 1;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "noInduk=" + noInduk + ", mapel=" + mapel + ", hitungMapel=" + hitungMapel + '}';
    }
}
