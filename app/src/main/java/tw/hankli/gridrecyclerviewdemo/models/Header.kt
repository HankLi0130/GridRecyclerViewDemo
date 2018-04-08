package tw.hankli.gridrecyclerviewdemo.models

import tw.hankli.gridrecyclerviewdemo.models.Item.Companion.VIEW_TYPE_HEADER

class Header(val title: String) : Item {

    override fun getViewType(): Int {
        return VIEW_TYPE_HEADER
    }
}