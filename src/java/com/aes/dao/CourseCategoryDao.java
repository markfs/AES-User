/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.dao;
import com.aes.model.CourseCategory;
import java.util.List;
/**
 *
 * @author Bryan
 */
public interface CourseCategoryDao {
    public void add(CourseCategory category);
    public void edit(CourseCategory category);
    public void delete(int categoryId);
    public CourseCategory getById(int categoryId);
    public List getAll();
    public int getNextId();
    public List searchName(String name);
    
}