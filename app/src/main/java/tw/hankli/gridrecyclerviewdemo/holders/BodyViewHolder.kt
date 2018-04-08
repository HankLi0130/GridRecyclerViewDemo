package tw.hankli.gridrecyclerviewdemo.holders

import android.view.View
import kotlinx.android.synthetic.main.item_body.view.*
import tw.hankli.gridrecyclerviewdemo.models.Body
import tw.hankli.gridrecyclerviewdemo.models.Item

class BodyViewHolder(itemView: View) : ItemViewHolder(itemView) {

    override fun bind(item: Item) {
        item as Body
        itemView.body_icon.setImageResource(item.icon)
        itemView.body_name.text = item.name
    }
}