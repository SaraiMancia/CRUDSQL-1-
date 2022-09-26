package com.fjar.app_crudsqlite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CrearBaseDato extends AppCompatActivity implements View.OnClickListener{
    private Button btncrearbd;
    ConexionSQLite database = new ConexionSQLite(this);
    Dto datos = new Dto();

    int codigo = 100;
    String descripcion = "Cell LG W41 Pro";
    double precio = 18.99;
    int idcategoria = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_base_dato);
        btncrearbd = findViewById(R.id.btncrearbd);
        btncrearbd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btncrearbd:
                Toast.makeText(this, "Base de datos creada.", Toast.LENGTH_SHORT).show();
                //database = new db_test(this);
                datos.setCodigo(codigo);
                datos.setDescripcion(descripcion);
                datos.setPrecio(precio);
                datos.setIdCategoria(idcategoria);
                if(database.InsertarTradicional(datos)){
                    Toast.makeText(this, "Registro guardado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Error. No se ha podido registrar el producto.", Toast.LENGTH_SHORT).show();
                }
                break;

            default:

        }
    }
}