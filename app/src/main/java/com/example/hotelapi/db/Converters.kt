package com.example.hotelapi.db

import com.example.hotelapi.models.Source

class Converters {

    fun fromSource(source: Source): String {
        return source.name
    }
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}