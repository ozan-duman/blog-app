package com.anproject.BlogApp.controller;

import com.anproject.BlogApp.payload.request.CategoryRequestDto;
import com.anproject.BlogApp.payload.response.CategoryResponseDto;
import com.anproject.BlogApp.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/admin/category/index")
    public String showCategoryPage(Model model){
        model.addAttribute("category", categoryService.getAllCategories());
        return "/admin/category/index";
    }

    @GetMapping("/admin/category/add-category")
    public String showAddCategory(Model model){
        model.addAttribute("category", new CategoryRequestDto());
        return "/admin/category/add-category";
    }

    @PostMapping("/admin/add-category")
    public String addCategory(CategoryRequestDto category){
        categoryService.save(category);
        return "redirect:/admin/category/index";
    }

    @GetMapping("/admin/category/edit-category/{id}")
    public String editCategory(@PathVariable(value = "id") long id, Model model){
        CategoryResponseDto category = categoryService.getById(id);
        model.addAttribute("category", category);
        return "/admin/category/edit-category";
    }

    @GetMapping("/admin/category/edit-delete/{id}")
    public String deleteCategory(@PathVariable(value = "id") long id){
        categoryService.deleteCategory(id);
        return "redirect:/admin/category/index";
    }

}