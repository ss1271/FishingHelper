/**
 * Created by
 * @author yaxi
 * on  14/03/2014.
 *
 *
 *
 *
 * NOTE: Actionbar Sherlock is not working well with RelativeLayout in the Custom View. So change
 *      to another view if possible.
 */
package com.yeyaxi.android.fishinghelper;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.actionbarsherlock.app.ActionBar.LayoutParams;
import com.actionbarsherlock.app.SherlockFragmentActivity;


public class BaseActivity extends SherlockFragmentActivity {

    // unit conversions
    public static final float POUND_TO_KG = 0.453f;
    public static final float KG_TO_POUND = 2.205f;
    public static final float OUNCE_TO_KG = 0.028f;
    public static final float POUND_TO_OUNCE = 16f;
    public static final float INCH_TO_METRES = 0.025f;
    public static final float METRES_TO_INCH = 39.370f;
    public static final float CM_TO_METRES = 0.01f;

    public static boolean isMetricUnit = true;

    private static long timeStampOfView = 0l;

    @Override
    public void onCreate(Bundle savedInstanceState) {

//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);

        super.onCreate(savedInstanceState);

        View customView = getLayoutInflater().inflate(R.layout.layout_actionbar, null);
        LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT, Gravity.RIGHT | Gravity.CENTER_VERTICAL);

        // setup the Actionbar sherlock
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setCustomView(customView, lp);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

//        getSupportActionBar().setTitle("<Your Title Here>");

    }

    public static void setTimeStampOfView(long timestamp) {
        timeStampOfView = timestamp;
    }

    public static long getTimeStampOfView() {
        return timeStampOfView;
    }

}
