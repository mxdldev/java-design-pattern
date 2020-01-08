package com.mxdl.desigin.pattern.behavior.a03_chain.entity;

import com.mxdl.desigin.pattern.behavior.a03_chain.contract.Employee;

/**
 * Description: <BigLeader><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class BigLeader extends Employee {
    public BigLeader(Employee employee) {
        super(employee);
    }

    @Override
    public void request(int day) {
        System.out.println("大领导批了");
    }
}
