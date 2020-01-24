package com.example.myapplication;

/**
 * Created by Aws on 28/01/2018.
 */

public class Plant {

    private String Txt1;
    private String Txt2;
    private String Txt3;

    private int Image2 ;

    private int Image ;


    public Plant() {
    }

    public Plant(String txt1,String txt2,String txt3, int image, int image2) {
        Txt1 = txt1;
        Txt2 = txt2;
        Txt3 = txt3;
        Image2=image2;
        Image=image;

    }


    public String getTxt1() {
        return Txt1;
    }

    public String getTxt2() {
        return Txt2;
    }

    public String getTxt3() {
        return Txt3;
    }

    public int getImage2() {
        return Image2;
    }



    public int getImage() {
        return Image;
    }







}
