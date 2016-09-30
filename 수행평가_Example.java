package ex.com.sjunijen.school0930;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCall = (Button)findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtPhone = (EditText) findViewById(R.id.edtPhone);
                String string = edtPhone.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + Integer.parseInt(edtPhone.getText().toString())));
                startActivity(intent);

            //  finish();
            }

        });

        Button btnSMS = (Button) findViewById(R.id.btnSNS);
        btnSMS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_SEND);

                EditText edtPhone = (EditText) findViewById(R.id.edtPhone);
                String strPhone = edtPhone.getText().toString();

                intent.putExtra("address", strPhone);
                intent.putExtra("sms_body", "안녕하세요");
                intent.setType("text/plain");

                startActivity(intent);
            }
        });

        Button btnWeb = (Button) findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtPhone = (EditText) findViewById(R.id.edtPhone);
                String strPhone = edtPhone.getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.co.kr/" + strPhone));

                startActivity(intent);
            }
        });

        Button btnSearch = (Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtName = (EditText) findViewById(R.id.edtPhone);
                String strName = edtName.getText().toString();

         //     Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com/" + strPhone));
                Intent intent = new Intent(Intent.ACTION_SEARCH);
                intent.putExtra(SearchManager.QUERY, strName);

                startActivity(intent);
            }
        });
    }
}
