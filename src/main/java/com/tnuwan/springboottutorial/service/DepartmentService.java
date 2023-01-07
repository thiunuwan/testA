package com.tnuwan.springboottutorial.service;

import com.tnuwan.springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
  public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


  public Department fetchDepartmentById(Long departmentId);

  public void deleteDepartmentById(Long departmentId);

  public Department updateDepartmentById(Long departmentId, Department department);

  public Department fetchDepartmentByName(String departmentName);
}
