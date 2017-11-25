package sandy.gpacal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Context context;
    Spinner sp1 ;
    Spinner sp2 ;
    Spinner sp3 ;
    Spinner sp4 ;
    Spinner sp5 ;
    Spinner sp6 ;
    Spinner sp7 ;
    Spinner sp8,sp9 ;
    String names[] = {"S","A","B","C","D","E","F"};
    ArrayAdapter<String> adapter;
    String record1= "",record2= "",record3= "",record4= "",record5= "",record6= "",record7= "",record8= "",record9="";
    TextView display_data,display_data1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        sp1 = (Spinner)findViewById(R.id.spinner1);
        sp2 = (Spinner)findViewById(R.id.spinner2);
        sp3 = (Spinner)findViewById(R.id.spinner3);
        sp4 = (Spinner)findViewById(R.id.spinner4);
        sp5 = (Spinner)findViewById(R.id.spinner5);
        sp6 = (Spinner)findViewById(R.id.spinner6);
        sp7 = (Spinner)findViewById(R.id.spinner7);
        sp8 = (Spinner)findViewById(R.id.spinner8);
        sp9 = (Spinner)findViewById(R.id.spinner9);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        display_data = (TextView)findViewById(R.id.display_result);
        display_data1 = (TextView)findViewById(R.id.display_result1);
        sp1.setAdapter(adapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view1, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record1 = "S";
                        break;
                    case 1:
                        record1 = "A";
                        break;
                    case 2:
                        record1 = "B";
                        break;
                    case 3:
                         record1 = "C";
                        break;
                    case 4:
                        record1 = "D";
                        break;
                    case 5:
                        record1 = "E";
                        break;
                    case 6:
                        record1 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp2.setAdapter(adapter);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view2, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record2 = "S";
                        break;
                    case 1:
                        record2 = "A";
                        break;
                    case 2:
                        record2 = "B";
                        break;
                    case 3:
                        record2 = "C";
                        break;
                    case 4:
                        record2 = "D";
                        break;
                    case 5:
                        record2 = "E";
                        break;
                    case 6:
                        record2 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp3.setAdapter(adapter);
        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view3, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record3 = "S";
                        break;
                    case 1:
                        record3 = "A";
                        break;
                    case 2:
                        record3 = "B";
                        break;
                    case 3:
                        record3= "C";
                        break;
                    case 4:
                        record3 = "D";
                        break;
                    case 5:
                        record3 = "E";
                        break;
                    case 6:
                        record3 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp4.setAdapter(adapter);
        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view4, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record4 = "S";
                        break;
                    case 1:
                        record4 = "A";
                        break;
                    case 2:
                        record4 = "B";
                        break;
                    case 3:
                        record4 = "C";
                        break;
                    case 4:
                        record4 = "D";
                        break;
                    case 5:
                        record4 = "E";
                        break;
                    case 6:
                        record4 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp5.setAdapter(adapter);
        sp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view5, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record5 = "S";
                        break;
                    case 1:
                        record5 = "A";
                        break;
                    case 2:
                        record5 = "B";
                        break;
                    case 3:
                        record5 = "C";
                        break;
                    case 4:
                        record5 = "D";
                        break;
                    case 5:
                        record5 = "E";
                        break;
                    case 6:
                        record5 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp6.setAdapter(adapter);
        sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view6, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record6 = "S";
                        break;
                    case 1:
                        record6 = "A";
                        break;
                    case 2:
                        record6 = "B";
                        break;
                    case 3:
                        record6 = "C";
                        break;
                    case 4:
                        record6 = "D";
                        break;
                    case 5:
                        record6 = "E";
                        break;
                    case 6:
                        record6 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp7.setAdapter(adapter);
        sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view7, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record7 = "S";
                        break;
                    case 1:
                        record7 = "A";
                        break;
                    case 2:
                        record7 = "B";
                        break;
                    case 3:
                        record7 = "C";
                        break;
                    case 4:
                        record7 = "D";
                        break;
                    case 5:
                        record7 = "E";
                        break;
                    case 6:
                        record7 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp8.setAdapter(adapter);
        sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view8, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record8 = "S";
                        break;
                    case 1:
                        record8 = "A";
                        break;
                    case 2:
                        record8 = "B";
                        break;
                    case 3:
                        record8 = "C";
                        break;
                    case 4:
                        record8 = "D";
                        break;
                    case 5:
                        record8 = "E";
                        break;
                    case 6:
                        record8 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sp9.setAdapter(adapter);
        sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view8, int position, long id) {
                //use postion value
                switch (position)
                {
                    case 0:
                        record9 = "S";
                        break;
                    case 1:
                        record9 = "A";
                        break;
                    case 2:
                        record9 = "B";
                        break;
                    case 3:
                        record9 = "C";
                        break;
                    case 4:
                        record9 = "D";
                        break;
                    case 5:
                        record9 = "E";
                        break;
                    case 6:
                        record9 = "F";
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    public void displayResult(View view) {

        double total=calculate();
        Log.i("asd","asdasd"+total);
           //display_data.setTextSize(18);
           // display_data.setText(String.format("%.2f",total));
       callactivity(total);
        }
      //display_data1.setText(record2);

    public double calculate() {
        int s1, s2, s3, s4, s5, s6, l1, l2, l3;
        double total1,sum;
            s1 = grade(record1) * 3;
            s2 = grade(record2) * 4;
            s3 = grade(record3) * 4;
            s4 = grade(record4) * 4;
            s5 = grade(record5) * 4;
            s6 = grade(record6) * 4;
            l1 = grade(record7) * 2;
            l2 = grade(record8) * 2;
            l3 = grade(record9) * 2;
            total1 = s1 + s2 + s3 + s4 + s5 + s6 + l1 + l2 + l3;
            sum=total1/29;
            return sum;
    }
    public int grade(String str)
    {
        if(str=="S")
        return 10;
        else if(str=="A")
            return 9;
        else if(str=="B")
            return 8;
        else if(str=="C")
            return 7;
        else if(str=="D")
            return 6;
        else if(str=="E")
            return 5;
        else
            return 0;

    }
    public void callactivity(double sum)
    {
        Intent intent = new Intent(MainActivity.context, DisplayGrade.class);
         intent.putExtra("GPA", sum);
        startActivity(intent);
    }
}
