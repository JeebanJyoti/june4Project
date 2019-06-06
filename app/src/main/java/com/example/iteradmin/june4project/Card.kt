package com.example.iteradmin.june4project

class Card(thumbnail:String, title:String, subtitle:String) {
    private val thumbnail:String
    private val title:String
    private val subtitle:String

    init {
        this.thumbnail=thumbnail
        this.title=title
        this.subtitle=subtitle
    }

    fun getThumbnail():String{
        return this.thumbnail
    }

    fun getTitle():String{
        return this.title
    }

    fun getSubtitle():String{
        return this.subtitle
    }
}