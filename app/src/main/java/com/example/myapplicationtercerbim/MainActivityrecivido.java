package com.example.myapplicationtercerbim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivityrecivido extends AppCompatActivity {

    private WebView ww;
    private Button btnF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityrecivido);
        ww = (WebView) findViewById(R.id.webV);
        btnF = (Button) findViewById(R.id.btnFi);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        ww.loadUrl("https://" + dato);

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}