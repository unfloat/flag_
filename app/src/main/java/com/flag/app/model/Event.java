package com.flag.app.model;

public class Event {
    private String eventTitle;
    private String organizer;
    private int numberOfPeople;

    public Event(String eventTitle, String organizer, int numberOfPeople) {
        this.eventTitle = eventTitle;
        this.organizer = organizer;
        this.numberOfPeople = numberOfPeople;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventTitle='" + eventTitle + '\'' +
                ", organizer='" + organizer + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}
