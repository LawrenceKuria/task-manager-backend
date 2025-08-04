package com.lawrence.task_manager.services;

import com.lawrence.task_manager.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTasklists();
    TaskList createTaskList(TaskList taskList);
}
