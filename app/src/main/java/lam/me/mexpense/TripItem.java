package lam.me.mexpense;

import java.util.Date;

public class TripItem {
    int id;
    String tripName;
    String destination;
    Date tripDate;
    Boolean requireRiskAssessment;
    String description;
    Double duration;
    Boolean isStayBehind;

    public TripItem(String tripName, String destination) {
        this.tripName = tripName;
        this.destination = destination;
    }
    public TripItem(int id, String tripName, String destination, Date tripDate, Boolean requireRiskAssessment, String description, Double duration, Boolean isStayBehind) {
        this.id = id;
        this.tripName = tripName;
        this.destination = destination;
        this.tripDate = tripDate;
        this.requireRiskAssessment = requireRiskAssessment;
        this.description = description;
        this.duration = duration;
        this.isStayBehind = isStayBehind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getTripDate() {
        return tripDate;
    }

    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }

    public Boolean getRequireRiskAssessment() {
        return requireRiskAssessment;
    }

    public void setRequireRiskAssessment(Boolean requireRiskAssessment) {
        this.requireRiskAssessment = requireRiskAssessment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Boolean getStayBehind() {
        return isStayBehind;
    }

    public void setStayBehind(Boolean stayBehind) {
        isStayBehind = stayBehind;
    }
}
