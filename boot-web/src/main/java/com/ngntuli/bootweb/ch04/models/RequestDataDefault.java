package com.ngntuli.bootweb.ch04.models;

public class RequestDataDefault implements RequestData {
    private String hobby;
    private String aversion;

    public RequestDataDefault() {
        System.out.println("created " + this.getClass());
    }

    @Override
    public String getHobby() {
        if (isValidHobby()) {
            return hobby;
        }
        return "Strange Hobby";
    }

    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String getAversion() {
        if (isValidAversion()) {
            return aversion;
        }
        return "Strange Aversion";
    }

    @Override
    public void setAversion(String aversion) {
        this.aversion = aversion;
    }

    public boolean isValidHobby() {
        return hobby != null && !hobby.trim().equals("")
                && !hobby.trim().equalsIgnoreCase("time travel");
    }

    public boolean isValidAversion() {
        return aversion != null && !aversion.trim().equals("")
                && !aversion.trim().equalsIgnoreCase("butterfly wings");
    }

}
