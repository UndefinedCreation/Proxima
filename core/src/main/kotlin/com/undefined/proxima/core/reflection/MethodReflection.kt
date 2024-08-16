package com.undefined.proxima.core.reflection

import java.lang.reflect.Method

fun Method.safeInvoke(obj: Any, vararg args: Any?): Any? {
    return try {
        this.invoke(obj, *args)
    } catch (e: Exception) {
        null
    }
}

fun Any.invokeMethod(methodName: String, vararg args: Any?): Any? {
    val method = this::class.java.getMethod(methodName, *args.map { it!!::class.java }.toTypedArray())
    return method.safeInvoke(this, *args)
}

fun Any.invokeMethodFromSuper(methodName: String, vararg args: Any?): Any? = this::class.java.superclass.invokeMethod(methodName, args)