package com.glasgow.se;


import com.glasgow.se.basic.Administrator;
import com.glasgow.se.basic.Center;
import com.glasgow.se.basic.CourseDirector;
import com.glasgow.se.utils.RequirementWriter;
import com.glasgow.se.utils.TeacherListWriter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("兼职教师管理平台......");
        Center center = new Center();
        CourseDirector courseDirector = center.getCourseDirector();
        Administrator administrator = center.getAdministrator();

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nPlease choose your character:\n1.Course director  \n2.Administrator  \n3.Quit");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    courseDirector.generateRequirement(scanner, center);
                    break;
                case 2:
                    administrator.manageDatabase(scanner, center);
                    break;
                case 3:
                    flag = false;
            }
            RequirementWriter.writeRequirement(center.getRequirement());
            TeacherListWriter.writeTeacherList(center.getTeacherList());
        }

        scanner.close();
    }
}