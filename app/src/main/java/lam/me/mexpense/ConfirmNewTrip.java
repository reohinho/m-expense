package lam.me.mexpense;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmNewTrip extends Activity {

    Button confirmButton;
    Button backButton;
    Button cancelButton;

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


    }


}
