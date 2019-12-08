package com.eq4;

import com.school.SchoolTeacherShip;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/8 21:09
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo1 {
    public static void main(String[] args) {
        List<SchoolTeacherShip> list=new ArrayList<>();
        //命令式编程

        for (int i = 0; i < list.size()+1; i++) {
            SchoolTeacherShip schoolTeacherShip = list.get(i);
            System.out.println(schoolTeacherShip);
        }

        for (SchoolTeacherShip schoolTeacherShip : list) {

        }

        //函数式编程
        list.forEach((t)-> System.out.println(t));

    }
}
