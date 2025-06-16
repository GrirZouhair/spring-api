package com.grirzouhair.springapi.repositories;

import com.grirzouhair.springapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Byte> {
}