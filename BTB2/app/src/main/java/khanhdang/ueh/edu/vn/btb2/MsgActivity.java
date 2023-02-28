package khanhdang.ueh.edu.vn.btb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MsgActivity extends AppCompatActivity {
    private TextView tvhovaten;
    private TextView tvsodienthoai;
    private TextView tvgioitinh;
    private TextView tvtrinhdo;
    private TextView tvtuoi;
    private TextView tvthethao;
    private TextView tvtheloaiamnhac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
        ConnectView();
        InforPerson inforPerson=(InforPerson) getIntent().getSerializableExtra("inforperson");
        SetValue(inforPerson);
    }
    private void ConnectView()
    {
        tvhovaten =findViewById(R.id.TvHovaTen);
        tvsodienthoai =findViewById(R.id.TvSoDienThoai);
        tvgioitinh =findViewById(R.id.TvGioiTinh);
        tvtrinhdo =findViewById(R.id.TvTrinhDo);
        tvtuoi =findViewById(R.id.TvTuoi);
        tvthethao =findViewById(R.id.TvTheThao);
        tvtheloaiamnhac =findViewById(R.id.TvTheLoaiAmNhac);
    }
    private void SetValue(InforPerson inforPerson)
    {
        tvhovaten.setText(inforPerson.getHovaten());
        tvsodienthoai.setText(inforPerson.getSodienthoai());
        tvgioitinh.setText(inforPerson.getGioitinh());
        tvtrinhdo.setText(inforPerson.getTrinhdo());
        tvtuoi.setText(inforPerson.getTuoi()+"");
        tvthethao.setText(inforPerson.getThethao());
        tvtheloaiamnhac.setText(inforPerson.getTheloaiamnhac());
    }
}