package com.glasgow.se.entity;

public class TeacherDTO {

  int teacherId;
  String name;
  private int workingExperiment;
  private int teachingAbilityScore;
  private int classAtmosphereScore;
  private int communicationScore;
  private int studentSatisfaction;

  public TeacherDTO() {
  }

  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
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
