package com.ahmad.labelledtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LabelledTextView extends LinearLayout {
    LinearLayout linearLayout;

    private LabelViewHolder labelViewHolder;
    private ValueViewHolder valueViewHolder;

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

        labelViewHolder = new LabelViewHolder(this, context, a);
        valueViewHolder = new ValueViewHolder(this, context, a);

        setOrientation(orientation);
        if (a.hasValue(R.styleable.LabelledTextView_orientation)) {
            setOrientation(a.getInt(R.styleable.LabelledTextView_orientation, orientation));
        }else{
            setOrientation(orientation);
        }
        a.recycle();
        setGravity(Gravity.CENTER_HORIZONTAL);
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

    public TextView getLabelView() {
        return labelViewHolder.getLabelView();
    }


    public void setLabelText(String labelText) {
        labelViewHolder.setLabelText(labelText);
    }

    public CharSequence getLabelText() {
        return labelViewHolder.getLabelText();
    }


    public void setLabelMaxLines(int labelMaxLines) {
        labelViewHolder.setLabelMaxLines(labelMaxLines);
    }

    public void setLabelMinLines(int labelMinLines) {
        labelViewHolder.setLabelMinLines(labelMinLines);
    }


    public void setLabelLines(int labelLines) {
        labelViewHolder.setLabelLines(labelLines);
    }

    public void setLabelAlpha(float labelAlpha) {
        labelViewHolder.setLabelAlpha(labelAlpha);
    }

    public void setLabelEnabled(boolean labelEnabled) {
        labelViewHolder.setLabelEnabled(labelEnabled);
    }


    public void setLabelBackgroundColor(int labelBackground) {
        labelViewHolder.setLabelBackgroundColor(labelBackground);
    }

    public void setLabelTextSize(float labelTextSize) {
        labelViewHolder.setLabelTextSize(labelTextSize);
    }

    public void setLabelTextAllCaps(boolean labelTextAllCaps) {
        labelViewHolder.setLabelTextAllCaps(labelTextAllCaps);
    }

    public void setLabelTextIsSelectable(boolean labelTextIsSelectable) {
        labelViewHolder.setLabelTextIsSelectable(labelTextIsSelectable);
    }

    public void setLabelTextColor(int labelTextColor) {
        labelViewHolder.setLabelTextColor(labelTextColor);
    }

    public void setLabelHeight(float labelHeight) {
        labelViewHolder.setLabelHeight(labelHeight);
    }

    public void setLabelWidth(float labelWidth) {
        labelViewHolder.setLabelWidth(labelWidth);
    }


    public void setMaxLabelWidth(int maxWidth) {
        labelViewHolder.setMaxLabelWidth(maxWidth);
    }


    public void setMaxLabelHeight(int maxHeight) {
        labelViewHolder.setMaxLabelHeight(maxHeight);
    }


    public void setMaxValueWidth(int valueMaxWidth) {
        valueViewHolder.setMaxValueWidth(valueMaxWidth);
    }


    public void setMaxValueHeight(int valueMaxHeight) {
        valueViewHolder.setMaxValueHeight(valueMaxHeight);
    }


    public void setMinLabelWidth(int maxWidth) {
        labelViewHolder.setMinLabelWidth(maxWidth);
    }


    public void setMinLabelHeight(int maxHeight) {
        labelViewHolder.setMinLabelHeight(maxHeight);
    }


    public void setMinValueWidth(int valueMinWidth) {
        valueViewHolder.setMinValueWidth(valueMinWidth);
    }


    public void setMinValueHeight(int valueMinHeight) {
        valueViewHolder.setMinValueHeight(valueMinHeight);
    }

    public void setLabelWeight(int weight) {
        labelViewHolder.setLabelWeight(weight);
    }

    public void setLabelGravity(int labelGravity) {
        labelViewHolder.setLabelGravity(labelGravity);
    }


    public void setValueEditable(boolean aBoolean) {
        valueViewHolder.setValueEditable(aBoolean);
    }

    public boolean isValueEditable() {
        return valueViewHolder.isValueEditable();
    }

    public TextView getValueView(){
        return valueViewHolder.getValueView();
    }

    public CharSequence getValueText() {
        return valueViewHolder.getValueText();
    }

    public void setValueText(String valueText) {
        valueViewHolder.setValueText(valueText);
    }

    public void setValueHeight(float valueHeight) {
        valueViewHolder.setValueHeight(valueHeight);
    }

    public void setValueWidth(float valueWidth) {
        valueViewHolder.setValueWidth(valueWidth);
    }

    public void setValueWeight(int weight) {
        valueViewHolder.setValueWeight(weight);
    }


    public void setValueMaxLines(int valueMaxLines) {
        valueViewHolder.setValueMaxLines(valueMaxLines);
    }

    public void setValueMinLines(int valueMinLines) {
        valueViewHolder.setValueMinLines(valueMinLines);
    }


    public void setValueLines(int valueLines) {
        valueViewHolder.setValueLines(valueLines);
    }

    public void setValueAlpha(float valueAlpha) {
        valueViewHolder.setValueAlpha(valueAlpha);
    }


    public void setValueEnabled(boolean valueEnabled) {
        valueViewHolder.setValueEnabled(valueEnabled);
    }


    public void setValueBackgroundColor(int valueBackground) {
       valueViewHolder.setValueBackgroundColor(valueBackground);
    }

    public void setValueTextSize(float valueTextSize) {
        valueViewHolder.setValueTextSize(valueTextSize);
    }

    public void setValueTextAllCaps(boolean valueTextAllCaps) {
        valueViewHolder.setValueTextAllCaps(valueTextAllCaps);
    }

    public void setValueTextIsSelectable(boolean valueTextIsSelectable) {
        valueViewHolder.setValueTextIsSelectable(valueTextIsSelectable);
    }

    public void setValueTextColor(int valueTextColor) {
        valueViewHolder.setValueTextColor(valueTextColor);
    }

    public void setValueGravity(int valueGravity) {
        valueViewHolder.setValueGravity(valueGravity);
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
