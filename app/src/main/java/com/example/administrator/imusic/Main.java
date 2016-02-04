package com.example.administrator.imusic;

import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;


public class Main extends AllActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tabhost);
        intiView();

    }



    /**
     * 初始化界面函数
     */
    public void intiView(){

        TabHost tabHost= (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();


        //加载第一个tab
        TabHost.TabSpec spec1=tabHost.newTabSpec("spec1");
        View view=View.inflate(this,R.layout.tab_item,null);
        spec1.setIndicator(view);
        spec1.setContent(R.id.linear1);
        tabHost.addTab(spec1);

        //加载第二个tab
        TabHost.TabSpec spec2=tabHost.newTabSpec("spec2");
        View view2=View.inflate(this,R.layout.tab_item2,null);
        spec2.setIndicator(view2);
        spec2.setContent(R.id.linear2);
        tabHost.addTab(spec2);

        //加载第三个tab
        TabHost.TabSpec spec3=tabHost.newTabSpec("spec3");
        View view3=View.inflate(this,R.layout.tab_item3,null);
        spec3.setIndicator(view3);
        spec3.setContent(R.id.linear3);
        tabHost.addTab(spec3);

        //加载第四个tab
        TabHost.TabSpec spec4=tabHost.newTabSpec("spec4");
        View view4=View.inflate(this,R.layout.tab_item4,null);
        spec4.setIndicator(view4);
        spec4.setContent(R.id.linear4);
        tabHost.addTab(spec4);

    }


}
