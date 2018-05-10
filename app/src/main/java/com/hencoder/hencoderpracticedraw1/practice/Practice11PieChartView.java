package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

    private Paint mPaint;
    private int mRadius = 280;

    public Practice11PieChartView(Context context) {
        this(context, null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        //绘制扇形
        mPaint.setStyle(Style.FILL);
        RectF rectF = new RectF(getWidth() / 2 - mRadius, getHeight() / 2 - mRadius,
            getWidth() / 2 + mRadius, getHeight() / 2 + mRadius);
        mPaint.setColor(getResources().getColor(R.color.version_m));
        canvas.drawArc(rectF, -45, 45, true, mPaint); //Marshmallow
        mPaint.setColor(getResources().getColor(R.color.version_f));
        canvas.drawArc(rectF, 1, 1, true, mPaint); //Froyo
        mPaint.setColor(getResources().getColor(R.color.version_g));
        canvas.drawArc(rectF, 3, 6, true, mPaint); //Gingebread
        mPaint.setColor(getResources().getColor(R.color.version_i));
        canvas.drawArc(rectF, 10, 5, true, mPaint); //Ice Cream Sandwich
        mPaint.setColor(getResources().getColor(R.color.version_j));
        canvas.drawArc(rectF, 16, 60, true, mPaint); //Jelly Bean
        mPaint.setColor(getResources().getColor(R.color.version_k));
        canvas.drawArc(rectF, 78, 100, true, mPaint); //KitKat
        mPaint.setColor(getResources().getColor(R.color.version_l));
//        RectF rectF1 = new RectF(getWidth() / 2 - mRadius - 20, getHeight() / 2 - mRadius - 20,
//            getWidth() / 2 + mRadius - 20, getHeight() / 2 + mRadius - 20);
//        canvas.drawArc(rectF1, -180, 133, true, mPaint); //Lollipop
        RectF rectF1 = new RectF(getWidth() / 2 - mRadius, getHeight() / 2 - mRadius,
            getWidth() / 2 + mRadius, getHeight() / 2 + mRadius);
        canvas.translate(-20, -20); //平移位置
        canvas.drawArc(rectF1, -180, 133, true, mPaint); //Lollipop
        //绘制文字
        canvas.translate(20, 20); //归位
        mPaint.setColor(Color.WHITE);
//        mPaint.setStrokeWidth(3);
        mPaint.setTextSize(24);
        mPaint.setStyle(Style.STROKE);
        Path path  = new Path();
        path.moveTo(getWidth() / 2 + mRadius - 20, getHeight() / 2 - 100);
        path.lineTo(getWidth() / 2 + mRadius, getHeight() / 2 - 120);
        path.rLineTo(80, 0);
        canvas.drawPath(path, mPaint);
        canvas.drawText("Marshmallow", getWidth() / 2 + mRadius + 90, getHeight() / 2 - 120, mPaint);
        path.reset();
        path.moveTo(getWidth() / 2 + mRadius, getHeight() / 2 + 10);
        path.rLineTo(80, 0);
        canvas.drawPath(path, mPaint);
        canvas.drawText("Froyo", getWidth() / 2 + mRadius + 90, getHeight() / 2 + 10, mPaint);
        path.reset();
        path.moveTo(getWidth() / 2 + mRadius, getHeight() / 2 + 30);
        path.rLineTo(20, 0);
        path.rLineTo(20, 20);
        path.rLineTo(20, 0);
        canvas.drawPath(path, mPaint);
        canvas.drawText("Gingerbread", getWidth() / 2 + mRadius + 70, getHeight() / 2 + 50, mPaint);
        path.reset();
        path.moveTo(getWidth() / 2 + mRadius - 5, getHeight() / 2 + 60);
        path.rLineTo(20, 0);
        path.rLineTo(20, 20);
        path.rLineTo(20, 0);
        canvas.drawPath(path, mPaint);
        canvas.drawText("Ice Cream Sandwich", getWidth() / 2 + mRadius + 60, getHeight() / 2 + 80, mPaint);
        path.reset();
        path.moveTo(getWidth() / 2 + mRadius - 60, getHeight() / 2 + mRadius / 2 + 30);
        path.rLineTo(20, 20);
        path.rLineTo(100, 0);
        canvas.drawPath(path, mPaint);
        canvas.drawText("Jelly Bean", getWidth() / 2 + mRadius + 70,
            getHeight() / 2 + mRadius / 2 + 50, mPaint);
        path.reset();
        path.moveTo(getWidth() / 2 - mRadius * 3 / 4 + 20, getHeight() / 2 + mRadius * 3 / 4);
        path.rLineTo(-20, 20);
        path.rLineTo(-100, 0);
        canvas.drawPath(path, mPaint);
        canvas.drawText("KitKat", getWidth() / 2 - mRadius - 110, getHeight() / 2 + mRadius / 2 + 90,
            mPaint);
        path.reset();
        path.moveTo(getWidth() / 2 - mRadius * 3 / 4 + 20, getHeight() / 2 - mRadius * 3 / 4 - 30);
        path.rLineTo(-20, -20);
        path.rLineTo(-120, 0);
        canvas.drawPath(path, mPaint);
        canvas.drawText("Lollipop", getWidth() / 2 - mRadius - 150, getHeight() / 2 - mRadius + 20, mPaint);
    }
}
