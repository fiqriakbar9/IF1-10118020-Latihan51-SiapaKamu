/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siapakamu;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan data dosen dan 
 * mahasiswa
 * 
 */
public class Dosen extends Manusia {
    
    private String nip;
    private String mataKuliah;

    public String getNip() {
        nip = "41227829930";
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang"
                + "mengajar matakuliah PBO");
    }
    
    public void siapakamu(){
        System.out.println("Saya Dosen");
    }
    
}
