package com.library.management.repository;

import com.library.management.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
}