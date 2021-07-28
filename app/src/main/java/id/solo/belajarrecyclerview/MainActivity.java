package id.solo.belajarrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import id.solo.belajarrecyclerview.model.MahasiswaModel;
import id.solo.belajarrecyclerview.model.adapter.MahasiswaAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvMahasiswa;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<MahasiswaModel> dataMahasiswa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvMahasiswa = findViewById(R.id.rcv_mahasiswa);

        addDataMahasiswa();

        mahasiswaAdapter = new MahasiswaAdapter(dataMahasiswa);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        rcvMahasiswa.setLayoutManager(layoutManager);
        rcvMahasiswa.setAdapter(mahasiswaAdapter);
    }

    void addDataMahasiswa() {
        dataMahasiswa = new ArrayList<>();
        dataMahasiswa.add(new MahasiswaModel("Sulaiman", "G64160080", "085156901850"));
        dataMahasiswa.add(new MahasiswaModel("Crimson", "G64160081", "085156901851"));
        dataMahasiswa.add(new MahasiswaModel("Chin", "G64160082", "085156901852"));
        dataMahasiswa.add(new MahasiswaModel("Solo", "G64160083", "085156901853"));
        dataMahasiswa.add(new MahasiswaModel("NutsCracker", "G64160084", "085156901854"));
    }
}