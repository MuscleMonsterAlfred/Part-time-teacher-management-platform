package com.glasgow.se.utils;

import com.glasgow.se.basic.Center;
import com.glasgow.se.basic.Requirement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RequirementWriter {

  public static void writeRequirement(Requirement requirement) throws IOException {
    String requirementPath = Center.requirementFilePath;
    String output =
        "workingExperience: " + requirement.getWorkingExperience() + "\nteachingAbilityScore: "
            + requirement.getTeachingAbilityScore() + "\nclassAtmosphereScore: "
            + requirement.getClassAtmosphereScore() + "\ncommunicationScore: "
            + requirement.getCommunicationScore() + "\nstudentSatisfaction: "
            + requirement.getStudentSatisfaction();

    File file = new File(requirementPath);
    FileWriter fw = new FileWriter(file,false);
    fw.write(output);
    fw.close();
  }


}
