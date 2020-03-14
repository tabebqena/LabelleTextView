package com.ahmad.labelledtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

class ValueViewHolder {
    private final LabelledTextView labelledTextView;
    private boolean valueEnabled = true;
    private MaterialTextView valueView;
    private TextInputEditText valueEditText;

    public ValueViewHolder(LabelledTextView labelledTextView, Context context, TypedArray a) {
        this.labelledTextView = labelledTextView;
        valueView =  labelledTextView.findViewById(R.id.labelledTextViewValue);
        valueEditText = labelledTextView.findViewById(R.id.labelledTextViewEdit);

        if (a.hasValue(R.styleable.LabelledTextView_valueEditable)) {
            setValueEditable(a.getBoolean(R.styleable.LabelledTextView_valueEditable, false));
        }


        if (a.hasValue(R.styleable.LabelledTextView_valueText)) {
            setValueText(a.getString(R.styleable.LabelledTextView_valueText));
        }
        setValueGravity(a.getInt(R.styleable.LabelledTextView_valueGravity,
                Gravity.NO_GRAVITY));
        if (a.hasValue(R.styleable.LabelledTextView_valueWidth)) {
            setValueWidth(a.getDimension(R.styleable.LabelledTextView_valueWidth,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
        }else{
            setValueWidth(LinearLayout.LayoutParams.WRAP_CONTENT);
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueHeight)) {
            setValueHeight(a.getDimension(R.styleable.LabelledTextView_valueHeight,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
        }else{
            setValueWidth(LinearLayout.LayoutParams.WRAP_CONTENT);
        }

        float valueWidth = a.getDimension(R.styleable.LabelledTextView_valueWidth,
                -3);
        float valueHeight = a.getDimension(R.styleable.LabelledTextView_valueHeight,
                -3);

        int valueMaxWidth = a.getInt(R.styleable.LabelledTextView_valueMaxWidth,
                0);
        int valueMaxHeight = a.getInt(R.styleable.LabelledTextView_valueMaxHeight,
                0);

        float valueLayoutWidth = a.getInt(R.styleable.LabelledTextView_valueLayoutWidth,
                -3);
        float valueLayoutHeight = a.getInt(R.styleable.LabelledTextView_valueLayoutHeight,
                -3);
        if (valueLayoutHeight != -3){
            setValueHeight(valueLayoutHeight);
        }

        if (valueLayoutWidth != -3 ){
            setValueWidth(valueLayoutWidth);
        }

        if (valueWidth != -3){
            setValueWidth(valueWidth);
        }
        if (valueHeight != -3){
            setValueHeight(valueHeight);
        }

        if (valueMaxWidth != 0){
            setMaxValueWidth(valueMaxWidth);
        }
        if (valueMaxHeight != 0){
            setMaxValueHeight(valueMaxHeight);
        }


        if (a.hasValue(R.styleable.LabelledTextView_valueWeight)){
            setValueWeight(a.getInt(R.styleable.LabelledTextView_valueWeight, 1));
        }else{
            setValueWeight(a.getInt(R.styleable.LabelledTextView_valueWeight, 1));
        }

        if (a.hasValue(R.styleable.LabelledTextView_valueTextAllCaps)) {
            setValueTextAllCaps(a.getBoolean(R.styleable.LabelledTextView_valueTextAllCaps, false));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueTextColor)) {
            setValueTextColor(a.getColor(R.styleable.LabelledTextView_valueTextColor,
                    context.getResources().getColor(
                            android.R.color.black)));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueTextIsSelectable)) {
            setValueTextIsSelectable(a.getBoolean(R.styleable.LabelledTextView_valueTextIsSelectable, false));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueTextSize)) {
            setValueTextSize(a.getDimension(R.styleable.LabelledTextView_valueTextSize, 8));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueBackgroundColor)) {
            setValueBackgroundColor(a.getColor(R.styleable.LabelledTextView_valueBackgroundColor,
                    context.getResources().getColor(android.R.color.background_light)));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueEnabled)) {
            valueEnabled = a.getBoolean(R.styleable.LabelledTextView_valueEnabled, true);
            setValueEnabled(valueEnabled);
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueAlpha)) {
            setValueAlpha(a.getFloat(R.styleable.LabelledTextView_valueAlpha, 1));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueLines)) {
            setValueLines(a.getInt(R.styleable.LabelledTextView_valueLines, 1));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueMinLines)) {
            setValueMinLines(a.getInt(R.styleable.LabelledTextView_valueMinLines
                    , 1));
        }
        if (a.hasValue(R.styleable.LabelledTextView_valueMaxLines)) {
            setValueMaxLines(a.getInt(R.styleable.LabelledTextView_valueMaxLines, 1));
        }

        valueEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                valueView.setText(s);
            }
        });

    }

    void setValueEditable(boolean aBoolean) {
        if (aBoolean){
            setValueEnabled(true);

            valueEditText.setVisibility(View.VISIBLE);
            valueView.setVisibility(View.GONE);
        }else{
            valueEditText.setVisibility(View.GONE);
            valueView.setVisibility(View.VISIBLE);

            setValueEnabled(valueEnabled);
        }
    }

    TextView getValueView(){
        if (valueView.getVisibility() == View.VISIBLE){
            return valueView;
        }else{
            return valueEditText;
        }
    }

    public CharSequence getValueText() {
        return getValueView().getText();
    }

    public void setValueText(String valueText) {
        valueView.setText(valueText);
        valueEditText.setText(valueText);
    }

    public void setValueHeight(float valueHeight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) valueView.getLayoutParams();
        params.height = (int) valueHeight;
        valueView.setLayoutParams(params);

        //LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) valueEditText.getLayoutParams();
        //params2.height = (int) valueHeight;
        valueEditText.setLayoutParams(params);
    }

    public void setValueWidth(float valueWidth) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) valueView.getLayoutParams();
        params.width = (int) valueWidth;
        valueView.setLayoutParams(params);

        //LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) valueEditText.getLayoutParams();
        //params.width = (int) valueWidth;
        valueEditText.setLayoutParams(params);
    }



    public void setMaxValueWidth(int valueMaxWidth) {
        valueView.setMaxWidth(valueMaxWidth);
        valueEditText.setMaxWidth(valueMaxWidth);
    }


    public void setMaxValueHeight(int valueMaxHeight) {
        valueView.setMaxHeight(valueMaxHeight);
        valueEditText.setMaxHeight(valueMaxHeight);
    }


    public void setMinValueWidth(int valueMinWidth) {
        valueView.setMinWidth(valueMinWidth);
        valueEditText.setMinWidth(valueMinWidth);
    }


    public void setMinValueHeight(int valueMinHeight) {
        valueView.setMinHeight(valueMinHeight);
        valueEditText.setMinHeight(valueMinHeight);
    }
    
    public void setValueWeight(int weight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) valueView.getLayoutParams();
        params.weight = weight;
        valueView.setLayoutParams(params);

        //LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) valueEditText.getLayoutParams();
        //params.weight = weight;
        valueEditText.setLayoutParams(params);
    }


    public void setValueMaxLines(int valueMaxLines) {
        valueView.setMaxLines(valueMaxLines);
        valueEditText.setMaxLines(valueMaxLines);
    }


    public void setValueMinLines(int valueMinLines) {
        valueView.setMinLines(valueMinLines);
        valueEditText.setMinLines(valueMinLines);
    }


    public void setValueLines(int valueLines) {
        valueView.setLines(valueLines);
        valueEditText.setLines(valueLines);
    }

    public void setValueAlpha(float valueAlpha) {
        valueView.setAlpha(valueAlpha);
        valueEditText.setAlpha(valueAlpha);
    }


    public void setValueEnabled(boolean valueEnabled) {
        valueView.setEnabled(valueEnabled);
        valueEditText.setEnabled(valueEnabled);
    }


    public void setValueBackgroundColor(int valueBackground) {
        valueView.setBackgroundColor(valueBackground);
        valueEditText.setBackgroundColor(valueBackground);
    }

    public void setValueTextSize(float valueTextSize) {
        valueView.setTextSize(valueTextSize);
        valueEditText.setTextSize(valueTextSize);
    }

    public void setValueTextAllCaps(boolean valueTextAllCaps) {
        valueView.setAllCaps(valueTextAllCaps);
        valueEditText.setAllCaps(valueTextAllCaps);
    }

    public void setValueTextIsSelectable(boolean valueTextIsSelectable) {
        valueView.setTextIsSelectable(valueTextIsSelectable);
        valueEditText.setTextIsSelectable(valueTextIsSelectable);
    }

    public void setValueTextColor(int valueTextColor) {
        valueView.setTextColor(valueTextColor);
        valueEditText.setTextColor(valueTextColor);
    }

    public void setValueGravity(int valueGravity) {
        valueView.setGravity(valueGravity);
        valueEditText.setGravity(valueGravity);
        labelledTextView.invalidate();
    }

    public boolean isValueEditable() {
        if (getValueView() == valueEditText){
            return true;
        };
        return false;
    }
}
