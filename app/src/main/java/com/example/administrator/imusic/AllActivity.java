package com.example.administrator.imusic;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * AllActivity
 *
 * @author: Xingkai Ren
 * @time: 2016/2/3  17:48
 */
public class AllActivity extends Activity {
    public static List<Activity> activityList = new ArrayList<Activity>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityList.add(this);
    }
}
