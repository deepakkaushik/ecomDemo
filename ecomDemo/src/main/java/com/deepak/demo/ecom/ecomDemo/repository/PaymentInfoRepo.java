package com.deepak.demo.ecom.ecomDemo.repository;

import com.deepak.demo.ecom.ecomDemo.model.PaymentInfoDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepo extends JpaRepository<PaymentInfoDao, String> {
}
