package com.liu.administratorexample.oneweekends_1701a_01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/8/11.
 */

public class Viewdemo extends View{


    public Viewdemo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawCircle(200,100,100,paint);
    }
}
