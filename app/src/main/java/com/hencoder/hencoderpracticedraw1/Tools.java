package com.hencoder.hencoderpracticedraw1;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * @author LLhon
 * @Project PracticeDraw1
 * @Package com.hencoder.hencoderpracticedraw1
 * @Date 2018/5/9 18:18
 * @description
 */
public class Tools {

    /**
     * @param dip-->px
     * @return
     */
    public static int dp2Px(Context context, int dip) {
        float density = context.getResources().getDisplayMetrics().density;
        int px = (int) (dip * density + .5f);
        return px;
    }

    /**
     * px-->dip
     */
    public static int px2Dip(Context context, int px) {
        float density = context.getResources().getDisplayMetrics().density;
        int dp = (int) (px / density + .5f);
        return dp;
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

}
