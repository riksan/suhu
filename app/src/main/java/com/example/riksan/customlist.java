package com.example.riksan.suhu;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by riksan on 21/11/17.
 */

public class customlist extends ArrayAdapter{

    private final Context context;
    private final String[] Values;

    public customlist(@NonNull Context context, String[] values) {
        super(context,R.layout.listvi,values);
        this.context = context;
        Values = values;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.listvi, parent, false);
        TextView tv = (TextView) rowView.findViewById(R.id.label);
        ImageView iv = (ImageView) rowView.findViewById(R.id.logo);

        switch (position){
            case 0 :
                iv.setImageResource(R.drawable.celcius1);
                tv.setText(Values[0]);
                break;
            case 1 :
                iv.setImageResource(R.drawable.reamur);
                tv.setText(Values[1]);
                break;
            case 2 :
                iv.setImageResource(R.drawable.fahrenheit);
                tv.setText(Values[2]);
                break;
            case 3 :
                iv.setImageResource(R.drawable.kelvin);
                tv.setText(Values[3]);
                break;
            default: break;
        }
        return rowView;
    }
}
