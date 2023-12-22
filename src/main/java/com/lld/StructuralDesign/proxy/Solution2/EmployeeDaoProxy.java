package com.lld.StructuralDesign.proxy.Solution2;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDaopObj;
    @Override
    public void create(String client, EmployeeDao obj) throws Exception {
        if(client.equals("ADMIN"))
        {
            employeeDaopObj.create(client,obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, EmployeeDao employeeId) throws Exception {
        if(client.equals("ADMIN"))
        {
            employeeDaopObj.delete(client,employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDao get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER"))
        {
            employeeDaopObj.get(client,employeeId);

        }
        throw new Exception("Access Denied");
    }
}
