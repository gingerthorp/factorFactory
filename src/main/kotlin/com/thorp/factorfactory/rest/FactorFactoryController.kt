package com.thorp.factorfactory.rest

import com.thorp.factorfactory.rest.dto.FactorFactoryResponse
import com.thorp.factorfactory.service.FactorFactoryService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/factorfactory/v1")
class FactorFactoryController(
    private val factorFactoryService: FactorFactoryService
) {

    @GetMapping("/post/{id}")
    @ApiOperation(value = "post get api", notes = "post get api swagger check")

    fun posts(
        @PathVariable id: Long
    ): FactorFactoryResponse{
        return factorFactoryService.getPost(id)
    }
}