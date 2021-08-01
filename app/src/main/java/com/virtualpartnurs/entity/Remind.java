package com.virtualpartnurs.entity;

import java.util.Date;

public class Remind {
    String username;
    String name;
    String description;
    Date date;
    int priority;

    public Remind() {
    }

    public Remind(String username) {
        this.username = username;
    }

    public Remind(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Remind(String username, String name, String description, Date date, int priority) {
        this.username = username;
        this.name = name;
        this.description = description;
        this.date = date;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Remind{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", priority=" + priority +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
