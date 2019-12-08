package com.eq4;

import com.school.SchoolTeacherShip;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: szp
 * @Date: 2019/12/8 21:19
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo4 {

    public static void main(String[] args) {

        List<SchoolTeacherShip> list=new ArrayList<>();

        List<SchoolTeacherShip>  tempList=new ArrayList<>();

        //优化解法
        Set<SchoolTeacherShip> schoolTeacherShipsSet=new HashSet<>(list);


        //暴力破解
        for (SchoolTeacherShip schoolTeacherShip : list) {
            for (SchoolTeacherShip teacherShip : tempList) {
                Integer schoolId = schoolTeacherShip.getSchoolId();
                Integer schoolId1 = teacherShip.getSchoolId();

            }
        }
    }
}
