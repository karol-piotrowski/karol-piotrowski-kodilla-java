package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean taskExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.taskExecuted = false;
    }

    @Override
    public String executeTask() {
        String s = "Executing driving task " + taskName + " - Drive to " + where + " using " + using + ".";
        System.out.println(s);
        taskExecuted = true;
        return s;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
