package com.eq3;

/**
 * @Auther: szp
 * @Date: 2019/12/8 20:59
 * @Description: 沈泽鹏写点注释吧
 */
public class Person extends Animal {
    public static void main(String[] args) {
        Person person=new Person();
        //所有动物不能游泳，所以人不能游泳
        //因为人的祖先没长翅膀，人继承与祖先，所以人不能长翅膀（在没变异的情况下）
        System.out.println(person.getCanSwim());
    }
}
