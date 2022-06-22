package com.example.p2
//Alumno: Angel Hernandez Trejo
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.example.p2.databinding.ActivityMainBinding
//el activity es una vista
// declarando una clase
class MainActivity : Activity() {
    // Una variable tipo privada
    // lateinit: sirve para declara una propiedad cuando se contruye un objeto
    private lateinit var binding: ActivityMainBinding
    //overrible: sobre escribir
    //Super: esta llamado a onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Asingnar valor...
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgok.setOnClickListener {
            Toast.makeText(this,"Aceptar", Toast.LENGTH_SHORT).show()
        }
        binding.imgcan.setOnClickListener {//accion clic del boton
            Toast.makeText(this,"Cancelar", Toast.LENGTH_SHORT).show()
            //System.exit(0)//cerrar la aplicacion
        }


        //modificar el valor de textview
        //binding.text.text="angel"

    }
}