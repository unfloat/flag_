package com.flag.app.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flag.app.R;
import com.flag.app.model.Event;

import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventViewHolder> {
    private List<Event> listEvent;

    public EventsAdapter(List<Event> listEvent) {
        this.listEvent = listEvent;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View listEventView = inflater.inflate(R.layout.fragment_list_events, parent, false);
        // Return a new holder instance
        return new EventViewHolder(listEventView);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = listEvent.get(position);
        //String title = holder.eventTitle.toString();;


        holder.eventTitle.setText(event.getEventTitle());
        TextView organizer = holder.organizer;
        organizer.setText((CharSequence) event.getOrganizer());

    }




    @Override
    public int getItemCount() {
        return listEvent.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {
        public TextView eventTitle;
        public TextView organizer;

        public EventViewHolder( @NonNull View itemView) {
            super(itemView);


            eventTitle = (TextView) itemView.findViewById(R.id.event_title);
            eventTitle.setText("ddddddd");
           Log.d("tet", (String) eventTitle.getText());
            organizer = (TextView) itemView.findViewById(R.id.event_organizer);
        }
    }
}
