package alegtx.univalle.com.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    public String TipoConversion="";
    public Button CF,FC,CK,KC,MC,CM,CP,PC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Conversor de unidades");

    }
    public void C_F(View v){
        CF=(Button)findViewById(R.id.btn_C_F);
        TipoConversion=CF.getText().toString();
        CambiarVentana();
    }
    public void CambiarVentana(){
        Intent Ventana=new Intent(getApplicationContext(),Conversion.class);
        Ventana.putExtra("Tipo_Conversion",TipoConversion);
        startActivity(Ventana);
    }
}
