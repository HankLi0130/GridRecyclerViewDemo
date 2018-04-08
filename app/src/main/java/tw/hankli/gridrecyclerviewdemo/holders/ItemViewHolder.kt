package tw.hankli.gridrecyclerviewdemo.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import tw.hankli.gridrecyclerviewdemo.models.Item

abstract class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(item: Item)
}