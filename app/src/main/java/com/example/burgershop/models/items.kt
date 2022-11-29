package com.example.burgershop.models

import com.example.burgershop.R

data class ItemModel(
    val title : String,
    val price : Int,
    val weight : Int,
    val itemStatus : Boolean,
    val descr : String,
    val image : Int,
    val itemid : Int
)

val itemList = listOf<ItemModel>(
    ItemModel("Воппер", 200, 500, true, "В этом красавце целых 300 граммов невероятно нежной 100% мраморной говядины Абердин Ангус, приготовленной на живом огне. Французская булочка бриошь со свежими овощами, луком фри, беконом в/к и голландским сыром.", R.drawable.item_1, 1001),
    ItemModel("Двойной воппер", 250, 600, true, "Одолеть его будет непросто: два приготовленных на огне фирменных говяжьих бифштекса, два ломтика слегка расплавленного сыра, хрустящий маринованный огурчик, золотистая горчица и кетчуп. И все это в подрумяненной и посыпанной кунжутом булочке.", R.drawable.item_1, 1002),
    ItemModel("Тройной воппер", 300, 700, true, "Двойной ВОППЕР® — это два аппетитных, приготовленных на огне бифштекса из 100% говядины с сочными помидорами, свежим нарезанным листовым салатом, густым майонезом, хрустящими маринованными огурчиками и рубленым белым луком на нежной булочке с кунжутной посыпкой", R.drawable.item_1, 1003),
    ItemModel("Андрей", 2000, 1000, false, "Двойной ВОППЕР® — это два аппетитных, приготовленных на огне бифштекса из 100% говядины с сочными помидорами, свежим нарезанным листовым салатом, густым майонезом, хрустящими маринованными огурчиками и рубленым белым луком на нежной булочке с кунжутной посыпкой", R.drawable.item_1, 1004),
    ItemModel("Чизбургер", 1000, 400, true, "Одолеть его будет непросто: два приготовленных на огне фирменных говяжьих бифштекса, два ломтика слегка расплавленного сыра, хрустящий маринованный огурчик, золотистая горчица и кетчуп. И все это в подрумяненной и посыпанной кунжутом булочке.", R.drawable.item_1, 1005),
    ItemModel("Особый", 250, 800, true, "Двойной ВОППЕР® — это два аппетитных, приготовленных на огне бифштекса из 100% говядины с сочными помидорами, свежим нарезанным листовым салатом, густым майонезом, хрустящими маринованными огурчиками и рубленым белым луком на нежной булочке с кунжутной посыпкой", R.drawable.item_1, 1006),
    ItemModel("Гамбургер", 100, 450, true, "В этом красавце целых 300 граммов невероятно нежной 100% мраморной говядины Абердин Ангус, приготовленной на живом огне. Французская булочка бриошь со свежими овощами, луком фри, беконом в/к и голландским сыром.", R.drawable.item_1, 1007),
    ItemModel("Двойной гамбургер", 150, 500, true, "Одолеть его будет непросто: два приготовленных на огне фирменных говяжьих бифштекса, два ломтика слегка расплавленного сыра, хрустящий маринованный огурчик, золотистая горчица и кетчуп. И все это в подрумяненной и посыпанной кунжутом булочке.", R.drawable.item_1, 1008),
    ItemModel("Тройной гамбургер", 200, 550, false, "В этом красавце целых 300 граммов невероятно нежной 100% мраморной говядины Абердин Ангус, приготовленной на живом огне. Французская булочка бриошь со свежими овощами, луком фри, беконом в/к и голландским сыром.", R.drawable.item_1, 1009)
)