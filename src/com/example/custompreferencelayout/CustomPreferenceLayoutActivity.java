package com.example.custompreferencelayout;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import android.widget.Button;

public class CustomPreferenceLayoutActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_setting);
        
        /** Customize your background, textsize, cachetint, dividers
        for your list view in the xml **/
        setContentView(R.layout.preferences_layout);
    
        
        TitleBar titleBar = (TitleBar) findViewById(R.id.include_title_bar);
        titleBar.setTitleIMG(R.drawable.navi_logo);
        // Set right button icon
        titleBar.setRightBtnVisibility(View.VISIBLE);
        titleBar.setRightBtnText(this, R.string.done);
        titleBar.setRightBtnOnClickListener(new TitlebarRightBtnOnClickListener());
        
    }

    class TitlebarRightBtnOnClickListener implements Button.OnClickListener {

        @Override
        public void onClick(View v) {
            setResult(RESULT_OK);
            finish();
        }       
    }
}
