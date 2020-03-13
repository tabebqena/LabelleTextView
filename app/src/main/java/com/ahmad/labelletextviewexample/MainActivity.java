package com.ahmad.labelletextviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ahmad.labelledtextview.Attributes;
import com.ahmad.labelledtextview.KVModel;
import com.ahmad.labelledtextview.KeyValueViewer;
import com.ahmad.labelledtextview.LabelledTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Attributes attributes = new Attributes();
        attributes.setOrientation(LinearLayout.HORIZONTAL);
        attributes.setLabelTextColor(android.R.color.white);
        attributes.setLabelBackgroundColor(android.R.color.black);


        ArrayList<KVModel> data = new ArrayList<>();

        final KeyValueViewer valueViewer = new KeyValueViewer(
                this,
                data,
                (ViewGroup) findViewById(R.id.parent) );

        TextView add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int xx = x;
                attributes.setKeyName( "Label: " + String.valueOf( x) );
                attributes.setValue( "val: "+ x );
                final KVModel model = new KVModel(attributes, null);
                valueViewer.addItem(model);
                View view = valueViewer.getItemView(xx);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       valueViewer.removeItem( valueViewer.getData().indexOf(model) );
                    }
                });
                x++;
            }
        });
    }
}
