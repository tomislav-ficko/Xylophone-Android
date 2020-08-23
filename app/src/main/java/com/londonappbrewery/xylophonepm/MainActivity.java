package com.londonappbrewery.xylophonepm;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoundPool soundPool = new SoundPool.Builder().build();

        int cSoundId = soundPool.load(this.getApplicationContext(), R.raw.note1_c, PRIORITY);
        int dSoundId = soundPool.load(this.getApplicationContext(), R.raw.note2_d, PRIORITY);
        int eSoundId = soundPool.load(this.getApplicationContext(), R.raw.note1_c, PRIORITY);
        int fSoundId = soundPool.load(this.getApplicationContext(), R.raw.note4_f, PRIORITY);
        int gSoundId = soundPool.load(this.getApplicationContext(), R.raw.note5_g, PRIORITY);
        int aSoundId = soundPool.load(this.getApplicationContext(), R.raw.note6_a, PRIORITY);
        int bSoundId = soundPool.load(this.getApplicationContext(), R.raw.note7_b, PRIORITY);

    }

    // TODO: Add the play methods triggered by the buttons


}
