package com.nodun.bmi.bmi;
import java.text.DecimalFormat;
import android.app.AlertDialog;
import android.widget.Toast;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Listen for button clicks
        findViews();
        setListensers();
    }

    private Button button_calc;
    private EditText field_height;
    private EditText field_weight;
    private TextView view_result;
    private TextView view_suggest;

    private void findViews()//寻找对应组件的ID
    {
        button_calc=(Button)findViewById(R.id.submit);
        field_height=(EditText)findViewById(R.id.height);
        field_weight=(EditText)findViewById(R.id.weight);
        view_result=(TextView)findViewById(R.id.result);
        view_suggest=(TextView)findViewById(R.id.suggest);
    }

    private void setListensers()//调用按钮事件
    {
        button_calc.setOnClickListener(calcBMI);
    }

    private Button.OnClickListener calcBMI=new Button.OnClickListener()
    {
        public void onClick(View v)
        {
            DecimalFormat nf=new DecimalFormat("0.00");
            try{
                double height=Double.parseDouble(field_height.getText().toString())/100;//从界面中获取用户输入的数据
                double weight=Double.parseDouble(field_weight.getText().toString());
                double BMI=weight/(height*height);

                view_result.setText(getText(R.string.bmi_result)+nf.format(BMI));//显示计算结果


                if(BMI>25)
                {
                    view_suggest.setText(R.string.advice_heavy);
                }
                else if(BMI<18.5)
                {
                    view_suggest.setText(R.string.advice_light);
                }
                else
                {
                    view_suggest.setText(R.string.advice_average);
                }
               // openOptionsDialog();
            }catch(Exception obj)//若try语句中出现异常，则执行catch中的语句
            {
                Toast.makeText(Bmi.this, R.string.input_error, Toast.LENGTH_SHORT).show();
            }


        }
    };
    private void openOptionsDialog()//弹出对话框
    {
        new AlertDialog.Builder(Bmi.this)
                .setTitle(R.string.about_title)//显示对话框的标题内容
                .setMessage(R.string.about_msg)//显示对话框的内容
                .setPositiveButton(R.string.ok_label, new DialogInterface.OnClickListener() //添加“确定（ok_label）”按钮
                {
                    public void onClick(DialogInterface dialoginterface, int i) //按下“确定”按钮，直接退出对话框，返回上界面
                    {

                    }
                })
                .setNegativeButton(R.string.homepage_label,new DialogInterface.OnClickListener()//添加“首页（homepage_label）”按钮
                {
                    public void onClick(DialogInterface dialoginterface,int i)//单击“首页”，进入百度网址
                    {
                        Uri uri=Uri.parse("http://baike.baidu.com/link?url=2RHhmzXYw4ke-CH-LJaAcw1OLFQJDcJH-dIJdaP5YFeWbBaOsuH_rg017jrsQo74F0fEBkbxHAvgVcqq7y-t8K");
                        final Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                        startActivity(intent);
                    }

                })
                .show();
    }

    protected static final int MENU_ABOUT=Menu.FIRST;
    protected static final int MENU_Quit=Menu.FIRST+1;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) //创建菜单栏选项函数
    {
        // TODO Auto-generated method stub

        menu.add(0,MENU_ABOUT,0,"关于BMI").setIcon(android.R.drawable.ic_menu_help);//创建“关于...”菜单，标示符为MENU_ABOUT,并设置内置图标

        menu.add(0,MENU_Quit,0,"结束").setIcon(android.R.drawable.ic_menu_close_clear_cancel);//创建“结束”菜单，标示符为MENU_Quit，并设置内置图标
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)//处理菜单选项动作的函数
    {
        // TODO Auto-generated method stub

        switch(item.getItemId())
        {
            case MENU_ABOUT:openOptionsDialog();break;
            case MENU_Quit:finish();break;
        }
        return super.onOptionsItemSelected(item);
    }


}