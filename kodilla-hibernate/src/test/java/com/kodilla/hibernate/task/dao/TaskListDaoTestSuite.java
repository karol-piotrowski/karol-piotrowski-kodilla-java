package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final  String LISTNAME = "Test List";
    private static final String DESCRIPTION = "Test: Hibernate excersises";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(LISTNAME);

        //Then
        Assert.assertEquals(1, readTaskLists.size());
        Assert.assertEquals(LISTNAME, readTaskLists.get(0).getListName());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.delete(id);

    }


}
