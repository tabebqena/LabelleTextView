package com.ahmad.labelledtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textview.MaterialTextView;

class LabelViewHolder {

    private final LabelledTextView labelledTextView;
    private MaterialTextView labelView;

    public LabelViewHolder(LabelledTextView labelledTextView, Context context, TypedArray a) {
        this.labelledTextView = labelledTextView;
        labelView = labelledTextView.findViewById(R.id.labelledTextViewLabel);


        if (a.hasValue(R.styleable.LabelledTextView_labelText)) {
            setLabelText(a.getString(R.styleable.LabelledTextView_labelText));
        }
        if (a.hasValue ( R.styleable.LabelledTextView_labelGravity )){
            setLabelGravity(a.getInt(R.styleable.LabelledTextView_labelGravity,
                    Gravity.NO_GRAVITY));
        }

        float labelWidth = a.getDimension(R.styleable.LabelledTextView_labelWidth,
                -3);
        float labelHeight = a.getDimension(R.styleable.LabelledTextView_labelHeight,
                -3);
        float labelLayoutWidth = a.getInt(R.styleable.LabelledTextView_labelLayoutWidth,
                -3);
        float labelLayoutHeight = a.getInt(R.styleable.LabelledTextView_labelLayoutHeight,
                -3);



        int labelMaxWidth = a.getInt(R.styleable.LabelledTextView_labelMaxWidth,
                0);
        int labelMaxHeight = a.getInt(R.styleable.LabelledTextView_labelMaxHeight,
                0);
        if (labelLayoutHeight != -3){
            setLabelHeight(labelLayoutHeight);
        }
        if (labelLayoutWidth != -3 ){
            setLabelWidth(labelLayoutWidth);
        }
        if (labelWidth != -3){
            setLabelWidth(labelWidth);
        }
        if (labelHeight != -3){
            setLabelHeight(labelHeight);
        }



        if (labelMaxWidth != 0){
            setMaxLabelWidth(labelMaxWidth);
        }
        if (labelMaxHeight != 0){
            setMaxLabelHeight(labelMaxHeight);
        }

        if (a.hasValue(R.styleable.LabelledTextView_labelWeight)){
            setLabelWeight(a.getInt(R.styleable.LabelledTextView_labelWeight, 1));
        }else{
            setLabelWeight(a.getInt(R.styleable.LabelledTextView_labelWeight, 1));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelTextAllCaps)) {
            setLabelTextAllCaps(a.getBoolean(R.styleable.LabelledTextView_labelTextAllCaps, false));
        }

        if (a.hasValue(R.styleable.LabelledTextView_labelTextColor)) {
            setLabelTextColor(a.getColor(R.styleable.LabelledTextView_labelTextColor,
                    context.getResources().getColor(
                            android.R.color.black)));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelTextIsSelectable)) {
            setLabelTextIsSelectable(a.getBoolean(R.styleable.LabelledTextView_labelTextIsSelectable, false));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelTextSize)) {
            setLabelTextSize(a.getDimension(R.styleable.LabelledTextView_labelTextSize, 8));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelBackgroundColor)) {
            setLabelBackgroundColor(a.getColor(R.styleable.LabelledTextView_labelBackgroundColor,
                    context.getResources().getColor( android.R.color.background_light) ) );
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelEnabled)) {
            setLabelEnabled(a.getBoolean(R.styleable.LabelledTextView_labelEnabled, true));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelAlpha)) {
            setLabelAlpha(a.getFloat(R.styleable.LabelledTextView_labelAlpha, 1));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelLines)) {
            setLabelLines(a.getInt(R.styleable.LabelledTextView_labelLines, 1));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelMinLines)) {
            setLabelMinLines(a.getInt(R.styleable.LabelledTextView_labelMinLines
                    , 1));
        }
        if (a.hasValue(R.styleable.LabelledTextView_labelMaxLines)) {
            setLabelMaxLines(a.getInt(R.styleable.LabelledTextView_labelMaxLines, 1));
        }
        /*if (a.hasValue(R.styleable.LabelledTextView_labelMaxLength)) {
            setLabelMaxLength(a.getInt(R.styleable.LabelledTextView_labelMaxLength, -1));
        }*/
    }

    public void setLabelText(String labelText) {
        labelView.setText(labelText);
    }

    public CharSequence getLabelText() {
        return labelView.getText();
    }


    public void setLabelMaxLines(int labelMaxLines) {
        labelView.setMaxLines(labelMaxLines);
    }

    public void setLabelMinLines(int labelMinLines) {
        labelView.setMinLines(labelMinLines);
    }


    public void setLabelLines(int labelLines) {
        labelView.setLines(labelLines);
    }

    public void setLabelAlpha(float labelAlpha) {
        labelView.setAlpha(labelAlpha);
    }

    public void setLabelEnabled(boolean labelEnabled) {
        labelView.setEnabled(labelEnabled);
    }


    public void setLabelBackgroundColor(int labelBackground) {
        labelView.setBackgroundColor(labelBackground);
    }

    public void setLabelTextSize(float labelTextSize) {
        labelView.setTextSize(labelTextSize);
    }

    public void setLabelTextAllCaps(boolean labelTextAllCaps) {
        labelView.setAllCaps(labelTextAllCaps);
    }

    public void setLabelTextIsSelectable(boolean labelTextIsSelectable) {
        labelView.setTextIsSelectable(labelTextIsSelectable);
    }

    public void setLabelTextColor(int labelTextColor) {
        labelView.setTextColor(labelTextColor);
    }

    public void setLabelHeight(float labelHeight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) labelView.getLayoutParams();
        params.height = (int) labelHeight;
        labelView.setLayoutParams(params);
    }

    public void setLabelWidth(float labelWidth) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) labelView.getLayoutParams();
        params.width = (int) labelWidth;
        labelView.setLayoutParams(params);
    }


    public void setMaxLabelWidth(int maxWidth) {
        labelView.setMaxWidth(maxWidth);
    }


    public void setMaxLabelHeight(int maxHeight) {
        labelView.setMaxHeight(maxHeight);
    }
    
    public void setMinLabelWidth(int maxWidth) {
        labelView.setMinWidth(maxWidth);
    }


    public void setMinLabelHeight(int maxHeight) {
        labelView.setMinHeight(maxHeight);
    }

    public void setLabelWeight(int weight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) labelView.getLayoutParams();
        params.weight = weight;
        labelView.setLayoutParams(params);
    }

    public void setLabelGravity(int labelGravity) {
        labelView.setGravity(labelGravity);
        labelledTextView.invalidate();
    }

    /*public void setLabelMaxLength(int labelMaxLength) {
        labelView.setMaxL(labelMaxLength);
    }*/


    public TextView getLabelView() {
        return labelView;
    }
}
