package kr.hs.emirim.mirimlistviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] items ={"사이렌", "복수해라","펜트하우스","나 혼자 산다", "노는 언니","런닝맨"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list1 = findViewById(R.id.list1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, items);
        list1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        list1.setAdapter(adapter);

        list1.setOnItemClickListener(listListener);
    }
    AdapterView.OnItemClickListener listListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View v, int i, long l) {
            Toast.makeText(getApplicationContext(), items[i], Toast.LENGTH_SHORT).show();
        }
    };
}