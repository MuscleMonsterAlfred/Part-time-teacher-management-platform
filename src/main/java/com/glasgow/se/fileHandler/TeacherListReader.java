package com.glasgow.se.fileHandler;

import com.glasgow.se.entity.Center;
import com.glasgow.se.entity.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TeacherListReader {

  public static ArrayList<Teacher> loadTeacherList() throws IOException {
    ArrayList<Teacher> teacherList = new ArrayList<>();
    String path = Center.teacherFilePath;
    File file = new File(path);
    InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
    BufferedReader br = new BufferedReader(reader);
    String line = "";
    int i = 0;
    while ((line = br.readLine()) != null) {
      if (i!=0){
        String[] split = line.trim().split("\\s+");
        Teacher teacher = new Teacher(Integer.parseInt(split[0]), split[1],
            Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]),
            Integer.parseInt(split[5]), Integer.parseInt(split[6]));
        teacherList.add(teacher);
      }
      i++;
    }
    reader.close();
    br.close();

    return teacherList;
  }

}
