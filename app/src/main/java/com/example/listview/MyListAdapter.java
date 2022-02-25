package com.example.listview;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter<String> {
    private final String[] listitem;
    private final Activity context;

    public MyListAdapter(Activity context,String[] listitem) {
        super(context, R.layout.activity_list,listitem);
        this.listitem = listitem;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View view,ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.activity_list,null,true);

        TextView textView = (TextView) rowview.findViewById(R.id.item_list);
        textView.setText(listitem[position]);
        Log.d("nb", listitem[position]);


        return rowview;


    }
}
