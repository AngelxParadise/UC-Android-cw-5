package com.example.headphones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Headphones> headphonesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Headphones hp1 = new Headphones("Apple AirPods Max Headphones - Blue", 157.90, R.drawable.appleairpodsmax);
        Headphones hp2 = new Headphones("Sony Link Buds True Wireless Noise Cancellation", 64.90, R.drawable.sonylinkbuds);
        Headphones hp3 = new Headphones("Anker SoundCore Life Q30 Noise Cancelling Headphones", 32, R.drawable.ankersoundcore);
        Headphones hp4 = new Headphones("Beats Studio3 Wireless Bluetooth Headphones", 79, R.drawable.beatsstudio3wireless);
        Headphones hp5 = new Headphones("JBL Tune 750BTNC Noise-Canceling Wireless Headphones",36 , R.drawable.jbltune750btncheadphones);
        Headphones hp6 = new Headphones("Apple AirPods Pro", 69, R.drawable.appleairpodspro);

        headphonesList.add(hp1);
        headphonesList.add(hp2);
        headphonesList.add(hp3);
        headphonesList.add(hp4);
        headphonesList.add(hp5);
        headphonesList.add(hp6);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(headphonesList, this);
        recycler.setAdapter(adapter);

    }
}