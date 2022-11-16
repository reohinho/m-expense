package lam.me.mexpense;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class TripListGridViewAdapter extends ArrayAdapter {

    ArrayList tripItemList = new ArrayList<>();

    public TripListGridViewAdapter(@NonNull Context context, int textViewResourceId, @NonNull ArrayList objects) {
        super(context, textViewResourceId, objects);
        tripItemList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        v = inflater.inflate(R.layout.trip_list_grid_view_items, null);
        TextView tripName = v.findViewById(R.id.tripName);
        TextView destination = v.findViewById(R.id.destination);
        TripItem item = (TripItem) tripItemList.get(position);
        tripName.setText(item.getTripName());
        destination.setText(item.getDestination());

        return v;
    }
}
