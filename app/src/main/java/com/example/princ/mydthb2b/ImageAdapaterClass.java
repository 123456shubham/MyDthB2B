package com.example.princ.mydthb2b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapaterClass extends PagerAdapter {
    Context context;

    public ImageAdapaterClass(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return sliderImage.length;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ImageView)object);
    }
    private int[] sliderImage=new int[]{
            R.drawable.banner,R.drawable.bannerrr, R.drawable.baner,R.drawable.ba
    };
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImage[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    public void destroyItem(ViewGroup container,int position,Object object){
        ((ViewPager)container).removeView((ImageView)object);
    }
}
