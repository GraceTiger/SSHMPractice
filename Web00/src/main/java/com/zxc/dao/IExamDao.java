package com.zxc.dao;

import com.zxc.model.Exam;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IExamDao {
    @Select("SELECT\n" +
            "\t学号,姓名,班级名称,\n" +
            "\tSUM(总成绩*学分) 汇总\n" +
            "FROM\n" +
            "\t计算机 \n" +
            "WHERE\n" +
            "\t课程名称 IN ( '毛泽东思想和中国特色社会主义理论体系概论', '操作系统', '面向对象分析与设计', '移动WEB应用', '软件工程新技术概论', 'JavaEE应用开发', 'PHP', '数据库开发实践', '软件测试技术基础' ) \n" +
            "GROUP BY\n" +
            "\t学号,姓名,班级名称 \n" +
            "ORDER BY\n" +
            "\tSUM(\n" +
            "\t总成绩*学分) DESC;")
    List<Exam> selectExam();
}
