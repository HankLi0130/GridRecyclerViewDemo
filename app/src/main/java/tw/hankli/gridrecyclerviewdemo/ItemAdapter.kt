package tw.hankli.gridrecyclerviewdemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import tw.hankli.gridrecyclerviewdemo.holders.BodyViewHolder
import tw.hankli.gridrecyclerviewdemo.holders.HeaderViewHolder
import tw.hankli.gridrecyclerviewdemo.holders.ItemViewHolder
import tw.hankli.gridrecyclerviewdemo.models.Item
import java.util.*

class ItemAdapter : RecyclerView.Adapter<ItemViewHolder>() {

    var items: List<Item> = Collections.emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemViewType(position: Int): Int {
        return items[position].getViewType()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            Item.VIEW_TYPE_HEADER -> {
                val view = inflater.inflate(R.layout.item_head, parent, false)
                HeaderViewHolder(view)
            }
            Item.VIEW_TYPE_BODY -> {
                val view = inflater.inflate(R.layout.item_body, parent, false)
                BodyViewHolder(view)
            }
            else -> throw IllegalArgumentException("View Type not exist!!!")
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }
}