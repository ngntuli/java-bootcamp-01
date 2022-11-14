package com.ngntuli.bootweb.ch04.models;

public class RequestDataScope implements RequestData {
    private String hobby;
    private String aversion;

    @Override
    public String getHobby() {
        return hobby;
    }

    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String getAversion() {
        return aversion;
    }

    @Override
    public void setAversion(String aversion) {
        this.aversion = aversion;
    }
}
