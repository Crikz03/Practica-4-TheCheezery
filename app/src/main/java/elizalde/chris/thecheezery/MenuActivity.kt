package elizalde.chris.thecheezery

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweet: Button = findViewById(R.id.button_sweets) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button
        var btnCombo: Button = findViewById(R.id.button_combos) as Button
        var btnCustom: Button = findViewById(R.id.button_custom) as Button


        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoMenu", "cold_drinks")
            intent.putExtra("imgTipoProducto", R.drawable.colddrinks)
            startActivity(intent)
        }

        btnHot.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoMenu", "hot_drinks")
            intent.putExtra("imgTipoProducto", R.drawable.hotdrinks)
            startActivity(intent)
        }

        btnSweet.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoMenu", "sweets")
            intent.putExtra("imgTipoProducto", R.drawable.sweets)
            startActivity(intent)
        }

        btnSalties.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoMenu", "salties")
            intent.putExtra("imgTipoProducto", R.drawable.salties)
            startActivity(intent)
        }

//        btnCombo.setOnClickListener{
//            var intent: Intent = Intent(this, ProductosActivity::class.java)
//            intent.putExtra("tipoMenu", "combo")
//            startActivity(intent)
//        }
//
//        btnCustom.setOnClickListener{
//            var intent: Intent = Intent(this, ProductosActivity::class.java)
//            intent.putExtra("tipoMenu", "custom")
//            startActivity(intent)
//        }

    }
}