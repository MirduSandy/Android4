package com.example.ball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TestView extends View {
    int x = 150, y = 50;
    public TestView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }
    void getXY(int _x, int _y) { x = _x; y = _y; }
    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawColor(Color.CYAN); /*设置背景为青色*/
        Paint paint = new Paint();
        paint.setAntiAlias(true); /*去锯齿*/
        paint.setColor(Color.BLACK); /*设置paint的颜色*/
        canvas.drawCircle(x, y, 30, paint); /*画一个实心圆*/
        paint.setColor(Color.WHITE);/*画一个实心圆上的小白点*/
        canvas.drawCircle(x - 9, y - 9, 6, paint);
        paint.setAntiAlias(true); /*去锯齿*/
        paint.setColor(Color.BLACK); /*设置paint的颜色*/
        canvas.drawRect(350,500,650,1000,paint);
    }
}

