package cn.edu.gdmec.s07131044.buttentext;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView tv;
	EditText et;
	Button btn;
	ImageButton ibtn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	tv = (TextView) findViewById(R.id.textView1);
   	 	et = (EditText) findViewById(R.id.editText1);
   	 	btn = (Button) findViewById(R.id.button1);
   	 	ibtn = (ImageButton) findViewById(R.id.imageButton1);
   	 	tv.setText("欢迎第一次使用！");
   	 	et.setText("123456");
		btn.setOnClickListener(btnlistener);
    }
    Button.OnClickListener btnlistener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			tv.setText("欢迎您的使用！~");
		}
	};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
