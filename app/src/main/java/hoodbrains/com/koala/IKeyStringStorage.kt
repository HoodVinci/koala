package hoodbrains.com.koala


interface IKeyStringStorage {

    fun store(key: String, value: String): Boolean

    fun get(key: String): String?

    fun get(key: String, defaultValue: String): String

    fun contains(key: String): Boolean
}