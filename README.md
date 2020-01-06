# LabelledTextView
Simple customview to display key-value information on android

It is simple to use  

in xml

     <com.ahmad.labelledtextview.LabelledTextView
        android:layout_marginTop="200dp"
        android:id="@+id/view1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        ltv:orientation="horizontal"
        ltv:labelGravity="center"
        ltv:labelWidth="wrap_content"
        ltv:labelBackgroundColor="@color/colorPrimaryDark"
        ltv:labelLines="1"
        ltv:valueGravity="center_horizontal"
        ltv:valueBackgroundColor="@color/colorAccent"
        ltv:valueWidth="wrap_content"
        
        ltv:labelWeight="1"
        ltv:valueWeight="5"
        
        ltv:labelText="Label Here"
        ltv:valueText="Value Here"    />
</LinearLayout>

or from java code:
    
    final LabelledTextView labelledTextView =findViewById(R.id.view1);
    labelledTextView.setOrientation(LinearLayout.HORIZONTAL);
    labelledTextView.setLabelText("Label here");
    labelledTextView.setValueText("Value Here");
    // etc


