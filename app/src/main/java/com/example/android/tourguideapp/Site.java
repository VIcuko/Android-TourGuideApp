package com.example.android.tourguideapp;

/**
 * {@link Site} represents a vocabulary word that the user wants to learn.
 * It contains the Miwok word and its corresponding default translation.
 * Created by Vicuko on 17/7/17.
 */

public class Site {

    private String mMiWokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Site(String defaultTranslation, String miWokTranslation, int audioResourceId) {
        mMiWokTranslation = miWokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Site(String defaultTranslation, String miWokTranslation, int imageResourceId, int audioResourceId) {
        mMiWokTranslation = miWokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Method to retrieve the default word for this Site pair.
     */
    public String getDefautltTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Method to retrieve the tourguideapp word for this Site pair.
     */
    public String getMiWokTranslation() {
        return mMiWokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     * @return
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
