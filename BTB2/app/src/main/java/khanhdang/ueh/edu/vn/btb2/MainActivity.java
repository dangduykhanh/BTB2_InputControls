package khanhdang.ueh.edu.vn.btb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private EditText hovaten;
    private EditText sodienthoai;
    private Switch gioitinh;
    private Spinner trinhdo;
    private SeekBar tuoi;
    private CheckBox thethao;
    private RadioButton rap;
    private RadioButton rock;
    private RadioButton pop;
    private ImageView btnRegister;
    private ImageView btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectView();
        LoadDatatoSpinner(trinhdo);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hovaten.setText("");
                sodienthoai.setText("");
                gioitinh.setChecked(false);
                LoadDatatoSpinner(trinhdo);
                tuoi.setProgress(1);
                thethao.setChecked(false);
                rock.setChecked(false);
                rap.setChecked(false);
                pop.setChecked(false);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gt=gioitinh.isChecked() ? "Nam":"Nữ";
                String tt = thethao.isChecked()? "Thích Thể Thao":"Không Thích Thể Thao";
                InforPerson inforPerson = new InforPerson(hovaten.getText().toString(),sodienthoai.getText().toString(),gt,
                        trinhdo.getSelectedItem().toString(),tuoi.getProgress(),tt,IsChecked().getText().toString());

                Intent intent = new Intent(getApplicationContext(),MsgActivity.class);
                intent.putExtra("inforperson",inforPerson);
                startActivity(intent);
            }
        });
    }
    private void ConnectView()
    {
        hovaten =findViewById(R.id.eTHovaTen);
        sodienthoai =findViewById(R.id.eTSoDienThoai);
        gioitinh =findViewById(R.id.swGioiTinh);
        trinhdo =findViewById(R.id.spTrinhDo);
        tuoi =findViewById(R.id.sBTuoi);
        thethao =findViewById(R.id.cBTheThao);
        rap =findViewById(R.id.rBRap);
        rock =findViewById(R.id.rBRock);
        pop =findViewById(R.id.rBPop);
        btnRegister=findViewById(R.id.iVRegister);
        btnCancel =findViewById(R.id.iVCancel);
    }
    private void LoadDatatoSpinner(Spinner td)
    {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.arrayTrinhDo, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        td.setAdapter(adapter);
    }
    private RadioButton IsChecked()
    {
        if(rap.isChecked())
        {
            return rap;
        }
        else if (rock.isChecked())
        {
            return rock;
        }
        else
        {
            return pop;
        }
    }
}