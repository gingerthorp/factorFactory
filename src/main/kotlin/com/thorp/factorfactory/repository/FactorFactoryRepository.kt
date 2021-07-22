package com.thorp.factorfactory.repository

import com.thorp.factorfactory.entity.FactorFactory
import org.springframework.data.jpa.repository.JpaRepository

interface FactorFactoryRepository : JpaRepository<FactorFactory, Long>{
}