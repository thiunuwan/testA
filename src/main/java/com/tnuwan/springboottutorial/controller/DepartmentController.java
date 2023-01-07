package com.tnuwan.springboottutorial.controller;


import com.tnuwan.springboottutorial.entity.Department;
import com.tnuwan.springboottutorial.service.DepartmentService;
import com.tnuwan.springboottutorial.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private  DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
    return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping ("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
       departmentService.deleteDepartmentById(departmentId);
       return "department deleted sucessfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department){
       return departmentService.updateDepartmentById(departmentId, department);

    }

      @GetMapping("/departments/name/{name}")
      public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
             return departmentService.fetchDepartmentByName(departmentName);
      }

}
