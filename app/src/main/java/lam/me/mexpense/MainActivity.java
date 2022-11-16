package lam.me.mexpense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView tripListGridView;
    ArrayList tripItemList = new ArrayList<>();

    Button newTripButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tripListGridView = (GridView) findViewById(R.id.tripListGridView);
        tripItemList.add(new TripItem("Google IO 2022","21st May 22"));
        tripItemList.add(new TripItem("TGS 2021","21st Sept 21"));


        TripListGridViewAdapter gridViewAdapter = new TripListGridViewAdapter(this, R.layout.trip_list_grid_view_items, tripItemList);
        tripListGridView.setAdapter(gridViewAdapter);

        newTripButton = findViewById(R.id.newTripButton);
        newTripButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), NewTrip.class);
                startActivity(i);
            }

        });

    }
}