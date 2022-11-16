package lam.me.mexpense;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NewTrip extends Activity implements AdapterView.OnItemSelectedListener {

    Button saveButton;
    Button cancelButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trip);

        TextView tripName = findViewById(R.id.input_trip_name);
        TextView destination = findViewById(R.id.destination);
        TextView tripDate = findViewById(R.id.trip_date);
        TextView description = findViewById(R.id.descrption);
        TextView duration = findViewById(R.id.duration);

        final Spinner requireRiskAssessmentSpinner = (Spinner) findViewById(R.id.require_risk_assessment);
        requireRiskAssessmentSpinner.setOnItemSelectedListener(this);

        List<String> requireRiskAssessmentItem = new ArrayList<String>();
        requireRiskAssessmentItem.add("Yes");
        requireRiskAssessmentItem.add("No");
        requireRiskAssessmentItem.add("Not sure");

        ArrayAdapter<String> requireRiskAssessmentAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, requireRiskAssessmentItem);

        requireRiskAssessmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        requireRiskAssessmentSpinner.setAdapter(requireRiskAssessmentAdapter);


        final Spinner isStayBehindSpinner = (Spinner) findViewById(R.id.is_stay_behind);
        isStayBehindSpinner.setOnItemSelectedListener(this);

        List<String> isStayBehindItem = new ArrayList<String>();
        isStayBehindItem.add("Yes");
        isStayBehindItem.add("No");

        ArrayAdapter<String> isStayBehindItemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, isStayBehindItem);

        isStayBehindItemAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        isStayBehindSpinner.setAdapter(isStayBehindItemAdapter);


        saveButton = findViewById(R.id.button_save);
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), ConfirmNewTrip.class);

                Bundle bundle = new Bundle();

                String tripNameStr = tripName.getText().toString();
                String destinationStr = destination.getText().toString();
                String tripDateStr = tripDate.getText().toString();
                String descriptionStr = description.getText().toString();
                String durationStr = duration.getText().toString();
                String requireRiskAssessmentStr = String.valueOf(requireRiskAssessmentSpinner.getSelectedItem());
                String isStayBehindStr = String.valueOf(isStayBehindSpinner.getSelectedItem());

                bundle.putString("tripName", tripNameStr);
                bundle.putString("destination", destinationStr);
                bundle.putString("tripDate", tripDateStr);
                bundle.putString("description", descriptionStr);
                bundle.putString("duration", durationStr);
                bundle.putString("requireRiskAssessment",requireRiskAssessmentStr);
                bundle.putString("isStayBehind",isStayBehindStr);

                i.putExtras(bundle);

                startActivity(i);

            }

        });


        cancelButton = findViewById(R.id.button_cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }

        });

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}
