package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ListView lvBox;
ArrayList<BoxItem> alboxlist;
CustomAdapter caBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBoxList);
       alboxlist = new ArrayList<>();
       BoxItem item1 = new BoxItem( "blue");
       BoxItem item2 = new BoxItem("orange");
       BoxItem item3 = new BoxItem("brown");

       alboxlist.add(item1);
       alboxlist.add(item2);
       alboxlist.add(item3);

       caBox = new CustomAdapter(this , R.layout.box_item , alboxlist);

       lvBox.setAdapter(caBox);
    }
}
