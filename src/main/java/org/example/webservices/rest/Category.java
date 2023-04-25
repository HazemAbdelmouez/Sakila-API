package org.example.webservices.rest;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.example.models.dtos.CategoryDto;
import org.example.service.CategoryService;

import java.util.List;

@Path("category")
public class Category {
    CategoryService categoryService;

    public Category(){
         categoryService = new CategoryService();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CategoryDto> getAllCategories(){
        List<CategoryDto> categories = categoryService.getAllCategories();
        return categories;
    }
    

   
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CategoryDto getCategoryById(@PathParam("id") int id){
        CategoryDto category = categoryService.findCategoryById(id);
        return category;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addCategory(CategoryDto categoryDto){
        categoryService.addCategory(categoryDto);
    }

   

    @DELETE
    @Path("{id}")
    public Response deleteCategory(@PathParam("id") int id){
        categoryService.deleteCategoryByID(id);       
        return Response.ok().build();
    }
}
