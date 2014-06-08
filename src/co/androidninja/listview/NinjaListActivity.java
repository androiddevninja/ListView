package co.androidninja.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class NinjaListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninja_list);

        String[] cheeses = getResources().getStringArray(R.array.cheeses);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.list_item_text, cheeses);
        setListAdapter(adapter);
        
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    	String selectedText = ((TextView)v).getText().toString();
    	
    	Toast.makeText(this, selectedText, Toast.LENGTH_SHORT).show();
    }

}
