package com.mxdl.desigin.pattern.behavior.a03_chain.entity;

import com.mxdl.desigin.pattern.behavior.a03_chain.contract.Employee;

/**
 * Description: <MiddleLeader><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class MiddleLeader extends Employee {
    public MiddleLeader(Employee employee) {
        super(employee);
    }

    @Override
    public void request(int day) {
        if(day<7){
            System.out.println("中层领导批了");
        }else{
          mEmployee.request(day);
        }
    }
}
