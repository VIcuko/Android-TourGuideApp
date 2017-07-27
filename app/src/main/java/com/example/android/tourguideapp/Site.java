package com.example.android.tourguideapp;

/**
 * {@link Site} represents a vocabulary word that the user wants to learn.
 * It contains the Miwok word and its corresponding default translation.
 * Created by Vicuko on 17/7/17.
 */

public class Site {

    private int mSiteNameId;
    private int mSiteDescriptionId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mLocationId;
    private int mPrice;

    public Site(int siteNameId, int siteDescriptionId, int locationId, int price) {
        mSiteNameId = siteNameId;
        mSiteDescriptionId = siteDescriptionId;
        mLocationId = locationId;
        mPrice = price;
    }

    public Site(int siteNameId, int siteDescriptionId, int imageResourceId, int locationId, int price) {
        mSiteNameId = siteNameId;
        mSiteDescriptionId = siteDescriptionId;
        mImageResourceId = imageResourceId;
        mLocationId = locationId;
        mPrice = price;
    }

    public int getSiteNameId() {
        return mSiteNameId;
    }

    public int getSiteDescriptionId() {
        return mSiteDescriptionId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getLocationId() {
        return mLocationId;
    }

    /**
     * Returns whether or not there is an image for this word.
     *
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getPrice() {
        return mPrice;
    }
}
