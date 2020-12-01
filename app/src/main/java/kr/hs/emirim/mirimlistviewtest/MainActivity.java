package kr.hs.emirim.mirimlistviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    String[] items ={"사이렌", "복수해라","펜트하우스","나 혼자 산다", "노는 언니","런닝맨"};
    ArrayList<String> arrayList = new ArrayList<String>();
    ArrayList<String> adapter;
    EditText edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list1 = findViewById(R.id.list1);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        edit1 = findViewById(R.id.edit1);
        Button btnadd = findViewById(R.id.btn_add);
        list1.setAdapter(adapter);

        btnadd.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            itemList.add(edit1.getText().toString());
            adapter.notifyDatasetChaged();
        }
    };
}