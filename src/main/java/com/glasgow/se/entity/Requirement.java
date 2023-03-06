package com.glasgow.se.entity;

public class Requirement {
  private int workingExperience;
  private int teachingAbilityScore;
  private int classAtmosphereScore;
  private int communicationScore;
  private int studentSatisfaction;

  public Requirement() {
  }

  public Requirement(int workingExperience, int teachingAbilityScore, int classAtmosphereScore,
      int communicationScore, int studentSatisfaction) {
    this.workingExperience = workingExperience;
    this.teachingAbilityScore = teachingAbilityScore;
    this.classAtmosphereScore = classAtmosphereScore;
    this.communicationScore = communicationScore;
    this.studentSatisfaction = studentSatisfaction;
  }

  @Override
  public String toString() {
    return
        "minimum working experience: " + workingExperience +
        "\nminimum teaching ability score: " + teachingAbilityScore +
        "\nminimum class atmosphere score: " + classAtmosphereScore +
        "\nminimum communication score: " + communicationScore +
        "\nminimum student satisfaction: " + studentSatisfaction;
  }

  public int getWorkingExperience() {
    return workingExperience;
  }

  public void setWorkingExperience(int workingExperience) {
    this.workingExperience = workingExperience;
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
