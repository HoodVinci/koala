package hoodbrains.com.koala


interface IDeserializer<T> {

    fun deserialize(jsonValue: String, tClass: Class<T>): T
}