package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date date;

    // Constructor 1: Sets date to current date (default)
    public Mood() {
        this.date = new Date();
    }

    // Constructor 2: Takes a date as argument
    public Mood(Date date) {
        this.date = date;
    }

    // Getter for date
    public Date getDate() {
        return date;
    }

    // Setter for date
    public void setDate(Date date) {
        this.date = date;
    }

    // Abstract method that must be implemented by subclasses
    public abstract String getMoodDescription();
}