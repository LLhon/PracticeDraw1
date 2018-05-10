package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Style.FILL);
        RectF rectF = new RectF(getWidth() / 2 - 200, getHeight() / 2 - 150,
            getWidth() / 2 + 200, getHeight() / 2 + 150);
        //绘制扇形
        canvas.drawArc(rectF, -110, 100, true, paint);
        //绘制弧形
        canvas.drawArc(rectF, 20, 140, false, paint);
        paint.setStyle(Style.STROKE);
        //绘制不封口的弧形
        canvas.drawArc(rectF, 180, 60, false, paint);
    }
}
