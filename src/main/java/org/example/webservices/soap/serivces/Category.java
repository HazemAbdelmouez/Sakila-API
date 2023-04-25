package org.example.webservices.soap.serivces;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.example.models.dtos.ActorDto;
import org.example.models.dtos.CategoryDto;
import org.example.service.ActorService;
import org.example.service.CategoryService;

import java.util.List;

@WebService
public class Category {
    CategoryService categoryService;

    public Category(){
         categoryService = new CategoryService();

    }

    @WebMethod
    public List<CategoryDto> getAllCategories(){
        List<CategoryDto> categories = categoryService.getAllCategories();
        return categories;
    }

    @WebMethod
    public CategoryDto getCategoryById(int id){
        CategoryDto category = categoryService.findCategoryById(id);
        return category;
    }

    @WebMethod
    public void addCategory(CategoryDto categoryDto){
        categoryService.addCategory(categoryDto);
    }

}
