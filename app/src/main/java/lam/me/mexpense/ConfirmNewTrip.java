package lam.me.mexpense;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmNewTrip extends Activity {

    Button confirmButton;
    Button cancelButton;

    DBHandler dbHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_new_trip);

        Bundle bundle = getIntent().getExtras();

        TextView tripName = findViewById(R.id.input_trip_name);
        tripName.setText("Trip Name: "+bundle.getString("tripName"));

        TextView tripDate = findViewById(R.id.trip_date);
        tripDate.setText("Trip Date: "+bundle.getString("tripDate"));

        TextView destination = findViewById(R.id.destination);
        destination.setText("Destination: "+bundle.getString("destination"));

        TextView description = findViewById(R.id.description);
        description.setText("Description: "+bundle.getString("description"));

        TextView duration = findViewById(R.id.duration);
        duration.setText("Duration: "+bundle.getString("duration"));

        TextView requireRiskAssessment = findViewById(R.id.require_risk_assessment);
        requireRiskAssessment.setText("Require Risk Assessment: "+bundle.getString("requireRiskAssessment"));

        TextView isStayBehind = findViewById(R.id.is_stay_behind);
        isStayBehind.setText("Is stay behind: "+bundle.getString("isStayBehind"));

        confirmButton = findViewById(R.id.button_confirm);
        confirmButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String tripNameStr = bundle.getString("tripName");
                String tripDateStr = bundle.getString("tripDate");
                String destinationStr = bundle.getString("destination");
                String descriptionStr = bundle.getString("description");
                String durationStr = bundle.getString("duration");
                String requireRiskAssessmentStr = bundle.getString("requireRiskAssessment");
                String isStayBehindStr = bundle.getString("isStayBehind");

                try {
                    dbHandler = new DBHandler(getApplicationContext());
                    dbHandler.addNewTrip(tripNameStr, tripDateStr, destinationStr, requireRiskAssessmentStr, descriptionStr, durationStr, isStayBehindStr);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
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


}
