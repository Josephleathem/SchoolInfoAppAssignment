package com.example.ciatproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button button1 = (Button)findViewById(R.id.btReturn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Info.this, MainActivity.class));
            }
        });

        Button btMapView = (Button)findViewById(R.id.btMapView);
        btMapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("401 Mile of Cars Way #100, National City, CA 91950"));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                startActivity(mapIntent);
            }
        });

        Button btDirections = (Button)findViewById(R.id.btDirections);
        btDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri dirUri = Uri.parse("google.navigation:q=" + Uri.encode("401 Mile of Cars Way #100, National City, CA 91950"));
                Intent dirIntent = new Intent(Intent.ACTION_VIEW, dirUri);
                startActivity(dirIntent);
            }
        });
    }
}