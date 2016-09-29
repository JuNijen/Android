package ex.com.sjunijen.study10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static String nsName = "전 시은";
    public static int nsAge = 18;

    public static String getNsName() { return nsName; }
    public static int getNsAge() { return nsAge; }

    final School school = new School();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button   btnAddS = (Button)findViewById(R.id.btnClose);
        btnAddS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cStudent();
            }
        });
        Button btnChange = (Button)findViewById(R.id.button);
        btnChange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                nIntent();
            }
        });
    }


    //입력된 정보를 이용하여 학생을 생성, 등록
    private void cStudent(){
        EditText editName = (EditText)findViewById(R.id.editName);
        EditText editAge = (EditText)findViewById(R.id.editAge);
        TextView tvCountS = (TextView)findViewById(R.id.tvCountS);

        Student newStudent = new Student(editName.getText().toString(),
                Integer.parseInt(editAge.getText().toString()));
        school.addItem(newStudent);

        nsName = newStudent.getsName().toString();
        nsAge = newStudent.getsAge();

        final Toast toast = Toast.makeText(this,
                "학생 객체가 리스트에 추가 됨 : "+ nsName
              + "\n학생의 나이 : "+ nsAge, Toast.LENGTH_SHORT);
        toast.show();

        tvCountS.setText("추가된 학생의 수 : " + school.studentSize() + " 명");
    }

    private void nIntent(){
        Intent myIntent = new Intent(MainActivity.this, NewActivity.class);
        startActivity(myIntent);
    }
}
