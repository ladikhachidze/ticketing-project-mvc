package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.TaskDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Status;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO, Long>{

List<TaskDTO> finTaskByManager(UserDTO manager);

   List<TaskDTO> findAllTasksByStatusIsNot(Status status);

  List<TaskDTO> findAllTasksByStatus(Status status);

    void updateStatus(TaskDTO task);

}
