package com.undefined.proxima.core.reflection

import java.lang.reflect.Field

fun Any.getField(fieldName: String): Field = this.javaClass.getDeclaredField(fieldName).also { it.isAccessible = true }

fun <T> Any.getFieldValue(fieldName: String): T = this.getField(fieldName)[this] as T
fun <T> Any.getFieldValueFromSuper(fieldName: String): T = javaClass.superclass.getFieldValue(fieldName)

fun Any.setFieldValue(fieldName: String, fieldValue: Any): Boolean {
    try {
        this.getField(fieldName).set(this, fieldValue)
        return true
    } catch (e: Exception) {
        return false
    }
}

fun Any.setFieldValueFromSuper(fieldName: String, fieldValue: Any): Boolean = this.javaClass.superclass.setFieldValue(fieldName, fieldValue)
