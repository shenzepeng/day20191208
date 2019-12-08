package com.school;

/**
 * @Auther: szp
 * @Date: 2019/12/8 20:23
 * @Description: 沈泽鹏写点注释吧
 */
public class Subject {
    private Integer id;
    private String subjectName;
    private String teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
