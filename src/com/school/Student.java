package com.school;

/**
 * @Auther: szp
 * @Date: 2019/12/8 20:14
 * @Description: 沈泽鹏写点注释吧
 */
public class Student {
    private Integer id;
    private String studentName;
    private Integer age;
    private String learningClass;
    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLearningClass() {
        return learningClass;
    }

    public void setLearningClass(String learningClass) {
        this.learningClass = learningClass;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
