package com.ahmad.labelledtextview;

import android.view.Gravity;
import android.widget.LinearLayout;

public class Attributes {

    public static enum Types {
        String
    }

    int orientation = LinearLayout.HORIZONTAL;
    int gravity     = Gravity.CENTER;
    String keyName = "";
    int labelGravity = Gravity.NO_GRAVITY;

    float labelWidth;
    float labelHeight;

    int maxLabelWidth =0;
    int maxLabelHeight =0;
    int maxValueWidth =0;
    int maxValueHeight =0;

    int minLabelWidth =0;
    int minLabelHeight =0;
    int minValueWidth =0;
    int minValueHeight =0;

    // wrap =-2
    // match = -1
    int labelLayoutWidth = LinearLayout.LayoutParams.WRAP_CONTENT;
    int labelLayoutHeight = LinearLayout.LayoutParams.MATCH_PARENT;

    int labelWeight = 0 ;
    int valueWeight = 0;
    boolean labelTextAllCaps = false;
    int labelTextColor = 0;
    boolean labelTextIsSelectable = false;

    float labelTextSize ;

    int labelBackgroundColor = 0;
    boolean labelEnabled = false;
    float labelAlpha = 1;
    int labelLines = 1;
    int labelMinLines = 1;
    int labelMaxLines = 1;

    String value = "";
    int valueGravity = Gravity.NO_GRAVITY;

    float valueWidth;
    float valueHeight;

    int valueLayoutWidth= LinearLayout.LayoutParams.WRAP_CONTENT;
    int valueLayoutHeight = LinearLayout.LayoutParams.MATCH_PARENT;
    boolean valueTextAllCaps = false;
    int valueTextColor =android.R.color.black;
    boolean valueTextIsSelectable = false;

    float valueTextSize ;

    int valueBackgroundColor;
    boolean valueEnabled = false;
    float valueAlpha = 1;
    int valueLines = 1;
    int valueMinLines =1;
    int valueMaxLines = 1;
    boolean valueEditable = false;


    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public int getLabelGravity() {
        return labelGravity;
    }

    public void setLabelGravity(int labelGravity) {
        this.labelGravity = labelGravity;
    }

    public float getLabelWidth() {
        return labelWidth;
    }

    public void setLabelWidth(float labelWidth) {
        this.labelWidth = labelWidth;
    }

    public float getLabelHeight() {
        return labelHeight;
    }

    public void setLabelHeight(float labelHeight) {
        this.labelHeight = labelHeight;
    }

    public int getLabelLayoutWidth() {
        return labelLayoutWidth;
    }

    public void setLabelLayoutWidth(int labelLayoutWidth) {
        this.labelLayoutWidth = labelLayoutWidth;
    }

    public int getLabelLayoutHeight() {
        return labelLayoutHeight;
    }

    public void setLabelLayoutHeight(int labelLayoutHeight) {
        this.labelLayoutHeight = labelLayoutHeight;
    }

    public int getLabelWeight() {
        return labelWeight;
    }

    public void setLabelWeight(int labelWeight) {
        this.labelWeight = labelWeight;
    }

    public int getValueWeight() {
        return valueWeight;
    }

    public void setValueWeight(int valueWeight) {
        this.valueWeight = valueWeight;
    }

    public boolean isLabelTextAllCaps() {
        return labelTextAllCaps;
    }

    public void setLabelTextAllCaps(boolean labelTextAllCaps) {
        this.labelTextAllCaps = labelTextAllCaps;
    }

    public int getLabelTextColor() {
        return labelTextColor;
    }

    public void setLabelTextColor(int labelTextColor) {
        this.labelTextColor = labelTextColor;
    }

    public boolean isLabelTextIsSelectable() {
        return labelTextIsSelectable;
    }

    public void setLabelTextIsSelectable(boolean labelTextIsSelectable) {
        this.labelTextIsSelectable = labelTextIsSelectable;
    }

    public float getLabelTextSize() {
        return labelTextSize;
    }

    public void setLabelTextSize(float labelTextSize) {
        this.labelTextSize = labelTextSize;
    }

    public int getLabelBackgroundColor() {
        return labelBackgroundColor;
    }

    public void setLabelBackgroundColor(int labelBackgroundColor) {
        this.labelBackgroundColor = labelBackgroundColor;
    }

    public boolean isLabelEnabled() {
        return labelEnabled;
    }

    public void setLabelEnabled(boolean labelEnabled) {
        this.labelEnabled = labelEnabled;
    }

    public float getLabelAlpha() {
        return labelAlpha;
    }

    public void setLabelAlpha(float labelAlpha) {
        this.labelAlpha = labelAlpha;
    }

    public int getLabelLines() {
        return labelLines;
    }

    public void setLabelLines(int labelLines) {
        this.labelLines = labelLines;
    }

