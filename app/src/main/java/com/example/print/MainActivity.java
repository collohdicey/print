package com.example.print;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.device.PrinterManager;

//public abstract class PrinterManager  extends java.lang.Object {
//    PrinterManager printer = new PrinterManager();
//    public abstract int getStatus();
//    return int;
//}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CheckPrinter(View view) {

        Toast.makeText(MainActivity.this, "Hello Toast Message!", Toast.LENGTH_LONG).show();
    }
}