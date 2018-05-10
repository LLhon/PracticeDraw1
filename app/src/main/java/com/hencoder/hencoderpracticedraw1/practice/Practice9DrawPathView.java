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

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        paint.setStyle(Style.FILL);
        Path path = new Path();
        RectF rectF = new RectF(getWidth() / 2 - 100, getHeight() / 2 - 100,
            getWidth() / 2, getHeight() / 2);
        path.addArc(rectF, -225, 225);
        RectF rectF1 = new RectF(getWidth() / 2, getHeight() / 2 - 100,
            getWidth() / 2 + 100, getHeight() / 2);
        path.arcTo(rectF1, -180, 225, false);
        path.lineTo(getWidth() / 2, getHeight() / 2 + 90);
        canvas.drawPath(path, paint);
    }
}
