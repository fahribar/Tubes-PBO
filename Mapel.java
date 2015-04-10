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
public class Mapel {
    private String nama;
    private Nilai nilai;

    public Mapel(String nama){
        this.nama = nama;
    }

    Mapel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }
    
    public void createNilai(double tugas, double uts, double uas, double kuis, double nilaiTotal){
        nilai = new Nilai(tugas, uas, uts, kuis, nilaiTotal);              
    }
    
    
}
