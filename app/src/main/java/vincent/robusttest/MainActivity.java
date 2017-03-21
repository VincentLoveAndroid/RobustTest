package vincent.robusttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.meituan.robust.patch.RobustModify;
import com.meituan.robust.patch.annotaion.Add;
import com.meituan.robust.patch.annotaion.Modify;


public class MainActivity extends Activity {
    @Modify
    protected void onCreate(Bundle savedInstanceState) {
        RobustModify.modify();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hah ");
        Student student = new Student();
        student.dividedBigBySmall();
    }
}
