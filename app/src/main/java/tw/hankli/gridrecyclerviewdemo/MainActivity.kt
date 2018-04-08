package tw.hankli.gridrecyclerviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import tw.hankli.gridrecyclerviewdemo.models.Body
import tw.hankli.gridrecyclerviewdemo.models.Header
import tw.hankli.gridrecyclerviewdemo.models.Item

class MainActivity : AppCompatActivity() {

    private val itemSize = 100
    private val spanCount = 4
    private val headerSpanCount = spanCount
    private val bodySpanCount = 1

    private lateinit var adapter: ItemAdapter
    private lateinit var layoutManager: GridLayoutManager
    private lateinit var recyclerView: RecyclerView

    // Data
    private var items = listOf(
            Header("Title1"),

            Body(R.mipmap.ic_launcher_round, "Item1"),
            Body(R.mipmap.ic_launcher_round, "Item2"),
            Body(R.mipmap.ic_launcher_round, "Item3"),
            Body(R.mipmap.ic_launcher_round, "Item4"),

            Header("Title2"),
            Body(R.mipmap.ic_launcher_round, "Item5"),
            Body(R.mipmap.ic_launcher_round, "Item6"),
            Body(R.mipmap.ic_launcher_round, "Item7"),
            Body(R.mipmap.ic_launcher_round, "Item8"),
            Body(R.mipmap.ic_launcher_round, "Item9"),

            Header("Title3"),
            Body(R.mipmap.ic_launcher_round, "Item10"),
            Body(R.mipmap.ic_launcher_round, "Item11"),
            Body(R.mipmap.ic_launcher_round, "Item12"),

            Header("Title4"),
            Body(R.mipmap.ic_launcher_round, "Item13"),
            Body(R.mipmap.ic_launcher_round, "Item14"),
            Body(R.mipmap.ic_launcher_round, "Item15"),
            Body(R.mipmap.ic_launcher_round, "Item16"),
            Body(R.mipmap.ic_launcher_round, "Item17"),
            Body(R.mipmap.ic_launcher_round, "Item18"),
            Body(R.mipmap.ic_launcher_round, "Item19"),
            Body(R.mipmap.ic_launcher_round, "Item20"),
            Body(R.mipmap.ic_launcher_round, "Item21"),
            Body(R.mipmap.ic_launcher_round, "Item22"),
            Body(R.mipmap.ic_launcher_round, "Item23"),
            Body(R.mipmap.ic_launcher_round, "Item24"),
            Body(R.mipmap.ic_launcher_round, "Item25"),
            Body(R.mipmap.ic_launcher_round, "Item26"),
            Body(R.mipmap.ic_launcher_round, "Item27"),
            Body(R.mipmap.ic_launcher_round, "Item28"),
            Body(R.mipmap.ic_launcher_round, "Item29"),
            Body(R.mipmap.ic_launcher_round, "Item30"),
            Body(R.mipmap.ic_launcher_round, "Item31"),
            Body(R.mipmap.ic_launcher_round, "Item32")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setHugeItems()

        adapter = ItemAdapter()
        adapter.items = this.items

        layoutManager = GridLayoutManager(this, spanCount)

        // Header設定Span Count
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {

            override fun getSpanSize(position: Int): Int {
                return if (items[position].getViewType() == Item.VIEW_TYPE_HEADER) {
                    headerSpanCount
                } else {
                    bodySpanCount
                }
            }
        }

        recyclerView = recycler_view
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun setHugeItems() {

        items = Array<Item>(itemSize) { index ->

            if (index % 5 == 0) {
                Header("Title")
            } else {
                Body(R.mipmap.ic_launcher_round, "Item")
            }

        }.asList()
    }
}
