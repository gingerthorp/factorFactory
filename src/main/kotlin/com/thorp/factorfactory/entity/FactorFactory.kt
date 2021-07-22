package com.thorp.factorfactory.entity

import org.apache.tomcat.util.http.fileupload.FileUpload
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "dashboard")
class FactorFactory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column
    val title: String,

    @Column
    val content: String,

    @Column(name = "createdDate")
    val createdDate: LocalDateTime,

    @Column
    val updatedDate: LocalDateTime,

    @Column
    val isFileUploaded: String
) {
}