package pl.nynacode.naukapraw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View as View1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Pobieramy układ z XML i przypisujemy do do zmiennej tworząc obiekt
       val recyclerView = findViewById<RecyclerView>(R.id.rVlegalNorm);
        // Ustawiamy aby nasze widoki w formie listy
        recyclerView.layoutManager = LinearLayoutManager(this);

        recyclerView.adapter = MyAdapter();

    }

}

