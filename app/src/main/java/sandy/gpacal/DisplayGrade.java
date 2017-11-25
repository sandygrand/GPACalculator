package sandy.gpacal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayGrade extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_grade);
        t=(TextView) findViewById(R.id.resulttext);
        Intent intent=getIntent();
       double d=intent.getDoubleExtra("GPA",0);
        t.setTextSize(30);
        t.setText(String.format("Your GPA : %.2f",d));
    }
}
