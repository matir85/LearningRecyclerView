package pl.nynacode.naukapraw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cart_view_legal_name.view.*
import kotlinx.android.synthetic.main.chapter_layout.view.*

private const val TITLE_VIEW =0
private const val ARTICLE_VIEW=1

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType== TITLE_VIEW){
            val view = LayoutInflater.from(parent.context)
            val cardArticle = view.inflate(R.layout.chapter_layout, parent, false)
            return TitleViewHolder(cardArticle)
        }else{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_view_legal_name, parent, false)
            return ArticleViewHolder(view)
        }
    }

    override fun getItemCount(): Int {
        return KodeksKarny.nrArticle.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (KodeksKarny.nrArticle[position] == 0)
        {
            TITLE_VIEW
        }else {
            ARTICLE_VIEW}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == TITLE_VIEW){
            val chapterName = holder.itemView.tvChapterName
            chapterName.setText(KodeksKarny.nrArticle[position])
        }else {
            val nrArt = holder.itemView.nrArt
            nrArt.setText(KodeksKarny.nrArticle[position])
            val txtArt = holder.itemView.txtArt
            txtArt.setText(KodeksKarny.txtArticle[position])

            nrArt.setOnClickListener{
                if (txtArt.visibility == View.GONE){
                    txtArt.visibility = View.VISIBLE
                }else{
                    txtArt.visibility = View.GONE
                }
            }
        }
    }
}

class TitleViewHolder(val view: View):RecyclerView.ViewHolder(view){
}
class ArticleViewHolder(val view: View):RecyclerView.ViewHolder(view){}
