package tw.hankli.gridrecyclerviewdemo.models

interface Item {

    companion object {
        const val VIEW_TYPE_HEADER = 0
        const val VIEW_TYPE_BODY = 1
    }

    fun getViewType(): Int
}