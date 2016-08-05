package com.example.differentdentify;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

public class DentifyView extends View {

	public DentifyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public DentifyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		// TODO Auto-generated constructor stub
	}

	public DentifyView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public DentifyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		
		//int width = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        //int height = getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
		
		DisplayMetrics metric = new DisplayMetrics();
		metric = getResources().getDisplayMetrics();
		
		int width = metric.widthPixels; // 屏幕宽度（像素）
		int height = metric.heightPixels; // 屏幕高度（像素）
        Log.d("zzl:::", "width:"+width+"::"+"height:"+height);

        setMeasuredDimension(width/3, height/3);
        
	}

	
}
