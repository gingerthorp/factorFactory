package com.thorp.factorfactory.service

import com.thorp.factorfactory.repository.FactorFactoryRepository
import com.thorp.factorfactory.rest.dto.FactorFactoryResponse
import javassist.NotFoundException
import org.springframework.stereotype.Service


@Service
class FactorFactoryService(
    private val repository: FactorFactoryRepository
) {
    fun getPost(id: Long): FactorFactoryResponse{
        val post = repository.findById(id).orElseThrow{ throw NotFoundException("not found!")}

        return FactorFactoryResponse(
            id = post.id,
            title = "${post.title}",
            content = post.content,
            createdDate = post.createdDate,
            updatedDate = post.updatedDate,
            isFileUploaded = post.isFileUploaded
        )
    }
}

