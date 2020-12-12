package Presenter.HomeScreen.DetailsScreen

import Model.EventDescriptionData.EventDescription
import View.Activities.ItemMore
import android.text.Html
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.gaiety.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recyclerview_item_more.view.*

class ItemMoreAdapter(val event: EventDescription, val image: ImageView) : RecyclerView.Adapter<ItemMoreAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item_more, parent, false)
        return ItemHolder(
            itemHolder
        )
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        if (event.poster_image == null) {
            image.setImageResource(R.drawable.logo)
        } else {
            Picasso.get()
                .load(event.poster_image.default_url)
                .into(image)
        }

        when (position) {
            0 -> {
                holder.itemView.textOfHead.text = Html.fromHtml(event.description_html)
                holder.itemView.textOfHead.movementMethod = ScrollingMovementMethod()
                holder.itemView.head.text = "Описание"
            }
            1 -> {
                var string: String = "Начало: " + event.starts_at
                string = string + "\nКонец: " + event.ends_at
                holder.itemView.textOfHead.text = Html.fromHtml(string)
                holder.itemView.textOfHead.movementMethod = ScrollingMovementMethod()
                holder.itemView.head.text = "Когда"
            }
            2 -> {
                var string: String = "Страна: " + event.location.country
                string = string + "\nГород: " + event.location.city
                string = string + "\nАдрес: " + event.location.address
                holder.itemView.textOfHead.text = string
                holder.itemView.textOfHead.movementMethod = ScrollingMovementMethod()
                holder.itemView.head.text = "Где"
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
    class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        // ItemHolder
    }
}
