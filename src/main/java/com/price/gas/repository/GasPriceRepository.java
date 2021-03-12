package com.price.gas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.price.gas.model.GasPrices;


public interface GasPriceRepository extends MongoRepository<GasPrices, String> {

}
