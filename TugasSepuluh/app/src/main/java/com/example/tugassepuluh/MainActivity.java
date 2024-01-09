package com.example.tugassepuluh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnshowMap = findViewById(R.id.btnshowMap);
        btnshowMap.setOnClickListener(v -> {
            Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.324307,107.169273"));
            map.setPackage("com.google.android.apps.maps");
            startActivity(map);
        });

        findViewById(R.id.btnSetAlarm).setOnClickListener(v -> {
            // Panggil metode untuk mengatur alarm
            setAlarm();
        });
    }
    private void setAlarm() {
        Intent alarm = new Intent(AlarmClock.ACTION_SET_ALARM);
        startActivity(alarm);
    }

    public void btnHelloWorld(View view) {
        Intent helloworld = new Intent(MainActivity.this, HelloActivity.class);
        startActivity(helloworld);
    }

    public void btnCount(View view) {
        Intent count = new Intent(MainActivity.this, CountActivity.class);
        startActivity(count);
    }

    public void btnSianida(View view) {
        Intent sianida = new Intent(MainActivity.this, SianidaActivity.class);
        startActivity(sianida);
    }

    public void btnTwoActivity(View view) {
        Intent twoact = new Intent(MainActivity.this, TwoactActivity.class);
        startActivity(twoact);
    }

    public void btnFragmentActivity(View view) {
        Intent fragact = new Intent(MainActivity.this, FragmentActivity.class);
        startActivity(fragact);
    }
}