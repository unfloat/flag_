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
import com.flag.app.viewholders.EventViewHolder;

import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventViewHolder> {
    private List<Event> listEvent;
    public EventsAdapter(List<Event> listEvent) {
        this.listEvent = listEvent;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.list_events_item;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = listEvent.get(position);
        holder.getEventTitle().setText(String.valueOf(event.getEventTitle()));
        holder.getOrganizer().setText(String.valueOf(event.getOrganizer()));
        //holder.getVisitedCountryLayout().findViewWithTag("event_title").setT
    }

    @Override
    public int getItemCount() {
        return listEvent.size();
    }

}
