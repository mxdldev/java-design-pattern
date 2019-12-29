package com.mxdl.desigin.pattern.behavior.a03_chain.contract;

/**
 * Description: <Employee><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class Employee {
    protected Employee mEmployee;

    public Employee(Employee employee) {
        mEmployee = employee;
    }

    public abstract void request(int day);
}
