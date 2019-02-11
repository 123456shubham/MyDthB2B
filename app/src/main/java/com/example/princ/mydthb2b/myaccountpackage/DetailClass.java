package com.example.princ.mydthb2b.myaccountpackage;

public class DetailClass {
int img;
String nm;

    public DetailClass() {
    }

    public DetailClass(int img, String nm) {
        this.img = img;
        this.nm = nm;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    @Override
    public String toString() {
        return "DetailClass{" +
                "img=" + img +
                ", nm='" + nm + '\'' +
                '}';
    }
}
