package pl.nynacode.naukapraw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cart_view_legal_name.view.*
import kotlinx.android.synthetic.main.chapter_layout.view.*

/**
 * Contains all possible view holder types of [MyAdapter].
 */
sealed class Types(val rawType: Int) {
    object Title : Types(0)
    object Article : Types(1)

    companion object {
        fun from(rawType: Int) =
            when (rawType) {
                Title.rawType -> Title
                Article.rawType -> Article
                else -> throw RuntimeException("No such type")
            }
    }
}

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        LayoutInflater.from(parent.context).let { inflater ->
            when (Types.from(viewType)) {
                Types.Title ->
                    TitleViewHolder(
                        inflater.inflate(
                            R.layout.chapter_layout,
                            parent,
                            false
                        )
                    )
                Types.Article ->
                    ArticleViewHolder(
                        inflater.inflate(
                            R.layout.cart_view_legal_name,
                            parent,
                            false
                        )
                    )
            }
        }

    override fun getItemCount(): Int {
        return KodeksKarny.nrArticle.size
    }

    override fun getItemViewType(position: Int): Int =
        when (position) {
            0 -> Types.Title.rawType
            else -> Types.Article.rawType
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (Types.from(getItemViewType(position))) {
            Types.Title -> {
                val chapterName = holder.itemView.tvChapterName
                chapterName.text = KodeksKarny.nrArticle[position]
            }
            Types.Article -> {
                val nrArt = holder.itemView.nrArt
                nrArt.text = KodeksKarny.nrArticle[position]
                val txtArt = holder.itemView.txtArt
                txtArt.text = KodeksKarny.txtArticle[position]

                nrArt.setOnClickListener {
                    if (txtArt.visibility == View.GONE) {
                        txtArt.visibility = View.VISIBLE
                    } else {
                        txtArt.visibility = View.GONE
                    }
                }
            }
        }
}

class TitleViewHolder(view: View) : RecyclerView.ViewHolder(view)
class ArticleViewHolder(view: View) : RecyclerView.ViewHolder(view)
