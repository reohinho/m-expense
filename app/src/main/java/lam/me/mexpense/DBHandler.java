package lam.me.mexpense;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    public DBHandler(@Nullable Context context) {
        super(context, "mExpense", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTableQuery =
                "CREATE TABLE TRIP ("+
                "ID INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "TRIP_NAME TEXT,"+
                "TRIP_DATE TEXT,"+
                "DESTINATION TEXT,"+
                "REQUIRE_RISK_ASSESSMENT TEXT,"+
                "DESCRIPTION TEXT,"+
                "DURATION TEXT,"+
                "IS_STAY_BEHIND TEXT)";

        sqLiteDatabase.execSQL(createTableQuery);
    }

    public void addNewTrip(String tripName, String tripDate, String destination, String requireRiskAssessment, String description, String duration, String isStayBehind) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("TRIP_NAME", tripName);
        values.put("TRIP_DATE", tripDate);
        values.put("DESTINATION", destination);
        values.put("REQUIRE_RISK_ASSESSMENT", requireRiskAssessment);
        values.put("DESCRIPTION", description);
        values.put("DURATION", duration);
        values.put("IS_STAY_BEHIND", isStayBehind);

        db.insert("TRIP", null, values);
        db.close();
    }

    public void updateTripDetails(int id, String tripName, String tripDate, String destination, String requireRiskAssessment, String description, String duration, String isStayBehind) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("TRIP_NAME", tripName);
        values.put("TRIP_DATE", tripDate);
        values.put("DESTINATION", destination);
        values.put("REQUIRE_RISK_ASSESSMENT", requireRiskAssessment);
        values.put("DESCRIPTION", description);
        values.put("DURATION", duration);
        values.put("IS_STAY_BEHIND", isStayBehind);

        db.update("TRIP", values, "ID ="+id, null);

    }

    public ArrayList<TripItem> getAllTrips() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorTrips = db.rawQuery("SELECT * FROM TRIP", null);

        ArrayList<TripItem> tripItemsArrayList = new ArrayList<>();
        if(cursorTrips.moveToFirst()) {
            do {
                tripItemsArrayList.add(new TripItem("", ""));
            } while (cursorTrips.moveToNext());
        }

        return tripItemsArrayList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
