package com.schoolList;

import com.school.School;
import com.school.SchoolTeacherShip;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/8 20:27
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo1 {
    public static void main(String[] args) {
        /**
         * 新建老师和学生关系表
         */
        List<SchoolTeacherShip> schoolTeacherShipList=new ArrayList<>();
        /**
         * 取出第一条记录
         */
        SchoolTeacherShip schoolTeacherShip = schoolTeacherShipList.get(0);
        
        Integer schoolId = schoolTeacherShip.getSchoolId();



    }
}
