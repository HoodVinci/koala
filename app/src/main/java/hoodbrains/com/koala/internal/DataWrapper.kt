package hoodbrains.com.koala.internal

import hoodbrains.com.koala.IDeserializer
import hoodbrains.com.koala.ISerializer


class DataWrapper(val clazz: String, val value: String) {


    inline fun <reified T> getDeserializedValue(deserializer: IDeserializer<T>): T {
        val tclass: Class<T> = Class.forName(clazz) as Class<T>
        return deserializer.deserialize(value, tclass)
    }

    companion object {
        inline fun <reified T : Any> newInstance(value: T, serializer: ISerializer<T>): DataWrapper {
            return DataWrapper(T::class.java.canonicalName, serializer.serialize(value))
        }


    }
}