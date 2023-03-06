package com.glasgow.se.entity;



public class Teacher {

  private int id;
  private String name;
  private int workingExperiment;
  private int teachingAbilityScore;
  private int classAtmosphereScore;
  private int communicationScore;
  private int studentSatisfaction;

  public Teacher() {
  }

  public Teacher(int id, String name, int workingExperiment, int teachingAbilityScore,
      int classAtmosphereScore, int communicationScore, int studentSatisfaction) {
    this.id = id;
    this.name = name;
    this.workingExperiment = workingExperiment;
    this.teachingAbilityScore = teachingAbilityScore;
    this.classAtmosphereScore = classAtmosphereScore;
    this.communicationScore = communicationScore;
    this.studentSatisfaction = studentSatisfaction;
  }

  public Teacher(TeacherDTO teacherDTO) {
    this.name = teacherDTO.getName();
    this.workingExperiment = teacherDTO.getWorkingExperiment();
    this.teachingAbilityScore = teacherDTO.getTeachingAbilityScore();
    this.classAtmosphereScore = teacherDTO.getTeachingAbilityScore();
    this.communicationScore = teacherDTO.getCommunicationScore();
    this.studentSatisfaction = teacherDTO.getStudentSatisfaction();
  }


  @Override
  public String toString() {

    return String.format("%-6s", id) + String.format("%-22s", name) + String.format("%-19s",
        workingExperiment) + String.format("%-18s", teachingAbilityScore) + String.format("%-18s",
        classAtmosphereScore) + String.format("%-18s", communicationScore) + String.format("%-18s", studentSatisfaction);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWorkingExperiment() {
    return workingExperiment;
  }

  public void setWorkingExperiment(int workingExperiment) {
    this.workingExperiment = workingExperiment;
  }

  public int getTeachingAbilityScore() {
    return teachingAbilityScore;
  }

  public void setTeachingAbilityScore(int teachingAbilityScore) {
    this.teachingAbilityScore = teachingAbilityScore;
  }

  public int getClassAtmosphereScore() {
    return classAtmosphereScore;
  }

  public void setClassAtmosphereScore(int classAtmosphereScore) {
    this.classAtmosphereScore = classAtmosphereScore;
  }

  public int getCommunicationScore() {
    return communicationScore;
  }

  public void setCommunicationScore(int communicationScore) {
    this.communicationScore = communicationScore;
  }

  public int getStudentSatisfaction() {
    return studentSatisfaction;
  }

  public void setStudentSatisfaction(int studentSatisfaction) {
    this.studentSatisfaction = studentSatisfaction;
  }


}
