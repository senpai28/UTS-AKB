/*

    Tanggal pengerjaan: 20-05-2019
    Nim: 10116009
    Nama: Muhamad Ramdani
    Kelas: IF-1

*/

package com.example.ramdani.daftarteman;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class datateman extends AppCompatActivity {

    private TextView nim, getnama, kelas, telepon, email, sosmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datateman);
        getSupportActionBar().setTitle("Data Teman");
        nim = findViewById(R.id.nim);
        getnama = findViewById(R.id.getnama);
        kelas = findViewById(R.id.kelas);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);
        sosmed = findViewById(R.id.sosmed);
        showdata();


    }

    @SuppressLint("SetTextI18n")
    private void showdata() {
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama) {
            case "Febri Dolar":
                nim.setText("NIM: 10115001");
                getnama.setText("Nama: Febri Dolar");
                kelas.setText("Kelas: IF-2");
                telepon.setText("Telepon : 089656420171");
                email.setText("Email : febri_dolar@gmail.com");
                sosmed.setText("Sosmed : fdollar");
                break;

            case "Gilang Pratama":
                nim.setText("NIM: 10115002");
                getnama.setText("Nama: Gilang Pratama");
                kelas.setText("Kelas: IF-2");
                telepon.setText("Telepon : 089656420172");
                email.setText("Email : gilang_pratama@gmail.com");
                sosmed.setText("Sosmed : gpratama");
                break;

            case "Ryan Yusup":
                nim.setText("NIM: 10115003");
                getnama.setText("Nama: Ryan Yusup");
                kelas.setText("Kelas: IF-3");
                telepon.setText("Telepon : 089656420173");
                email.setText("Email : ryan_yusup@gmail.com");
                sosmed.setText("Sosmed : ryanyusup");
                break;

            case "Ilham Pahlawan":
                nim.setText("NIM: 10115004");
                getnama.setText("Nama: Ilham Pahlawan");
                kelas.setText("Kelas: IF-5");
                telepon.setText("Telepon : 089656420174");
                email.setText("Email : ilham_pahlawan@gmail.com");
                sosmed.setText("Sosmed : ilhamp");
                break;

            case "Suryo Teguh Swasto":
                nim.setText("NIM: 10115005");
                getnama.setText("Nama: Suryo Teguh Swasto");
                kelas.setText("Kelas: IF-6");
                telepon.setText("Telepon : 089656420175");
                email.setText("Email : suryo_teguh@gmail.com");
                sosmed.setText("Sosmed : stsuryo");
                break;


        }
    }
}