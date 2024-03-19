package uz.ssh.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import uz.ssh.coderswag.R
import uz.ssh.coderswag.model.Category

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories
    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        categoryView = LayoutInflater.from(
            context
        ).inflate(R.layout.category_list_item, null)

        val categoryImage = categoryView.findViewById(R.id.catoryImage) as ImageView
        val categoryName = categoryView.findViewById(R.id.catogoryName) as TextView
        val category = getItem(position) as Category
        categoryName.text = category.title
        val resouceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryImage.setImageResource(resouceId)
        return categoryView
    }
}