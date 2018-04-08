package tw.hankli.gridrecyclerviewdemo.holders

import android.view.View
import kotlinx.android.synthetic.main.item_head.view.*
import tw.hankli.gridrecyclerviewdemo.models.Header
import tw.hankli.gridrecyclerviewdemo.models.Item

class HeaderViewHolder(itemView: View) : ItemViewHolder(itemView) {

    override fun bind(item: Item) {
        item as Header
        itemView.header_title.text = item.title
    }
}