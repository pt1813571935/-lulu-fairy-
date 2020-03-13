package com.example.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class MyCustomSimpleView extends View {
    public MyCustomSimpleView(Context context) {
        super(context);
    }
    public MyCustomSimpleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        /**
         * obtainStyledAttributes 获取属性的数组，获取自己定义的属性的数组
         * AttributeSet:属性的集合
         * StylableRes:资源文件中的Styleable
         *
         */
        //
        TypedArray typedArray = context.obtainStyledAttributes(
                attrs, R.styleable.myCustomSimpleView);
        /**
         * typedArray.getColor()：得到用户的属性值
         * int 属性名
         * int 默认值
         */
        int color = typedArray.getColor(R.styleable.myCustomSimpleView_view_backColor, Color.BLACK);
        setBackgroundColor(color);
        //回收typeArray
        typedArray.recycle();


    }
}
