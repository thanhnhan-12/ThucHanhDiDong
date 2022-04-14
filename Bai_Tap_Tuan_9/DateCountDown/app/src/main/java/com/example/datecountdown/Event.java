package com.example.datecountdown;

import java.io.Serializable;

public class Event implements Serializable {
    String title, eventDescription, date;

    public Event(String title, String eventDescription, String date) {
        this.title = title;
        this.eventDescription = eventDescription;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
