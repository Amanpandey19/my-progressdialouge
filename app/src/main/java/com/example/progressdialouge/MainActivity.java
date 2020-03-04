package com.example.progressdialouge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog pd=new ProgressDialog(MainActivity.this);
                pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pd.setTitle("Movie..");
                pd.setMessage("Downloading");
                pd.setCanceledOnTouchOutside(false);
                pd.show();
            }
        });
    }
}
