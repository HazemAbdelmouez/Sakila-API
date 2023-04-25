package org.example.service;

import org.example.mappers.CategoryMapper;
import org.example.models.dtos.CategoryDto;
import org.example.models.entities.Category;
import org.example.repository.implementations.CategoryRepositoryImp;
import org.example.repository.interfaces.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    CategoryRepository categoryRepository;

    public CategoryService(){
        this.categoryRepository = new CategoryRepositoryImp();
    }

    public List<CategoryDto> getAllCategories(){

        List<CategoryDto> categoriesDto = new ArrayList<CategoryDto>();

        for(Category category: categoryRepository.getAll()){

            categoriesDto.add(CategoryMapper.MAPPER.mapToCategoryDTO(category));
        }
        return  categoriesDto;
    }

    public void addCategory(CategoryDto categoryDto){
        Category category = CategoryMapper.MAPPER.mapToCategory(categoryDto);

        categoryRepository.add(category);
    }

    public CategoryDto findCategoryById(int id){
        CategoryDto categoryDto;

        categoryDto = CategoryMapper.MAPPER.mapToCategoryDTO(categoryRepository.getById(id));

        return categoryDto;
    }

    public void deleteCategoryByID(int id){
        categoryRepository.delete(id);
    }
}
