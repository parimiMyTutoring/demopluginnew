package com.pluginexample;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyCustomPlugin implements Plugin<Project> {
	@Override
	public void apply(Project project) {
		project.getTasks().create("myCustomTask", task -> {
			task.doLast(action -> {
				System.out.println("✅ My Custom Plugin Task Executing from remote!");
			});
		});
	}
}