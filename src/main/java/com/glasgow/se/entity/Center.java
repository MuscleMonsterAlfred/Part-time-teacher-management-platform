package com.glasgow.se.entity;

import com.glasgow.se.fileHandler.RequirementReader;
import com.glasgow.se.fileHandler.TeacherListReader;

import java.io.IOException;
import java.util.ArrayList;

public class Center {
  CourseDirector courseDirector;
  Administrator administrator;
  ArrayList<Teacher> teacherList;
  Requirement requirement;
  public static String requirementFilePath;
  public static String teacherFilePath;
  public static String title;

  public Center() throws IOException {
    courseDirector = new CourseDirector();
    administrator = new Administrator();
    // path to requirement file
    requirementFilePath = "src/main/java/com.glasgow.se/conf/requirement.txt";
    // path to database file
    teacherFilePath = "src/main/java/com.glasgow.se/conf/teachers.txt";
    // load requirement
    requirement = RequirementReader.loadRequirement();
    // load teachers
    teacherList = TeacherListReader.loadTeacherList();
    title = "id    name            workExperiment    teachingAbility   classAtmosphere    communication   studentSatisfaction";
  }

  public CourseDirector getCourseDirector() {
    return courseDirector;
  }


  public Administrator getAdministrator() {
    return administrator;
  }

  public ArrayList<Teacher> getTeacherList() {
    return teacherList;
  }

  public void setTeacherList(ArrayList<Teacher> teacherList) {
    this.teacherList = teacherList;
  }

  public Requirement getRequirement() {
    return requirement;
  }

  public void setRequirement(Requirement requirement) {
    this.requirement = requirement;
  }
}
