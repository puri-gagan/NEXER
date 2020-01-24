package com.example.myapplication;

/**
 * Created by Aws on 28/01/2018.
 */

public class Plant {

    private String Txt1;
    private String Txt2;
    private String Txt3;
    private String Txt01;
    private String Txt02;
    private String Txt03;
    private String Txt04;
    private String Txt05;
    private String Txt06;
    private String Txt07;
    private String Txt08;
    private String Txt09;
    private String Txt10;

    private int Image2 ;

    private int Image ;


    public Plant() {
    }

    public Plant(String txt1,String txt2,String txt3,String txt01,String txt02,String txt03,String txt04,String txt05,String txt06,String txt07,String txt08,String txt09,String txt10, int image, int image2) {
        Txt1 = txt1;
        Txt2 = txt2;
        Txt3 = txt3;
        Txt01 = txt01;
        Txt02 = txt02;
        Txt03 = txt03;
        Txt04 = txt04;
        Txt05 = txt05;
        Txt06 = txt06;
        Txt07 = txt07;
        Txt08 = txt08;
        Txt09 = txt09;
        Txt10 = txt10;

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
    public String getTxt01() {
        return Txt01;
    }

    public String getTxt02() {
        return Txt02;
    }

    public String getTxt03() {
        return Txt03;
    }
    public String getTxt04() {
        return Txt04;
    }

    public String getTxt05() {
        return Txt05;
    }

    public String getTxt06() {
        return Txt06;
    }
    public String getTxt07() {
        return Txt07;
    }

    public String getTxt08() {
        return Txt08;
    }

    public String getTxt09() {
        return Txt09;
    }
    public String getTxt10() {
        return Txt10;
    }


    public int getImage2() {
        return Image2;
    }



    public int getImage() {
        return Image;
    }







}
