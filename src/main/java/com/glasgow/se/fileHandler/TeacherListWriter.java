package com.glasgow.se.fileHandler;

import com.glasgow.se.entity.Center;
import com.glasgow.se.entity.Teacher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TeacherListWriter {

  public static void writeTeacherList(ArrayList<Teacher> teacherList) throws IOException {
    String path = Center.teacherFilePath;
    File file = new File(path);
    FileWriter fw = new FileWriter(file,false);
    String output = listToString(teacherList);
    fw.write(output);
    fw.close();
  }

  private static String listToString(ArrayList<Teacher> teacherList) {
    String out = Center.title + "\n";
    for (Teacher teacher : teacherList) {
      out += teacher.toString() + "\n";
    }
    return out;
  }

}
