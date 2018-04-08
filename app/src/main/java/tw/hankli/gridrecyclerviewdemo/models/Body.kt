package tw.hankli.gridrecyclerviewdemo.models

import tw.hankli.gridrecyclerviewdemo.models.Item.Companion.VIEW_TYPE_BODY

class Body(val icon: Int, val name: String) : Item {

    override fun getViewType(): Int {
        return VIEW_TYPE_BODY
    }
}