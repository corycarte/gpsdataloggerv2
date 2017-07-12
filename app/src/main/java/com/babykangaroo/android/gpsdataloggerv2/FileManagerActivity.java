package com.babykangaroo.android.gpsdataloggerv2;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.babykangaroo.android.mylocationlibrary.LocationAccess;

public class FileManagerActivity extends AppCompatActivity {

    Button testButton;
    private LocationAccess mLocationAccess;
    public Location mLocation;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_manager);
        context = this;
        mLocationAccess = new LocationAccess(context);
        testButton = (Button) findViewById(R.id.test_button);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("MY TEST LOG", "confirmed click");
                double latt = mLocationAccess.getLastKnownLocation().getLatitude();
                Toast.makeText(context, String.valueOf(latt), Toast.LENGTH_SHORT).show();
            }
        });
    }

//    @OnClick(R.id.test_button)
//    public void myMethodFOrMe(){
//        Log.v("MY TEST LOG", "confirmed click");
//        ContentValues cv = new ContentValues();
//        cv.put(ListContract.ListContractEntry.COLUMN_ITEM_NAME, "test item");
//        Uri uri = getContentResolver().insert(ListContract.ListContractEntry.DIRECTORY_CONTENT_URI, cv);
//        Log.v("MY TEST LOG", uri.toString());
//        Toast.makeText(this, uri.toString(), Toast.LENGTH_SHORT).show();
//    }
}
