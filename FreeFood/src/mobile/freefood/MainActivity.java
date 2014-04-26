package mobile.freefood;

import java.util.ArrayList;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TabHost;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		 ListView list = (ListView) findViewById(R.id.ListView01);  
         
	        //���ɶ�̬���飬��������  
	        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();  
	        for(int i=0;i<10;i++)  
	        {  
	            HashMap<String, Object> map = new HashMap<String, Object>();  
	            map.put("ItemImage", R.drawable.ic_launcher);//ͼ����Դ��ID  
	            map.put("ItemTitle", "Level "+i);  
	            map.put("ItemText", "Finished in 1 Min 54 Secs, 70 Moves! ");  
	            listItem.add(map);  
	        }  
	        //������������Item�Ͷ�̬�����Ӧ��Ԫ��  
	        SimpleAdapter listItemAdapter = new SimpleAdapter(this,listItem,//����Դ   
	            R.layout.cell,//ListItem��XMLʵ��  
	            //��̬������ImageItem��Ӧ������          
	            new String[] {"ItemImage","ItemTitle", "ItemText"},   
	            //ImageItem��XML�ļ������һ��ImageView,����TextView ID  
	            new int[] {R.id.ItemImage,R.id.ItemTitle,R.id.ItemText}  
	        );  
	         
	        //��Ӳ�����ʾ  
	        list.setAdapter(listItemAdapter);  
	          
	        //��ӵ��  
	        list.setOnItemClickListener(new OnItemClickListener() {  
	  
	            @Override  
	            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,  
	                    long arg3) {  
	            	Intent intent = new Intent(MainActivity.this, DetailActivity.class);  
	            	  
	            	/* ͨ��Bundle����洢��Ҫ���ݵ����� */  
	            	Bundle bundle = new Bundle();  
	            	/*�ַ����ַ������������ֽ����顢�������ȵȣ������Դ�*/  
	            	bundle.putString("Name", "feng88724");  
	            	bundle.putBoolean("Ismale", true);  
	            	  
	            	/*��bundle����assign��Intent*/  
	            	intent.putExtras(bundle);  
	            	  
	            	startActivity(intent);   
	            }  
	        });  
	          
	      //��ӳ������  
//	        list.setOnCreateContextMenuListener(new OnCreateContextMenuListener() {  
//	              
//	            @Override  
//	            public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo) {  
//	                menu.setHeaderTitle("�����˵�-ContextMenu");     
//	                menu.add(0, 0, 0, "���������˵�0");  
//	                menu.add(0, 1, 0, "���������˵�1");     
//	            }  
//	        });   
	    }  
	      
	    //�����˵���Ӧ����  
//	    @Override  
//	    public boolean onContextItemSelected(MenuItem item) {  
//	        setTitle("����˳����˵�����ĵ�"+item.getItemId()+"����Ŀ");   
//	        return super.onContextItemSelected(item);  
//	    }  
	}  