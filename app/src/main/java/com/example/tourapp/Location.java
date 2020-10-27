package com.example.tourapp;

public class Location {
    private int mTitleId;
    private int mDescriptionId;
    private int mImageResourceId;

    public Location(int mTitleId, int mDescriptionId, int mImageResourceId) {
        this.mTitleId = mTitleId;
        this.mDescriptionId = mDescriptionId;
        this.mImageResourceId = mImageResourceId;
    }

    public int getDescriptionId() {
        return mDescriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.mDescriptionId = descriptionId;
    }

    public int getTitleId() {
        return mTitleId;
    }

    public void setTitleId(int titleId) {
        this.mTitleId = titleId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }
}
