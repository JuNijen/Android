package ex.com.sjunijen.study10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        String nName = MainActivity.getNsName();
        int nAge = MainActivity.getNsAge();


        TextView StudentInfo = (TextView)findViewById(R.id.StudentInfo);
        StudentInfo.setText(nName + " (" + nAge + ")");

        final EditText editPhone = (EditText)findViewById(R.id.editPhone);
        final TextView Imsi = (TextView)findViewById(R.id.Imsi);

        Button btnCall = (Button)findViewById(R.id.btnConnect);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sImsi =  editPhone.getText().toString();
                Imsi.setText(sImsi);

                //▽ ACTION_CALL로 하였다가 오류가 난 것이었다.
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:" +sImsi));
                startActivity(intent);

                finish();
            }
        });
    }
}

// <!--  TODO - add uses-permission elements -->
// <uses-permission android:name="android.permission.CALL_PHONE"></uses-permission>

