package Entity;

import java.time.ZonedDateTime;

public class EventRegistration {
    public long id;
    public long eventld;
    public long ticketTypedId;
    public long attendeeId;
    public ZonedDateTime registeredAt;
    public String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEventld() {
        return eventld;
    }

    public void setEventld(long eventld) {
        this.eventld = eventld;
    }

    public long getTicketTypedId() {
        return ticketTypedId;
    }

    public void setTicketTypedId(long ticketTypedId) {
        this.ticketTypedId = ticketTypedId;
    }

    public long getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(long attendeeId) {
        this.attendeeId = attendeeId;
    }

    public ZonedDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(ZonedDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}