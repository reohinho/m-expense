package lam.me.mexpense;

import java.util.Date;

public class TripItem {
    String id;
    String tripName;
    String destination;
    String tripDate;
    String requireRiskAssessment;
    String description;
    String duration;
    String isStayBehind;

    public TripItem(String id, String tripName, String tripDate, String destination,  String requireRiskAssessment, String description, String duration, String isStayBehind) {
        this.id = id;
        this.tripName = tripName;
        this.destination = destination;
        this.tripDate = tripDate;
        this.requireRiskAssessment = requireRiskAssessment;
        this.description = description;
        this.duration = duration;
        this.isStayBehind = isStayBehind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTripDate() {
        return tripDate;
    }

    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }

    public String getRequireRiskAssessment() {
        return requireRiskAssessment;
    }

    public void setRequireRiskAssessment(String requireRiskAssessment) {
        this.requireRiskAssessment = requireRiskAssessment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIsStayBehind() {
        return isStayBehind;
    }

    public void setIsStayBehind(String isStayBehind) {
        this.isStayBehind = isStayBehind;
    }
}
