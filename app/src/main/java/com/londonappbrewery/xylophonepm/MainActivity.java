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

    private SoundPool mSoundpool;
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

        mSoundpool = new SoundPool.Builder().build();

        mCSoundId = mSoundpool.load(getApplicationContext(), R.raw.note1_c, PRIORITY);
        mDSoundId = mSoundpool.load(getApplicationContext(), R.raw.note2_d, PRIORITY);
        mESoundId = mSoundpool.load(getApplicationContext(), R.raw.note3_e, PRIORITY);
        mFSoundId = mSoundpool.load(getApplicationContext(), R.raw.note4_f, PRIORITY);
        mGSoundId = mSoundpool.load(getApplicationContext(), R.raw.note5_g, PRIORITY);
        mASoundId = mSoundpool.load(getApplicationContext(), R.raw.note6_a, PRIORITY);
        mBSoundId = mSoundpool.load(getApplicationContext(), R.raw.note7_b, PRIORITY);

    }

    public void playCSound(View view) {
        mSoundpool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playDSound(View view) {
        mSoundpool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playESound(View view) {
        mSoundpool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playFSound(View view) {
        mSoundpool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playGSound(View view) {
        mSoundpool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playASound(View view) {
        mSoundpool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playBSound(View view) {
        mSoundpool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}
