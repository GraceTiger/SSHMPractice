package com.zxc.model;

public class Exam {
    private String 学号;
    private String 姓名;
    private String 班级名称;
    private double 汇总;

    public String get学号() {
        return 学号;
    }

    public void set学号(String 学号) {
        this.学号 = 学号;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public String get班级名称() {
        return 班级名称;
    }

    public void set班级名称(String 班级名称) {
        this.班级名称 = 班级名称;
    }

    public double get汇总() {
        return 汇总;
    }

    public void set汇总(double 汇总) {
        this.汇总 = 汇总;
    }

    @Override
    public String toString() {
        return "exam{" +
                "学号='" + 学号 + '\'' +
                ", 姓名='" + 姓名 + '\'' +
                ", 班级名称='" + 班级名称 + '\'' +
                ", 汇总=" + 汇总 +
                '}';
    }
}
