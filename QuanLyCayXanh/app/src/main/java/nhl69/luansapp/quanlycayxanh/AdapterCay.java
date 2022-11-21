package nhl69.luansapp.quanlycayxanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterCay extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Cay> arrayList;

    public AdapterCay(Context context, int layout, List<Cay> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        Cay cay = arrayList.get(i);

        TextView tentg = convertView.findViewById(R.id.tentg);
        TextView tenkh = convertView.findViewById(R.id.tenkh);
        TextView dactinh = convertView.findViewById(R.id.dactinh);
        TextView maula = convertView.findViewById(R.id.maula);
        ImageView image = convertView.findViewById(R.id.hinhanh);

        tentg.setText(cay.getTentg());
        tenkh.setText(cay.getTenkh());
        dactinh.setText(cay.getDactinh());
        maula.setText(cay.getMaula());
        image.setImageResource(cay.getHinh());

        return convertView;
    }
}
