package com.db.sql;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText Name;
	Button Insert;
	SQLiteDatabase db;
	        @Override
	        protected void onCreate(Bundle savedInstanceState) {
	                super.onCreate(savedInstanceState);
	                setContentView(R.layout.activity_main);
	                
	                Name=(EditText)findViewById(R.id.editText1);
	                Insert=(Button)findViewById(R.id.button1);
	               	                
	                db=openOrCreateDatabase("student",Context.MODE_PRIVATE, null);
	                db.execSQL("CREATE TABLE IF NOT EXISTS table1(name VARCHAR)");
	                Insert.setOnClickListener(new View.OnClickListener() {
	                
	                        @Override
	                        public void onClick(View arg0) {
	                                
	                                db.execSQL("INSERT INTO table1(name) VALUES('"+Name.getText().toString()+"')");
	                                Toast.makeText(getApplicationContext(),"Successfully Inserted" ,Toast.LENGTH_LONG).show();
	                        }
	                });
	               
	        }
	        
}
