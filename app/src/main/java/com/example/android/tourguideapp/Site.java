package com.example.android.tourguideapp;

/**
 * {@link Site} represents a vocabulary word that the user wants to learn.
 * It contains the Miwok word and its corresponding default translation.
 * Created by Vicuko on 17/7/17.
 */

public class Site {

    private String mSiteName;
    private String mSiteDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mLocationId;

    public Site(String siteName, String siteDescription, int locationId) {
        mSiteName = siteName;
        mSiteDescription = siteDescription;
        mLocationId = locationId;
    }

    public Site(String siteName, String siteDescription, int imageResourceId, int locationId) {
        mSiteName = siteName;
        mSiteDescription = siteDescription;
        mImageResourceId = imageResourceId;
        mLocationId = locationId;
    }

    public String getSiteName() {
        return mSiteName;
    }

    public String getSiteDescription() {
        return mSiteDescription;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getLocationId(){
        return mLocationId;
    }

    /**
     * Returns whether or not there is an image for this word.
     * @return
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}