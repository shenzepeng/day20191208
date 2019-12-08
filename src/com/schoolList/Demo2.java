package com.schoolList;

import com.school.Subject;
import com.school.SubjectShip;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/8 20:47
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo2 {
    public static void main(String[] args) {
        List<SubjectShip>  list=new ArrayList<>();

        SubjectShip subjectShip1=new SubjectShip();
        subjectShip1.setId(1);
        subjectShip1.setStudentId(1);
        subjectShip1.setTeacherId(1);
        subjectShip1.setSubjectId(1);

        list.add(subjectShip1);
    }
}
