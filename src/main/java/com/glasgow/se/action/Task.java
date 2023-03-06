package com.glasgow.se.action;

import com.glasgow.se.entity.Center;
import com.glasgow.se.entity.TeacherDTO;

public interface Task {


  void execute(Center center, TeacherDTO teacherDTO);
}
