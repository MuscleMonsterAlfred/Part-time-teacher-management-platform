package com.glasgow.se.event;

import com.glasgow.se.basic.Center;
import com.glasgow.se.basic.TeacherDTO;

public interface Task {


  void execute(Center center, TeacherDTO teacherDTO);
}
