package com.Parkiran;
import java.util.Date;
public class Karcis {
    int no_karcis;
    int jam_masuk;
    int jam_keluar;
    Date tanggal;
    int harga;

    public void insert(){

    }
}

class kendaraan{
    int kendaraan;

    public void bayar_biaya(){

    }
    public void get_karcis(){

    }
}

class operator extends Karcis{
    int idpegawai;
    String nama;

    public void insert_transaction(){

    }
    public void hitung_biaya(){

    }

    public void kembalian(){

    }

}

class palang extends operator{
    public void buka(){
    }
    public void tutup(){
    }
}

class Sensor_kamera {
    int no_kendaraan;

    public void get_foto(){

    }
    public void input(){

    }
}