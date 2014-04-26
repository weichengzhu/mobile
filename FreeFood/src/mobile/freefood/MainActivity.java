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


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		 ListView list = (ListView) findViewById(R.id.ListView01);  
         
	        //生成动态数组，加入数据  
	        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();  
	        for(int i=0;i<10;i++)  
	        {  
	            HashMap<String, Object> map = new HashMap<String, Object>();  
	            map.put("ItemImage", R.drawable.ic_launcher);//图像资源的ID  
	            map.put("ItemTitle", "Level "+i);  
	            map.put("ItemText", "Finished in 1 Min 54 Secs, 70 Moves! ");  
	            listItem.add(map);  
	        }  
	        //生成适配器的Item和动态数组对应的元素  
	        SimpleAdapter listItemAdapter = new SimpleAdapter(this,listItem,//数据源   
	            R.layout.cell,//ListItem的XML实现  
	            //动态数组与ImageItem对应的子项          
	            new String[] {"ItemImage","ItemTitle", "ItemText"},   
	            //ImageItem的XML文件里面的一个ImageView,两个TextView ID  
	            new int[] {R.id.ItemImage,R.id.ItemTitle,R.id.ItemText}  
	        );  
	         
	        //添加并且显示  
	        list.setAdapter(listItemAdapter);  
	          
	        //添加点击  
	        list.setOnItemClickListener(new OnItemClickListener() {  
	  
	            @Override  
	            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,  
	                    long arg3) {  
	            	Intent intent = new Intent(MainActivity.this, DetailActivity.class);  
	            	  
	            	/* 通过Bundle对象存储需要传递的数据 */  
	            	Bundle bundle = new Bundle();  
	            	/*字符、字符串、布尔、字节数组、浮点数等等，都可以传*/  
	            	bundle.putString("Name", "feng88724");  
	            	bundle.putBoolean("Ismale", true);  
	            	  
	            	/*把bundle对象assign给Intent*/  
	            	intent.putExtras(bundle);  
	            	  
	            	startActivity(intent);   
	            }  
	        });  
	          
	      //添加长按点击  
//	        list.setOnCreateContextMenuListener(new OnCreateContextMenuListener() {  
//	              
//	            @Override  
//	            public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo) {  
//	                menu.setHeaderTitle("长按菜单-ContextMenu");     
//	                menu.add(0, 0, 0, "弹出长按菜单0");  
//	                menu.add(0, 1, 0, "弹出长按菜单1");     
//	            }  
//	        });   
	    }  
	      
	    //长按菜单响应函数  
//	    @Override  
//	    public boolean onContextItemSelected(MenuItem item) {  
//	        setTitle("点击了长按菜单里面的第"+item.getItemId()+"个项目");   
//	        return super.onContextItemSelected(item);  
//	    }  
	}  