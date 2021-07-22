package com.thorp.factorfactory.service

import com.thorp.factorfactory.any
import com.thorp.factorfactory.entity.FactorFactory
import com.thorp.factorfactory.mockRepository
import com.thorp.factorfactory.repository.FactorFactoryRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import java.time.LocalDateTime
import java.util.*


@ExtendWith(MockitoExtension::class)
internal class FactorFactoryServiceTest {
    private var factorFactoryRepository: FactorFactoryRepository = mockRepository()

    @InjectMocks
    lateinit var factorFactoryService: FactorFactoryService

    @Test
    fun `factorFactory 게시글 검색 테스트`() {

        Mockito.`when`(factorFactoryRepository.findById(any()))
            .thenReturn(
                Optional.of(
                    FactorFactory(
                        id = 0,
                        title = "",
                        content = "",
                        createdDate = LocalDateTime.now(),
                        updatedDate = LocalDateTime.now()
                    )
                )
            )

        val response = factorFactoryService.getPost(0)

        Assertions.assertEquals(response.id, 0)

    }
}