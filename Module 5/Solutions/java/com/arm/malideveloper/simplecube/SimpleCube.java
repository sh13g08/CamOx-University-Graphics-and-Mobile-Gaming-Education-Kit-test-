package com.arm.malideveloper.simplecube;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SimpleCube extends Activity {
    private static String LOGTAG = "SimpleCube";
    protected TutorialView graphicsView;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.i(LOGTAG, "Creating New Tutorial View");
        graphicsView = new TutorialView(getApplication());
        setContentView(graphicsView);
    }
    @Override protected void onPause()
    {
        super.onPause();
        graphicsView.onPause();
    }

    @Override protected void onResume()
    {
        super.onResume();
        graphicsView.onResume();
    }
}