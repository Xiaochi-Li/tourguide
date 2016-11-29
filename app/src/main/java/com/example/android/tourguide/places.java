package com.example.android.tourguide;

/**
 * Created by lixiaochi on 28/11/16.
 */

public class places {
    private Integer imageResourcId = NO_IMAGE_PROVIDED;
    private Integer stringResourcId =NO_STRING_PROVIDED;
    private Integer textResourcId = NO_TEXT_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;
    private static final int NO_STRING_PROVIDED =-1;
    private static final int NO_TEXT_PROVIDED =-1;

    public places (Integer imageResourcId,Integer stringResourcId,Integer textResourcId){
        this.imageResourcId =imageResourcId;
        this.textResourcId = textResourcId;
        this.stringResourcId = stringResourcId;
    }

    public places (Integer stringResourcId,Integer textResourcId){
        this.textResourcId = textResourcId;
        this.stringResourcId = stringResourcId;
    }

    public Integer getImageResourcId() {
        return imageResourcId;
    }

    public Integer getTextResourcId() {
        return textResourcId;
    }

    public Integer getStringResourcId() {
        return stringResourcId;
    }

    public boolean hasImageResourcId(){
        return imageResourcId != -1;
    }

    public boolean hasStringResourcId(){
        return stringResourcId != -1;
    }

    public boolean hasTextResourcId(){
        return textResourcId != -1;
    }
}
