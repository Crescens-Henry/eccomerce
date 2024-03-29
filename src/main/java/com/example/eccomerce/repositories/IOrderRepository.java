package com.example.eccomerce.repositories;

import com.example.eccomerce.entities.Order;
import com.example.eccomerce.entities.enums.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
    @Query(value = "select * from orders where orders.user_id = :userId", nativeQuery = true)
    List<Order> findByUserId(Long userId);

    List<Order> findByType(PaymentType type);

}
