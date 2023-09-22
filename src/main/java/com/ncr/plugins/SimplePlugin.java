/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ncr.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SimplePlugin implements Plugin<Project> {


	@Override
	public void apply(Project project) {
		System.out.println("apply");
		project.getTasks().register("projectName", SimpleOperationsTask.class);
	}

}
