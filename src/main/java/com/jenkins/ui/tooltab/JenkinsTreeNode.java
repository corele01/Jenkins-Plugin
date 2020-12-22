package com.jenkins.ui.tooltab;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author liujun
 */
public class JenkinsTreeNode extends DefaultMutableTreeNode {

    private String jobName;

    public JenkinsTreeNode(String jobName){
        super(jobName);

        this.jobName = jobName;
        JenkinsBuildTreeNode build = new JenkinsBuildTreeNode(jobName);
        add(build);
    }

    public String getJobName(){
        return jobName;
    }
}
