package com.ahmad.labelletextviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ahmad.labelledtextview.LabelledTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LabelledTextView labelledTextView =findViewById(R.id.view1);
        //labelledTextView.setOrientation(LinearLayout.HORIZONTAL);
        //labelledTextView.setLabelText("Label here");
        //labelledTextView.setValueText("Value Here");
        // etc

    }
}
