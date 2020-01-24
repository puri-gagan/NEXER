package com.example.myapplication;

/**
 * Created by Aws on 28/01/2018.
 */

public class PBCCARD {

    private String Title;

    private int Thumbnail ;

    private int Image ;
    private  double Price;

    public PBCCARD() {
    }

    public PBCCARD(String title, int image, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
        Image=image;
    }


    public String getTitle() {
        return Title;
    }




    public int getThumbnail() {
        return Thumbnail;
    }

    public int getImage() {
        return Image;
    }


    public void setTitle(String title) {
        Title = title;
    }



    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public double getPrice() {
        return Price;
    }
}
