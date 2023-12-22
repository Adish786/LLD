package com.lld.StructuralDesign.proxy.Solution2;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDao obj) throws Exception {
        //creates a new row
        System.out.println("created new row in the Employee table");
    }

    @Override
    public void delete(String client, EmployeeDao employeeId) throws Exception {
//delete a new row
        System.out.println("deleted new row in the Employee table" +employeeId);
    }

    @Override
    public EmployeeDao get(String client, int employeeId) throws Exception {
        //fetch row
        System.out.println("fetching data from Db");
        return new EmployeeDo();


    }
}
