package com.school;

/**
 * @Auther: szp
 * @Date: 2019/12/8 20:12
 * @Description: 沈泽鹏写点注释吧
 */
public class Teacher {
    private Integer id;
    private String teacherName;
    private String teacherSex;
    private Integer teacherAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }
}
