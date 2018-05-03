package com.example.ins15.udacity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address=findViewById(R.id.address1);
        String htmlString = "<u>abc</u>";
        address.setText(Html.fromHtml(htmlString));
    }

    public void openMap(View v){

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=19.0214977, 73.0181963(Mad Over Dounts)"));
        startActivity(intent);
    }
}
