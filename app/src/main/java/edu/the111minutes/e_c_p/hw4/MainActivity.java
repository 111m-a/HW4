package edu.the111minutes.e_c_p.hw4;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_layout1 = (Button) findViewById(R.id.btn_layout1);
        btn_layout1.setOnClickListener(this);

        Button btn_layout2 = (Button) findViewById(R.id.btn_layout2);
        btn_layout2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()) {
            case R.id.btn_layout1:
                intent = new Intent(MainActivity.this,Activity_1.class);
                startActivity(intent);
                break;
            case R.id.btn_layout2:
                intent = new Intent(MainActivity.this,Activity_2.class);
                startActivity(intent);
                break;
            default: break;
        }

    }

}
