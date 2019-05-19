package com.example.ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TestView tView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView=(TestView) findViewById(R.id.testview1);
        tView.setOnTouchListener(new mOnTouch());
    }
    class mOnTouch implements View.OnTouchListener
    {
        public boolean onTouch(View v, MotionEvent event)
        {
            int x1,y1;
            x1 = (int) event.getX();
            y1 = (int) event.getY();
            if (event.getAction() == MotionEvent.ACTION_MOVE)
            {
                if((x1>350&&x1<650)&&(y1>500&&y1<1000))
                {
                    finish(); // setContentView(R.layout.activity_main);
                }
                else
                {
                    tView.getXY(x1,y1);
                    tView.invalidate();
                    return true;
                }
            }
            else if (event.getAction() == MotionEvent.ACTION_DOWN)
            {
                if((x1>350&&x1<650)&&(y1>500&&y1<1000))
                {
                    finish();
                }
            else
                {
                    tView.getXY(x1,y1);
                    y1 = (int) event.getY();
                    tView.invalidate();
                    return true;
                }
            }
            return tView.onTouchEvent(event); }
    }
}
