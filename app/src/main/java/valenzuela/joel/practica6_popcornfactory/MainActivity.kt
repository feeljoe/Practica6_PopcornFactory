package valenzuela.joel.practica6_popcornfactory

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pelicula.view.*

class MainActivity : AppCompatActivity() {
    var context : Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getMeIn.setOnClickListener(){
            var intent = Intent(context, Catalogo::class.java)
            intent.putExtra("Peliculas &amp; series", "Peliculas &amp; series")
            context!!.startActivity(intent)
        }
    }

}
