package com.grirzouhair.springapi.mappers;

import com.grirzouhair.springapi.dtos.ProductDto;
import com.grirzouhair.springapi.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "category.id", target = "categoryId")
    ProductDto toDto(Product product);
}
