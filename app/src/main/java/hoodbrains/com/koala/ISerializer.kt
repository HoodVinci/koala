package hoodbrains.com.koala


interface ISerializer<T> {

    fun serialize(toSerialize: T): String {
        return ""
    }
}