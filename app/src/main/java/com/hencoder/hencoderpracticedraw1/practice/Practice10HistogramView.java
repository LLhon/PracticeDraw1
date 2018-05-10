package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import com.hencoder.hencoderpracticedraw1.R;
import com.hencoder.hencoderpracticedraw1.Tools;

public class Practice10HistogramView extends View {

    private Paint mWhitePaint;
    private Paint mGreenPaint;
    private int mRectWidth;
    private int mRectMargin;
    private int mRectHeight;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mWhitePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mWhitePaint.setColor(Color.WHITE);
        mWhitePaint.setStyle(Style.STROKE);
//        mWhitePaint.setStrokeWidth(2);
        mWhitePaint.setTextSize(24);
        mWhitePaint.setTextAlign(Align.CENTER);

        mGreenPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mGreenPaint.setColor(ContextCompat.getColor(context, R.color.rect_green));
        mGreenPaint.setStyle(Style.FILL);

        mRectWidth = Tools.dp2Px(context, 30);
        mRectMargin = Tools.dp2Px(context, 8);
        mRectHeight = 600;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //绘制坐标轴
        canvas.drawLine(100, 80, 100, mRectHeight, mWhitePaint);
        canvas.drawLine(100, mRectHeight, 1000, mRectHeight, mWhitePaint);
        //绘制文字
        canvas.drawText("Froyo", 100 + mRectMargin + mRectWidth / 2, mRectHeight + 30, mWhitePaint);
        canvas.drawText("GB", 100 + mRectMargin + mRectWidth / 2 + (mRectWidth + mRectMargin), mRectHeight + 30, mWhitePaint);
        canvas.drawText("ICS", 100 + mRectMargin + mRectWidth / 2 + (mRectWidth + mRectMargin) * 2, mRectHeight + 30, mWhitePaint);
        canvas.drawText("JB", 100 + mRectMargin + mRectWidth / 2 + (mRectWidth + mRectMargin) * 3, mRectHeight + 30, mWhitePaint);
        canvas.drawText("KitKat", 100 + mRectMargin + mRectWidth / 2 + (mRectWidth + mRectMargin) * 4, mRectHeight + 30, mWhitePaint);
        canvas.drawText("L", 100 + mRectMargin + mRectWidth / 2 + (mRectWidth + mRectMargin) * 5, mRectHeight + 30, mWhitePaint);
        canvas.drawText("M", 100 + mRectMargin + mRectWidth / 2 + (mRectWidth + mRectMargin) * 6, mRectHeight + 30, mWhitePaint);
        //绘制柱形
        Rect froyoRect = new Rect(100 + mRectMargin,
            mRectHeight - 5, 100 + mRectWidth + mRectMargin, mRectHeight);
        canvas.drawRect(froyoRect, mGreenPaint);
        Rect gbRect = new Rect(100 + mRectMargin + (mRectWidth + mRectMargin),
            mRectHeight - 20, 100 + (mRectWidth + mRectMargin) * 2, mRectHeight);
        canvas.drawRect(gbRect, mGreenPaint);
        Rect icsRect = new Rect(100 + mRectMargin + (mRectWidth + mRectMargin) * 2,
            mRectHeight - 20, 100 + (mRectWidth + mRectMargin) * 3, mRectHeight);
        canvas.drawRect(icsRect, mGreenPaint);
        Rect jbRect = new Rect(100 + mRectMargin + (mRectWidth + mRectMargin) * 3,
            mRectHeight - 200, 100 + (mRectWidth + mRectMargin) * 4, mRectHeight);
        canvas.drawRect(jbRect, mGreenPaint);
        Rect kitkatRect = new Rect(100 + mRectMargin + (mRectWidth + mRectMargin) * 4,
            mRectHeight - 360, 100 + (mRectWidth + mRectMargin) * 5, mRectHeight);
        canvas.drawRect(kitkatRect, mGreenPaint);
        Rect lRect = new Rect(100 + mRectMargin + (mRectWidth + mRectMargin) * 5,
            mRectHeight - 450, 100 + (mRectWidth + mRectMargin) * 6, mRectHeight);
        canvas.drawRect(lRect, mGreenPaint);
        Rect mRect = new Rect(100 + mRectMargin + (mRectWidth + mRectMargin) * 6,
            mRectHeight - 200, 100 + (mRectWidth + mRectMargin) * 7, mRectHeight);
        canvas.drawRect(mRect, mGreenPaint);
    }

}
