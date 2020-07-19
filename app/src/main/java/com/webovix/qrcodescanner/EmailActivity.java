package com.webovix.qrcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EmailActivity extends AppCompatActivity {
    EditText inSubject, inBody;
    TextView txtEmailAddress;
    Button btnSendEmail;
    String txtEmailAddress1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        initViews();
    }

    private void initViews() {
        inSubject = findViewById(R.id.inSubject);
        inBody = findViewById(R.id.inBody);
        txtEmailAddress = findViewById(R.id.txtEmailAddress);
        btnSendEmail = findViewById(R.id.btnSendEmail);
        txtEmailAddress1=getIntent().getStringExtra("email_address");
        getSupportActionBar().setTitle("Send Email");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getIntent().getStringExtra("email_address") != null) {
            txtEmailAddress.setText("Recipient : " + getIntent().getStringExtra("email_address"));
        }

        btnSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{txtEmailAddress1});
                intent.putExtra(Intent.EXTRA_SUBJECT, inSubject.getText().toString().trim());
                intent.putExtra(Intent.EXTRA_TEXT, inBody.getText().toString().trim());

                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
