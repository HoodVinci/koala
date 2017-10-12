package hoodbrains.com.koala

import hoodbrains.com.koala.internal.DataWrapper


class KeyValueStorage(val stringStorage: IKeyStringStorage, val deserializer: IDeserializer<Any>) {


    fun store(key: String, toStore: Any): Boolean {
        return false
    }


    inline fun <T> get(key: String, defaultValue: T): T? {
        if (stringStorage.contains(key)) {
            val dataWrapper: DataWrapper = DataWrapper.fromJsonString(deserializer, stringStorage.get(key, ""))
            val value: T = dataWrapper.getDeserializedValue(deserializer);
            return value
        }
        return defaultValue

    }

    fun storeInCollection(collectionId: String, itemKey: String, toStore: Any): Boolean {
        return false
    }

    inline fun <T> getInCollection(collectionId: String, itemKey: String): T? {
        return null
    }

    inline fun <T> getCollection(collectionId: String, key: String): List<T>? {
        return null
    }
}