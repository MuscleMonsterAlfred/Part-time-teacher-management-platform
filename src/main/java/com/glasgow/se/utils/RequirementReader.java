package com.glasgow.se.utils;

import com.glasgow.se.basic.Center;
import com.glasgow.se.basic.Requirement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RequirementReader {

  public static Requirement loadRequirement() throws IOException {
    ArrayList<Integer> list = new ArrayList<>();
    String path = Center.requirementFilePath;
    File file = new File(path);
    InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
    BufferedReader br = new BufferedReader(reader);
    String line = "";
    while ((line = br.readLine()) != null) {
      String[] split = line.trim().split(": ");
      list.add(Integer.valueOf(split[1]));
    }

    reader.close();
    br.close();
    return new Requirement(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
  }

}
