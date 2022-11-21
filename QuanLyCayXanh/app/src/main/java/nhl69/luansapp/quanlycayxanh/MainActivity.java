package nhl69.luansapp.quanlycayxanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Cay> arrayList;
    AdapterCay adapterCay;
    Button themcay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listviewcay);
        arrayList = new ArrayList<>();

        arrayList.add(new Cay("Xerosicyos danguyi", "Cây đồng đô la bạc", "Cây dây leo", "xanh", R.drawable.caydongdola));
        arrayList.add(new Cay("Pilea peperomioides", "Cây đồng tiền", "Sinh trưởng nhanh", "xanh", R.drawable.caydongtien));
        arrayList.add(new Cay("Crassula ovata", "Cây phỉ thuý", "Thân mọng nước", "xanh", R.drawable.cayngocbich));
        arrayList.add(new Cay("Zamioculcas zamiifolia", "Cây kim tiền", "Thích ánh sáng", "xanh", R.drawable.caykimtien));
        arrayList.add(new Cay("Oxalis", "Cây bướm đêm", "Nảy mầm nhanh", "tím hoặc đỏ thẫm", R.drawable.caybuomdem));

        adapterCay = new AdapterCay(MainActivity.this, R.layout.cay_list_item, arrayList);
        listView.setAdapter(adapterCay);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MainActivity.this, Detail.class));
            }
        });
    }
}