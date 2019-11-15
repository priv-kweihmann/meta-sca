# Basic integration of SCA into jenkins

This document describes the integration of SCA into jenkins

## Prerequisites

* Jenkins
* [Warning Next Generation Plugin](https://plugins.jenkins.io/warnings-ng)

## Using pipeline

In a pipeline simply insert the following

```groovy
post {
    always {
        recordIssues aggregatingResults: true, tools: [checkStyle pattern: "**/checkstyle/*.xml")]
    }
}
```

to reduce the lookup time for files you could also do

```groovy
def deployDir = "$WORKSPACE/tmp/deploy/images/**";

post {
    always {
        recordIssues aggregatingResults: true, tools: [checkStyle pattern: "$deployDir/sca/checkstyle/*.xml")]
    }
}
```

## Results

At the project view in jenkins a run would look like this

![project view](img/jenkins_pipeline_project.jpg)

At the particular build it would look like this

![build view](img/jenkins_pipeline_build.jpg)

If you now click on 'CheckStyle Warnings' the following is shown

![details_1](img/jenkins_pipeline_build_details.jpg)

If you now click on the tab 'Categories' you will see all the results from your enabled tools, with their findings

![details_2](img/jenkins_pipeline_build_details_2.jpg)

Now you can browse through the findings (and expand the section)
to view the notice given by the particular tool

![details_3](img/jenkins_pipeline_build_details_3.jpg)

## Full example of pipeline

```groovy
/* Alter this path if needed */
def deployDir = "$WORKSPACE/tmp/deploy/images/**";

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Replace this by the build command you are using!"
            }
        }
    }
    post {
       always {
            recordIssues aggregatingResults: true, tools: [checkStyle(pattern: "$deployDir/sca/checkstyle/*.xml")]
       }
    }
}
```
