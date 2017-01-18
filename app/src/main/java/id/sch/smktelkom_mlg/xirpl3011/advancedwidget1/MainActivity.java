package id.sch.smktelkom_mlg.xirpl3011.advancedwidget1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static id.sch.smktelkom_mlg.xirpl3011.advancedwidget1.R.styleable.View;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);

                        EditText etNama = new EditText(this);
                llMain.addView(etNama);
                etNama.setHint("Isikan Nama Anak");

                        EditText etUmur = new EditText(this);
                llMain.addView(etUmur);
                etUmur.setHint("Isikan Umur Anak");
                etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);

                       Button bProses = new Button(this);
                bProses.setText("Proses");
                llMain.addView(bProses);
                TextView tvHasil = new TextView(this);
                llMain.addView(tvHasil);

        final TextView finalTvHasil = tvHasil;
        final EditText finalEtNama2 = etNama;
        final EditText finalEtUmur2 = etUmur;
        bProses.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view){
                                        String nama = finalEtNama2.getText().toString();
                                        String umur = finalEtUmur2.getText().toString();

                                                finalTvHasil.setText(nama +" umur "+umur+" tahun ");
                                    }

                                    });
        llMain = (LinearLayout) findViewById(R.id.LinearLayoutMain);

        etNama = new EditText(this);
                llMain.addView(etNama);
                etNama.setHint("Isikan Nama Anak");

        etUmur = new EditText(this);
                llMain.addView(etUmur);
                etUmur.setHint("Isikan Umur Anak");
                etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);

        bProses = new Button(this);
                bProses.setText("Proses");

        llMain = (LinearLayout) findViewById(R.id.LinearLayoutMain);

        etNama = new EditText(this);
                llMain.addView(etNama);
                etNama.setHint("Isikan Nama Anak");

        etUmur = new EditText(this);
                llMain.addView(etUmur);
                etUmur.setHint("Isikan Umur Anak");
                etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);

        bProses = new Button(this);
                bProses.setText("Proses");
                llMain.addView(bProses);
        tvHasil = new TextView(this);
                llMain.addView(tvHasil);

        final EditText finalEtNama = etNama;
        final EditText finalEtUmur = etUmur;
        final TextView finalTvHasil1 = tvHasil;
        bProses.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view){
                                        String nama = finalEtNama.getText().toString();
                                        String umur = finalEtUmur.getText().toString();

                                                finalTvHasil1.setText(nama +" umur "+umur+" tahun ");
                                    }

                                    });
        llMain.addView(bProses);
        tvHasil = new TextView(this);
                llMain.addView(tvHasil);

        final EditText finalEtUmur1 = etUmur;
        final EditText finalEtNama1 = etNama;
        final TextView finalTvHasil2 = tvHasil;
        bProses.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view){
                                        String nama = finalEtNama1.getText().toString();
                                        String umur = finalEtUmur1.getText().toString();

                                                finalTvHasil2.setText(nama +" umur "+umur+" tahun ");
                                    }

                                    });
    }
}
