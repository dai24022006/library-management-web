package com.library.management.repository;

import com.library.management.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
}