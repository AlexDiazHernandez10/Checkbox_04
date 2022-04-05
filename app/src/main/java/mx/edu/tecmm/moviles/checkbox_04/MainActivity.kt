package mx.edu.tecmm.moviles.checkbox_04

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edNum3: EditText
    lateinit var  checkCursiva: CheckBox
    lateinit var checkNegritas: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edNum3 = findViewById(R.id.edNum3)
        checkCursiva = findViewById(R.id.checkCursiva)
        checkNegritas = findViewById(R.id.checkNegritas)

    }
    fun clickCheck(view: View){
        Log.e("Check", "Le puchaste ")
        val checkPresionado:CheckBox = view as CheckBox
        if (checkPresionado.id == R.id.checkCursiva && checkPresionado.isChecked){
            edNum3.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        }else if (checkPresionado.id == R.id.checkNegritas && checkPresionado.isChecked){
            edNum3.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        }else if(checkCursiva.isChecked && checkNegritas.isChecked){
            edNum3.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }
        else {
            edNum3.typeface = Typeface.defaultFromStyle(Typeface.NORMAL)
        }
    }
}
