package com.thorp.factorfactory

import org.mockito.BDDMockito
import org.mockito.Mockito
import org.springframework.data.jpa.repository.JpaRepository

inline fun <reified REPOSITORY : JpaRepository<*, *>> mockRepository(): REPOSITORY = BDDMockito.mock(REPOSITORY::class.java)

fun <T> any(): T {
    Mockito.any<T>()
    return null as T
}