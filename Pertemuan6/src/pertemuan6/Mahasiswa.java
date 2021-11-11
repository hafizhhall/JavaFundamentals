/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Acer
 * Nama :Hafizh Athallah Widianto
 * NPM: 5200311097
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private Double ipk;
    private String umur;

    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public Double getIpk() {
        return ipk;
    }

    public void setIpk(Double ipk) {
        this.ipk = ipk;
    }
    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        
        this.umur = umur;
    }
    void Umurmhs(){
        System.out.println("Usia Mahasiswa: " + this.umur + " Tahun");
}
    void Namamhs(){
        System.out.println("Nama Mahasiswa: " + this.nama);
    }
    void Ipkmhs(){
        System.out.println("IPK Anda: " + this.ipk);
    }
    void Prodimhs(){
        System.out.println("Prodi Anda: " + this.prodi);
    }
    void Nimmhs(){
        System.out.println("NIM: " + this.nim);
    }

}
