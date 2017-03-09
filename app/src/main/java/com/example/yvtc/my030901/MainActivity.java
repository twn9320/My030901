package com.example.yvtc.my030901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox chk[]=new CheckBox[3];
    RadioGroup radiogrp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk[0] = (CheckBox)findViewById(R.id.checkBox);
        chk[1]= (CheckBox)findViewById(R.id.checkBox2);
        chk[2] = (CheckBox)findViewById(R.id.checkBox3);

        radiogrp=(RadioGroup)findViewById(R.id.radgrp);

        for(CheckBox c:chk){
            c.setOnCheckedChangeListener(this);
        }
        radiogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId){
                switch(checkedId){
                    case R.id.radioButton:
                        Log.d("RDO","1");
                        break;
                    case R.id.radioButton2:
                        Log.d("RDO","2");
                        break;
                    case R.id.radioButton3:
                        Log.d("RDO","3");
                        break;
                }
            }
        });
    }
    public void click1(View v){
        if(chk[0].isChecked()){
            Log.d("CHK","檢查後chk1有打勾");
        }
        else{
            Log.d("CHK","檢查後chk1沒有打勾");
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            switch(buttonView.getId()){
                case R.id.checkBox:
                    Log.d("CHK","chk1打勾");
                    break;
                case R.id.checkBox2:
                    Log.d("CHK","chk2打勾");
                    break;
                case R.id.checkBox3:
                    Log.d("CHK","chk3打勾");
                    break;
            }
        }

        /*switch (radiogrp.getCheckedRadioButtonId()){
            case R.id.radioButton:
                Log.d("RDO","選項一");
                break;
            case R.id.radioButton2:
                Log.d("RDO","選項2");
                break;
            case R.id.radioButton3:
                Log.d("RDO","選項3");
                break;
        }*/

    }
}
