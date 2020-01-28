package com.ahmad.labelledtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LabelledTextView extends LinearLayout {
    LinearLayout linearLayout;
    private TextView valueView;
    private TextView labelView;
    private int orientation = LinearLayout.HORIZONTAL;

    public LabelledTextView(Context context) {
        this(context, null);
    }

    public LabelledTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.LabelledTextView, 0, 0);
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.labelled_text_view, this, true);
        labelView = findViewById(R.id.labelledTextViewLabel);
        valueView =  findViewById(R.id.labelledTextViewValue);
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
            context.getResources().getColor(android.R.color.background_light)));
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
        if (a.hasValue(R.styleable.LabelledTextView_labelMaxLength)) {
            setLabelMaxLength(a.getInt(R.styleable.LabelledTextView_labelMaxLength, -1));
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
            setValueEnabled(a.getBoolean(R.styleable.LabelledTextView_valueEnabled, true));
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
        if (a.hasValue(R.styleable.LabelledTextView_valueMaxLength)) {
            setValueMaxLength(a.getInt(R.styleable.LabelledTextView_valueMaxLength, -1));
        }
        setOrientation(orientation);
        if (a.hasValue(R.styleable.LabelledTextView_orientation)) {
            setOrientation(a.getInt(R.styleable.LabelledTextView_orientation, orientation));
        }else{
            setOrientation(orientation);
        }
        a.recycle();
        setGravity(Gravity.CENTER_HORIZONTAL);
    }

    private void setValueInputType(int valueInputType) {
        valueView.setInputType(valueInputType);
    }

    public void setValueText(String valueText) {
        valueView.setText(valueText);
    }

    public void setLabelText(String labelText) {
        labelView.setText(labelText);
    }

    public CharSequence getLabelText() {
        return labelView.getText();
    }

    public CharSequence getValueText() {
        return valueView.getText();
    }

    @Override
    public int getOrientation() {
        return orientation;
    }

    @Override
    public void setOrientation(int orientation) {
        this.orientation = orientation;
        super.setOrientation(orientation);
    }

    @Override
    public void setGravity(int gravity) {
        //this.gravity = gravity;
        super.setGravity(gravity);
        invalidate();
    }

    public TextView getValueView() {
        return valueView;
    }

    public TextView getLabelView() {
        return labelView;
    }

    public void setLabelMaxLength(int labelMaxLength) {
        //labelView.setMaxLines(labelMaxLength);
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
        LayoutParams params = (LinearLayout.LayoutParams) labelView.getLayoutParams();
        params.width = (int) labelWidth;
        labelView.setLayoutParams(params);
    }

    public void setLabelWeight(int weight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) labelView.getLayoutParams();
        params.weight = weight;
        labelView.setLayoutParams(params);
    }

    public void setLabelGravity(int labelGravity) {
        labelView.setGravity(labelGravity);
        invalidate();
    }

    public void setValueHeight(float valueHeight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) valueView.getLayoutParams();
        params.height = (int) valueHeight;
        valueView.setLayoutParams(params);
    }

    public void setValueWidth(float valueWidth) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) valueView.getLayoutParams();
        params.width = (int) valueWidth;
        valueView.setLayoutParams(params);
    }

    public void setValueWeight(int weight) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) valueView.getLayoutParams();
        params.weight = weight;
        valueView.setLayoutParams(params);
    }

    public void setValueMaxLength(int valueMaxLength) {
        //valueView.setMaxL
    }

    public void setValueMaxLines(int valueMaxLines) {
        valueView.setMaxLines(valueMaxLines);
    }


    public void setValueMinLines(int valueMinLines) {
        valueView.setMinLines(valueMinLines);
    }


    public void setValueLines(int valueLines) {
        valueView.setLines(valueLines);
    }

    public void setValueAlpha(float valueAlpha) {
        valueView.setAlpha(valueAlpha);
    }


    public void setValueEnabled(boolean valueEnabled) {
        valueView.setEnabled(valueEnabled);
    }


    public void setValueBackgroundColor(int valueBackground) {
        valueView.setBackgroundColor(valueBackground);
    }

    public void setValueTextSize(float valueTextSize) {
        valueView.setTextSize(valueTextSize);
    }

    public void setValueTextAllCaps(boolean valueTextAllCaps) {
        valueView.setAllCaps(valueTextAllCaps);
    }

    public void setValueTextIsSelectable(boolean valueTextIsSelectable) {
        valueView.setTextIsSelectable(valueTextIsSelectable);
    }

    public void setValueTextColor(int valueTextColor) {
        valueView.setTextColor(valueTextColor);
    }

    public void setValueGravity(int valueGravity) {
        valueView.setGravity(valueGravity);
        invalidate();
    }
    /*@Override
    protected void onMeasure(int widthMeasureSpec,
                             int heightMeasureSpec) {
        //setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
        int desiredWidth = 0;
        int desiredHeight= 0;
        if (labelView != null && valueView != null){
            Log.i("xxx",labelView.toString());
            measureChild(labelView, widthMeasureSpec, heightMeasureSpec);
            measureChild(valueView, widthMeasureSpec, heightMeasureSpec);
            desiredWidth =
                    labelView.getMeasuredWidth() + valueView.getMeasuredWidth() + getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
            desiredHeight =
                    labelView.getMeasuredHeight() + valueView.getMeasuredHeight() + getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
            Log.i("xxx", "w"+ desiredWidth + "h"+ desiredHeight);
        }else {
            desiredWidth  = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
            desiredHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        }
        Log.i("xxx", ""+measureDimension(desiredWidth, widthMeasureSpec));
        Log.i("xxx", ""+measureDimension(desiredHeight, heightMeasureSpec));
        *//*setMeasuredDimension(measureDimension(desiredWidth, widthMeasureSpec),
                measureDimension(desiredHeight, heightMeasureSpec));*//*
        setMeasuredDimension(500, 100);
        Log.i("xxx","out");
    }*/

    private int measureDimension(int desiredSize, int measureSpec) {
        int result;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else {
            result = desiredSize;
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }
        return result;
    }

}
