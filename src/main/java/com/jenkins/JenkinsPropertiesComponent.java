package com.jenkins;

import com.intellij.ide.util.PropertiesComponent;
import org.apache.commons.lang3.StringUtils;

/**
 * @author liujun
 */
public class JenkinsPropertiesComponent {

    public static final String JENKINS_HOST = "jenkins.host";
    public static final String JENKINS_PASSWORD = "jenkins.pwd";
    public static final String JENKINS_USERNAME = "jenkins.username";

    public static String getHost(){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        String value = propertiesComponent.getValue(JENKINS_HOST);
        if (StringUtils.isEmpty(value)){
            return "http://jenkins.example.com";
        }
        return value;
    }

    public static String getUser(){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        String value = propertiesComponent.getValue(JENKINS_USERNAME);
        if (StringUtils.isEmpty(value)){
            return "";
        }
        return value;
    }

    public static String getPwd(){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        String value = propertiesComponent.getValue(JENKINS_PASSWORD);
        if (StringUtils.isEmpty(value)){
            return "";
        }
        return value;
    }

    public static void setHost(String host){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        propertiesComponent.setValue(JENKINS_HOST,host);
    }

    public static void setUser(String user){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        propertiesComponent.setValue(JENKINS_USERNAME,user);
    }

    public static void setPwd(String pwd){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        propertiesComponent.setValue(JENKINS_PASSWORD,pwd);
    }

    public static int isInit(){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        String value = propertiesComponent.getValue("jenkins.init");
        if (StringUtils.isEmpty(value)){
            return 0;
        }
        return 1;
    }

    public static void setInit(){
        PropertiesComponent propertiesComponent = PropertiesComponent.getInstance();
        propertiesComponent.setValue("jenkins.init","1");
    }
}
