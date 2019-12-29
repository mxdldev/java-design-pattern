package com.mxdl.desigin.pattern.behavior.a05_iterator;

import com.mxdl.desigin.pattern.behavior.a05_iterator.entity.School;
import com.mxdl.desigin.pattern.behavior.a05_iterator.entity.Student;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student("张三",18);
        Student student1 = new Student("李四",20);
        Student student2 = new Student("王五",28);
        School school = new School();
        school.addStudent(student);
        school.addStudent(student1);
        school.addStudent(student2);
        while(school.isHave()){
            System.out.println(school.next().toString());
        }
    }
}
