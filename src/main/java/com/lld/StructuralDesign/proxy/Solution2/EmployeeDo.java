package com.lld.StructuralDesign.proxy.Solution2;

public class EmployeeDo implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDao obj) throws Exception {

    }

    @Override
    public void delete(String client, EmployeeDao employeeId) throws Exception {

    }

    @Override
    public EmployeeDao get(String client, int employeeId) throws Exception {
        return null;
    }
}
