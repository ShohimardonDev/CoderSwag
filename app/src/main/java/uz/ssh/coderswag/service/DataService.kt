package uz.ssh.coderswag.service

import uz.ssh.coderswag.model.Category
import uz.ssh.coderswag.model.Product

object DataService {
    val categorys = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("Devslopes Logo Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Logo Hat Black", "$20", "hat2"),
        Product("Devslopes Logo Hat White", "$22", "hat3"),
        Product("Devslopes Logo Snapback", "$20", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Logo Hoodie Grey", "$32", "hoodie1"),
        Product("Devslopes Logo Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Logo Hoodie Grey", "$32", "hoodie3"),
        Product("Devslopes Logo Hoodie Black", "$32", "hoodie4")
    )
    val shirts = listOf(
        Product("Devslopes Logo Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Shirt Red", "$19", "shirt2"),
        Product("Devslopes Logo Shirt Black", "$18", "shirt3"),
        Product("Devslopes Logo Shirt Black", "$18", "shirt4")
    )
}