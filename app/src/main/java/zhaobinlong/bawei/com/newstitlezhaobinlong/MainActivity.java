package zhaobinlong.bawei.com.newstitlezhaobinlong;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {


    private Button page_one;
    private Button page_two;
    private Button page_three;
    private Button page_four;
    private Frament_One_Pager frament_one_pager;
    private Frament_Two_Pager frament_two_pager;
    private Frament_Three_Pager frament_three_pager;
    private Frament_Four_Pager frament_four_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frament_one_pager = new Frament_One_Pager();
        frament_two_pager = new Frament_Two_Pager();
        frament_three_pager = new Frament_Three_Pager();
        frament_four_pager = new Frament_Four_Pager();

        //初始化控件
        inintView();
        addFragment(frament_one_pager);
    }

    private void inintView() {

        page_one = (Button) findViewById(R.id.button_page_one);
        page_two = (Button) findViewById(R.id.button_page_two);
        page_three = (Button) findViewById(R.id.button_page_three);
        page_four = (Button) findViewById(R.id.button_page_four);
        page_one.setOnClickListener(this);
        page_two.setOnClickListener(this);
        page_three.setOnClickListener(this);
        page_four.setOnClickListener(this);

    }
    private void addFragment(Fragment l) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction().replace(R.id.ll, l);
        beginTransaction.commit();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_page_one:
                addFragment(frament_one_pager);
                page_one.setTextColor(Color.RED);
                page_two.setTextColor(Color.BLACK);
                page_three.setTextColor(Color.BLACK);
                page_four.setTextColor(Color.BLACK);
                break;
            case R.id.button_page_two:
                addFragment(frament_two_pager);
                page_one.setTextColor(Color.BLACK);
                page_two.setTextColor(Color.RED);
                page_three.setTextColor(Color.BLACK);
                page_four.setTextColor(Color.BLACK);
                break;
            case R.id.button_page_three:
                addFragment(frament_three_pager);
                page_one.setTextColor(Color.BLACK);
                page_two.setTextColor(Color.BLACK);
                page_three.setTextColor(Color.RED);
                page_four.setTextColor(Color.BLACK);
                break;
            case R.id.button_page_four:
                addFragment(frament_four_pager);
                page_one.setTextColor(Color.BLACK);
                page_two.setTextColor(Color.BLACK);
                page_three.setTextColor(Color.BLACK);
                page_four.setTextColor(Color.RED);
                break;
        }
    }


}