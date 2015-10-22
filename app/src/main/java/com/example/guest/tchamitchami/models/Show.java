package com.example.guest.tchamitchami.models;

/**
 * Created by Guest on 10/22/15.
 */
public class Show {
    private String mDate;
    private String mVenue;
    private String mLocation;

    public Show(String date, String venue, String location) {
     mDate = date;
     mVenue = venue;
     mLocation = location;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getVenue() {
        return mVenue;
    }

    public void setVenue(String venue) {
        mVenue = venue;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }
}
