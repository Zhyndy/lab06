package com.example.lab06;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Vietnam", "98,000,000", R.drawable.vietnam_flag));
        countryList.add(new Country("United States", "320,000,000", R.drawable.usa_flag));
        countryList.add(new Country("Russia", "142,000,000", R.drawable.russia_flag));
        countryList.add(new Country("Kazakhstan", "20000000", R.drawable.kazakhstan_flag));

        CountryAdapter CountryAdapter = new CountryAdapter(countryList);

        recyclerView.setAdapter(CountryAdapter);
    }
}
