package vincent.robusttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_count).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student();
                student.setBigNum(10);
                student.setBigNum(5);
                Toast.makeText(MainActivity.this, "大数除以小数的结果是" + student.dividedBigBySmall(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
