package mobile.freefood;

import java.util.ArrayList;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


public class DetailActivity extends Activity {
	private TextView title;
	private TextView content;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		setTitle("Detail");
		   Bundle bundle = this.getIntent().getExtras();  
	          
	        /*获取Bundle中的数据，注意类型和key*/  
	        String name = bundle.getString("Name");  
	        boolean ismale = bundle.getBoolean("Ismale"); 
	        title = (TextView) findViewById(R.id.ItemTitle);
	        content = (TextView) findViewById(R.id.ItemText);
	        title.setText(name);
	}
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}
	
}
	        