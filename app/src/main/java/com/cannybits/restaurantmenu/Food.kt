package com.cannybits.restaurantmenu

class Food {
    var name: String? = null
    var desc: String? = null
    var image: Int? = null

    constructor(name: String, description: String, image: Int){
        this.name = name
        this.desc = description
        this.image = image
    }
}