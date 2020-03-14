package com.ahmad.labelledtextview;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class KeyValueViewer {

    Context context;
    ViewGroup parent;
    ArrayList<KVModel> data;
    HashMap<Integer, Integer> locations;

    private KeyValueViewer(Context context) {
        this.context = context;
        this.data = new ArrayList<>();
        this.locations = new HashMap<Integer, Integer>();
    }

    public KeyValueViewer(Context context, ArrayList<KVModel> data, ViewGroup parent) {
        this(context);
        this.data = data;
        this.parent = parent;
        show();
    }

    private void showItem(int x, Attributes attributes){
        LabelledTextView view = new LabelledTextView(context);

        view.setOrientation(attributes.getOrientation());
        view.setGravity(attributes.getGravity());

        view.setLabelText(attributes.getKeyName());
        view.setLabelHeight(attributes.getLabelLayoutHeight());
        view.setLabelWidth(attributes.getLabelLayoutWidth());
        if (attributes.getLabelHeight() != 0){
            view.setLabelHeight(attributes.getLabelHeight());
        }
        if (attributes.getLabelWidth() != 0){
            view.setLabelWidth(attributes.getLabelWidth());
        }
        if (attributes.getLabelWeight() != 0){
            view.setLabelWeight(attributes.getLabelWeight());
        }

        if (attributes.getMaxLabelWidth() != 0){
            view.setMaxLabelWidth(attributes.getMaxLabelWidth());
        }

        if (attributes.getMaxLabelHeight() != 0){
            view.setMaxLabelHeight(attributes.getMaxLabelHeight());
        }

        if (attributes.getMaxValueWidth() != 0){
            view.setMaxValueWidth(attributes.getMaxValueWidth());
        }


        if (attributes.getMaxValueHeight() != 0){
            view.setMaxValueHeight(attributes.getMaxValueHeight());
        }



        view.setLabelGravity(attributes.getLabelGravity());

        view.setLabelMaxLines(attributes.getLabelMaxLines());
        view.setLabelMinLines(attributes.getLabelMinLines());
        view.setLabelLines(attributes.getLabelLines());
        view.setLabelAlpha(attributes.getLabelAlpha());
        view.setLabelEnabled(attributes.isLabelEnabled());
        if (attributes.getLabelBackgroundColor() != 0){
            view.setLabelBackgroundColor( context.getResources().getColor(attributes.getLabelBackgroundColor()
            ));
        }
        if (attributes.getLabelTextSize() != 0) {
            view.setLabelTextSize( attributes.getLabelTextSize());
        }
        view.setLabelTextAllCaps(attributes.isLabelTextAllCaps());
        view.setLabelTextIsSelectable(attributes.isLabelTextIsSelectable());
        if (attributes.getLabelTextColor() != 0) {
            view.setLabelTextColor( context.getResources().getColor( attributes.getLabelTextColor()));
        }



        view.setValueEditable(attributes.isValueEditable());
        view.setValueText(attributes.getValue());

        view.setValueHeight(attributes.getValueLayoutHeight());
        view.setValueWidth(attributes.getValueLayoutWidth());
        if (attributes.getValueHeight() != 0){
            view.setValueHeight(attributes.getValueHeight());
        }
        if (attributes.getValueWidth() != 0){
            view.setValueWidth(attributes.getValueWidth());
        }
        if (attributes.getValueWeight() != 0){
            view.setValueWeight(attributes.getValueWeight());
        }

        view.setValueMaxLines(attributes.getValueMaxLines());
        view.setValueMinLines(attributes.getValueMinLines());
        view.setValueLines(attributes.getValueLines());
        view.setValueAlpha(attributes.getValueAlpha());
        view.setValueEnabled(attributes.isValueEnabled());
        if (attributes.getValueBackgroundColor() != 0){
            view.setValueBackgroundColor(context.getResources().getColor(
                    attributes.getValueBackgroundColor()));
        }

        if (attributes.getValueTextSize() != 0) {
            view.setValueTextSize(attributes.getValueTextSize());
        }
        view.setValueTextAllCaps(attributes.isValueTextAllCaps());
        view.setValueTextIsSelectable(attributes.isValueTextIsSelectable());

        view.setValueTextColor( context.getResources().getColor(attributes.getValueTextColor()));
        view.setValueGravity(attributes.getValueGravity());


        int index = parent.getChildCount();
        parent.addView(view);
        locations.put( x, index );
    }

    private void show() {
        for ( int x = 0; x < data.size() ; x ++ ){
            KVModel model = data.get(x);
            Attributes attributes = model.getAttributes();
            showItem(x, attributes);
        }
    }

    public void clear(){
        for (int index: locations.values()){
            parent.removeViewAt(index);
        }
        data.clear();
        locations.clear();
    }

    public void addItem(KVModel model){
        data.add(model);
        showItem(data.indexOf(model), model.getAttributes());
    }

    public void removeItem(int index){
        HashMap newLocations = new HashMap();
        data.remove(index);
        Set<Integer> keySet = locations.keySet();
        for ( Integer k : keySet ){
            if (k < index){
                newLocations.put(k, locations.get(k));
            }else if ( k == index){
                int viewIndex = locations.get( k );
                parent.removeViewAt(viewIndex);
                continue;
            }
            if (k > index ){
                Integer val = locations.get(k);
                newLocations.put( k - 1, val -1 );
                continue;
            }
        }
        locations = newLocations;
    }

    public ArrayList<KVModel> getData() {
        return data;
    }

    public KVModel getItem(int pos){
        return data.get(pos);
    }

    public View getItemView(int pos){
        for ( Integer k : locations.keySet() ){
            if ( k == pos){
                int viewIndex = locations.get( k );
                return parent.getChildAt(viewIndex);
            }
        }
        return null;
    }


}
