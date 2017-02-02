package com.sigmadelta.verticaldoubletapseekbar;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DoubleTapSeekBar seekBar = (DoubleTapSeekBar) findViewById(R.id.doubletapseekbar);
        seekBar.setMax(25);
        seekBar.setDebounceTimeInMs(200); // Unnecessary but for demo purposes

        seekBar.setDoubleTapEvent(new DoubleTapSeekBarEvent() {
            @Override
            public void onDoubleTap(DoubleTapSeekBar seekBar) {
                // Define your behaviour here, f.e. see below

                seekBar.setProgress(seekBar.getMax()/2);
            }
        });
    }
}