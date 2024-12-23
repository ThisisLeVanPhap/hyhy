package com.example.NMproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NMproject.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	Cart findByUserID_Id(Long userID); // Tìm Cart theo userID
}
