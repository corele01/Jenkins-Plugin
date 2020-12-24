package com.jenkins;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.jenkins.ui.tooltab.JenkinsMain;
import org.jetbrains.annotations.NotNull;

/**
 * @author liujun
 */
public class JenkinsToolFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        JenkinsMain jenkinsMain = new JenkinsMain(project);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(jenkinsMain, "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
