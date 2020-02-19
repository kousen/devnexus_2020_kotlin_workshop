package com.devnexus.icndb

import com.google.gson.Gson
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

fun getJoke(first: String = "Pratik", last: String = "Patel"): String {
    val params = mapOf(
        "limitTo" to "[nerdy]",
        "firstName" to URLEncoder.encode(first, "UTF-8"),
        "lastName" to URLEncoder.encode(last, StandardCharsets.UTF_8)
    ).entries.joinToString("&")
    return Gson().fromJson(
        URL("http://api.icndb.com/jokes/random?$params").readText(),
        JokeResponse::class.java).value.joke
}
