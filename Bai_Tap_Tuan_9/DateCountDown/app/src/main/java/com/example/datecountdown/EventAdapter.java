package com.example.datecountdown;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class EventAdapter extends BaseAdapter {
    ImageView iconAdd;
    ImageView iconDelete;

    private ListViewActivity mContext;
    private int layout;
    private List<Event> listEvent;

    public EventAdapter(ListViewActivity context, int layout, List<Event> listEvent) {
        this.mContext = context;
        this.layout = layout;
        this.listEvent = listEvent;
    }
    private class ViewHolder{
        TextView title,eventDescription,date;
    }


    @Override
    public int getCount() {
        return listEvent.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);

            //Ánh xạ
            viewHolder = new ViewHolder();
            viewHolder.title = view.findViewById(R.id.title);
            viewHolder.eventDescription = view.findViewById(R.id.event);
            viewHolder.date = view.findViewById(R.id.date);
            iconDelete = view.findViewById(R.id.delete);

            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        Event ev = listEvent.get(i);
        viewHolder.title.setText(ev.getTitle());
        viewHolder.eventDescription.setText(ev.getEventDescription());
        viewHolder.date.setText(ev.getDate());

        //Xóa một Event
        iconDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Bạn đã xóa một event", Toast.LENGTH_SHORT).show();
                mContext.Xoa(i);
            }
        });

        return view;
    }
}
