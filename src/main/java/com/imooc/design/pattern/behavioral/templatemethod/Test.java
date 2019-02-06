package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * 模版方法模式
 * @author youyusong
 * @date 2019/2/6
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end---");

    }

}
