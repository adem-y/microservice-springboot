package com.ademyildiz.productionservice.repository;

import com.ademyildiz.productionservice.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepo extends JpaRepository<Stocks, Long> {

}
