package org.example.mappers;


import org.example.models.dtos.CategoryDto;
import org.example.models.dtos.FilmDto;
import org.example.models.entities.Category;
import org.example.models.entities.Film;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDto mapToCategoryDTO(Category category);

    Category mapToCategory(CategoryDto categoryDto);
}
