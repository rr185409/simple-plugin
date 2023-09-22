package com.ncr.plugins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class SimpleOperationsTask extends DefaultTask {
	Logger logger = LoggerFactory.getLogger(SimpleOperationsTask.class);
	public SimpleOperationsTask() {
		dependsOn(getProject().getTasks().getByName("build"));
	}
	@TaskAction
	public void getProjectName() {

		logger.info("Project Name: " + getProject().getName());

	}

}
