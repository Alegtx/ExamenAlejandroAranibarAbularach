package alegtx.univalle.com.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Conversion extends AppCompatActivity {
    public String TipoConversion="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        TipoConversion = getIntent().getStringExtra("Tipo_Conversion");
        this.setTitle(TipoConversion);
    }
}
