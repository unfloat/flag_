package com.flag.app.viewholders;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.flag.app.R;

public class EventViewHolder extends RecyclerView.ViewHolder {
    public TextView eventTitle;
    public TextView organizer;
    public LinearLayout visitedCountryLayout;

    public EventViewHolder(@NonNull View itemView) {
        super(itemView);

        eventTitle = (TextView) itemView.findViewById(R.id.event_title);
        organizer = (TextView) itemView.findViewById(R.id.event_organizer);
    }

    public TextView getEventTitle(){
        return eventTitle;
    }
    public TextView getOrganizer(){
        return organizer;
    }

    /* test
     public LinearLayout getVisitedCountryLayout()
    {
        return visitedCountryLayout;
    }
     */
}

