package fastec.com.rrcc.projectx1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import fastec.com.rrcc.projectx1.annotation.InjectView;
import fastec.com.rrcc.projectx1.inject.InjectUtil;


public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.test)
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtil.inject(MainActivity.this);

        text.setText("测试注解反射");

    }
}
