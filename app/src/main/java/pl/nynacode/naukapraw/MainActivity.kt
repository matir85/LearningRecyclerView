package pl.nynacode.naukapraw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