    public int getLabelMinLines() {
        return labelMinLines;
    }

    public void setLabelMinLines(int labelMinLines) {
        this.labelMinLines = labelMinLines;
    }

    public int getLabelMaxLines() {
        return labelMaxLines;
    }

    public void setLabelMaxLines(int labelMaxLines) {
        this.labelMaxLines = labelMaxLines;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getValueGravity() {
        return valueGravity;
    }

    public void setValueGravity(int valueGravity) {
        this.valueGravity = valueGravity;
    }

    public float getValueWidth() {
        return valueWidth;
    }

    public void setValueWidth(float valueWidth) {
        this.valueWidth = valueWidth;
    }

    public float getValueHeight() {
        return valueHeight;
    }

    public void setValueHeight(float valueHeight) {
        this.valueHeight = valueHeight;
    }

    public int getMaxLabelWidth() {
        return maxLabelWidth;
    }

    public void setMaxLabelWidth(int maxLabelWidth) {
        this.maxLabelWidth = maxLabelWidth;
    }

    public int getMaxLabelHeight() {
        return maxLabelHeight;
    }

    public void setMaxLabelHeight(int maxLabelHeight) {
        this.maxLabelHeight = maxLabelHeight;
    }


    public int getMinLabelWidth() {
        return minLabelWidth;
    }

    public void setMinLabelWidth(int minLabelWidth) {
        this.minLabelWidth = minLabelWidth;
    }

    public int getMinLabelHeight() {
        return minLabelHeight;
    }

    public void setMinLabelHeight(int minLabelHeight) {
        this.minLabelHeight = minLabelHeight;
    }
    
    public int getMaxValueWidth() {
        return maxValueWidth;
    }

    public void setMaxValueWidth(int maxValueWidth) {
        this.maxValueWidth = maxValueWidth;
    }

    public int getMaxValueHeight() {
        return maxValueHeight;
    }

    public void setMaxValueHeight(int maxValueHeight) {
        this.maxValueHeight = maxValueHeight;
    }

    public int getMinValueWidth() {
        return minValueWidth;
    }

    public void setMinValueWidth(int minValueWidth) {
        this.minValueWidth = minValueWidth;
    }

    public int getMinValueHeight() {
        return minValueHeight;
    }

    public void setMinValueHeight(int minValueHeight) {
        this.minValueHeight = minValueHeight;
    }


    public int getValueLayoutWidth() {
        return valueLayoutWidth;
    }

    public void setValueLayoutWidth(int valueLayoutWidth) {
        this.valueLayoutWidth = valueLayoutWidth;
    }

    public int getValueLayoutHeight() {
        return valueLayoutHeight;
    }

    public void setValueLayoutHeight(int valueLayoutHeight) {
        this.valueLayoutHeight = valueLayoutHeight;
    }

    public boolean isValueTextAllCaps() {
        return valueTextAllCaps;
    }

    public void setValueTextAllCaps(boolean valueTextAllCaps) {
        this.valueTextAllCaps = valueTextAllCaps;
    }

    public int getValueTextColor() {
        return valueTextColor;
    }

    public void setValueTextColor(int valueTextColor) {
        this.valueTextColor = valueTextColor;
    }

    public boolean isValueTextIsSelectable() {
        return valueTextIsSelectable;
    }

    public void setValueTextIsSelectable(boolean valueTextIsSelectable) {
        this.valueTextIsSelectable = valueTextIsSelectable;
    }

    public float getValueTextSize() {
        return valueTextSize;
    }

    public void setValueTextSize(float valueTextSize) {
        this.valueTextSize = valueTextSize;
    }

    public int getValueBackgroundColor() {
        return valueBackgroundColor;
    }

    public void setValueBackgroundColor(int valueBackgroundColor) {
        this.valueBackgroundColor = valueBackgroundColor;
    }

    public boolean isValueEnabled() {
        return valueEnabled;
    }

    public void setValueEnabled(boolean valueEnabled) {
        this.valueEnabled = valueEnabled;
    }

    public float getValueAlpha() {
        return valueAlpha;
    }

    public void setValueAlpha(float valueAlpha) {
        this.valueAlpha = valueAlpha;
    }

    public int getValueLines() {
        return valueLines;
    }

    public void setValueLines(int valueLines) {
        this.valueLines = valueLines;
    }

    public int getValueMinLines() {
        return valueMinLines;
    }

    public void setValueMinLines(int valueMinLines) {
        this.valueMinLines = valueMinLines;
    }

    public int getValueMaxLines() {
        return valueMaxLines;
    }

    public void setValueMaxLines(int valueMaxLines) {
        this.valueMaxLines = valueMaxLines;
    }

    public boolean isValueEditable() {
        return valueEditable;
    }

    public void setValueEditable(boolean valueEditable) {
        this.valueEditable = valueEditable;
    }
}
