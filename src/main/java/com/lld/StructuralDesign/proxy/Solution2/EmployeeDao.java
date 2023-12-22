package com.lld.StructuralDesign.proxy.Solution2;

public interface EmployeeDao {
    void create(String client,EmployeeDao obj) throws Exception;
    void delete(String client,EmployeeDao employeeId) throws Exception;
    EmployeeDao get(String client,int employeeId) throws Exception;
}
