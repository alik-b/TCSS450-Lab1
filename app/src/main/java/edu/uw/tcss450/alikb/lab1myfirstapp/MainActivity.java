package edu.uw.tcss450.alikb.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate - :)");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart - :)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "onResume - :)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause - :|");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop - :(");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart - :)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy - >:(");
    }
}