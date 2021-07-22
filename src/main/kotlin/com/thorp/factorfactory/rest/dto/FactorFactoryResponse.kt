package com.thorp.factorfactory.rest.dto

import java.time.LocalDateTime


class FactorFactoryResponse(

    val id: Long = 0,
    val title: String,
    val content: String,
    val createdDate: LocalDateTime,
    val updatedDate: LocalDateTime,
    val isFileUploaded: String = ""
) {

}