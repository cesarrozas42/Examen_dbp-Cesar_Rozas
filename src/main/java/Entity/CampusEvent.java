package Entity;

import java.time.ZonedDateTime;

public class CampusEvent {
    public double id;
    public long organizerld;
    public String title;
    public String description;
    public String category;
    public ZonedDateTime eventDate;
    public String Location;
    public String Status;

    public double getIdevent() {
        return id;
    }

    public void setIdevent(double idevent) {
        this.id = idevent;
    }

    public long getOrganizerld() {
        return organizerld;
    }

    public void setOrganizerld(long organizerld) {
        this.organizerld = organizerld;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ZonedDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(ZonedDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}

