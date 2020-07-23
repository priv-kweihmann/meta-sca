# Case study: regression on existing code

## Environment

Existing code from a custom layer is build upon standard poky layer.
In the past several (sometimes severe) issues occurred to be noticed at manual regression testing of a release.

The code is of high to medium quality and consists of C/C++, shell and a little python code - there are some known issues (in the sense of SCA findings), which haven't been fixed, as they deal with rare corner cases or do not have any priority to be fixed.

The quality of packages that originate from standard poky-layer aren't of any importance, as release documentation from YOCTO project is enough to cover QA needs.

All custom code is based in a layer called __meta-fancycompany__

## Objectives

* Don't create a release build if known and severe issues in code have been found
* Track the overall issue count to always at least remain on the same level of code quality
* Only code from the own layer is to be checked
* Code quality checks should not consume too much time
* the same code should be used in other CI jobs, so hard coded values are not permitted

## What's needed

* Jenkins
* [Warning Next Generation Plugin](https://plugins.jenkins.io/warnings-ng)
* [meta-buildutils layer](https://github.com/priv-kweihmann/meta-buildutils)
* [meta-sca layer](https://github.com/priv-kweihmann/meta-sca)

## Setup

### Catching only the recipes from the own layer

This is where [autoinherit.bbclass](https://github.com/priv-kweihmann/meta-buildutils/blob/master/classes/auto-inherit.bbclass) comes into play. This utility class inherits other bbclass-files based on configurable conditions.

So first of all include the [autoinherit.bbclass](https://github.com/priv-kweihmann/meta-buildutils/blob/master/classes/auto-inherit.bbclass), by adding

```bitbake
INHERIT += "auto-inherit"
```

to __conf/local.conf__.
Now we need to configure the class. According to [documentation](https://github.com/priv-kweihmann/meta-buildutils/blob/master/README.md#auto-inherit) we can inherit a class which is located under a specific path. So with this in mind just add

```bitbake
AUTO_INHERIT_CONF = "BBClass=sca;props=[auto_inherit_is_at_path(d,'meta-fancycompany/',False)]"
```

to __conf/local.conf__. This should inherit **sca.bbclass** into all recipes (.bb-files) found under __meta-fancycompany__ but not into any .bbappend-files found under the same path.

### Configure SCA

As we know we need to check on C/C++, shell and python. Speed is favoured over quality, as long a quality isn't very poor. Only severe issues are of importance.
For this purpose we use the configure wizard from meta-sca-layer.
Run

```sh
## run <root of meta-sca>/scripts/configure <root of meta-sca> e.g.
/mnt/workingdisk/meta-sca/scripts/configure /mnt/workingdisk/meta-sca/
```

Answer the following questions

```shell
* Do you want to check images? -> YES
* Do you want to check recipes? -> YES
* Enter a license filter -> .*
* Do you have online access while building? -> False
* What content to you want to check? -> C, CPP, Shell, Python (end with 'q')
* What scope of checks would like to perform? -> Functional
* How fast should the tools be build? -> 3
* How fast should the tools be executed? -> 7
* What quality do you expect of the tools? -> 6
* Do you want to use best-of functionality -> NO
* Do you want to use image summary functionality? -> NO
* Do you want export the findings to Jenkins? -> YES
* From which priority on the findings should be reported? -> error
```

This outputs the following at the end

```bitbake
SCA_AUTO_INH_ON_IMAGE = "1"
SCA_AUTO_INH_ON_RECIPE = "1"
SCA_AUTO_LICENSE_FILTER = ".*"
SCA_AVAILABLE_MODULES = "bashate checkbashism cppcheck flake8 gcc pylint shellcheck"
SCA_ENABLE_BESTOF = "0"
SCA_ENABLE_IMAGE_SUMMARY = "0"
SCA_EXPORT_FINDING_SRC = "1"
SCA_WARNING_LEVEL = "error"
```

So we put this block into __conf/local.conf__ as well

### Integration into jenkins

To the existing pipeline we need to add the import of the SCA result files by adding [Warning Next Generation Plugin](https://plugins.jenkins.io/warnings-ng) call into **post** block

```groovy
def deployDir = "$WORKSPACE/tmp/deploy/images/**";

post {
    always {
        recordIssues qualityGates: [[threshold: 1, type: 'NEW_ERROR', unstable: false]], tools: [checkStyle(pattern: '$deployDir/sca/*/checkstyle/*.xml')]
    }
}
```

This also sets a "quality-gate" that the error count should stay the same or decrease for the build to be successful - This helps to "ignore" the existing issues in the code for now, but takes hard action for new issues.

### Fine tune

### Disable further things that we don't need in this context

For instance "gcc-hardening" option isn't of interest in this context so we disable it by putting

```bitbake
SCA_GCC_HARDENING = "0"
```

into __conf/local.conf__

### Ignore not so severe issues

Now it's time to reconfigure the severity of findings that the tools think are important, but they aren't in your context. Maybe here a first test build helps.
In the result of the build just scroll through the findings and pick the value of __Type__ and put into a list in format __\<Category\>.\<Category\>.\<Type\>__ e.g. pylint.pylint.function-redefined

Now put all thing found into a format [like described here](../conf/sevtransform.md) -  and finally assign it to __SCA_SEVERITY_TRANSFORM__ e.g. like this

```bitbake
SCA_SEVERITY_TRANSFORM = "pylint.pylint.function-redefined=warning cppcheck.cppcheck.uninitvar=warning"
```

Put this into __conf/local.conf__ as well.

## Full pipeline

```groovy
def deployDir = "$WORKSPACE/tmp/deploy/images/**";
def pokyDir = "$WORKSPACE/meta-poky/poky";
def buildDir = "$WORKSPACE/meta-poky/poky/build";
def pokyTarget = "fancy-company-image"

pipeline {
    agent any
    stages {
        stage('checkout') {
            echo "Check your code out from your repo "
            echo "Don't forget to check out meta-buildutils and meta-sca as well"
        }
        stage('poky setup') {
            echo "If you haven't done it - insert paths of meta-sca and meta-buildutils into bblayer.conf"
            sh """
                cd ${pokyDir}
                . ./oe-init-build-env
            """
            sd """
                cd ${buildDir}
                echo 'INHERIT += \\"autoinherit.bbclass\\"' >> conf/local.conf
                echo 'AUTO_INHERIT_CONF = \\"BBClass=sca;props=[auto_inherit_is_at_path(d,\\'meta-fancycompany/\\',False)]\\"' >> conf/local.conf
                echo 'SCA_AUTO_INH_ON_IMAGE = \\"1\\"' >> conf/local.conf
                echo 'SCA_AUTO_LICENSE_FILTER = \\".*\\"' >> conf/local.conf
                echo 'SCA_AVAILABLE_MODULES = \\"bashate checkbashism cppcheck flake8 gcc pylint shellcheck\\"' >> conf/local.conf
                echo 'SCA_ENABLE_BESTOF = \\"0\\"' >> conf/local.conf
                echo 'SCA_ENABLE_IMAGE_SUMMARY = \\"0\\"' >> conf/local.conf
                echo 'SCA_EXPORT_FINDING_SRC = \\"1\\"' >> conf/local.conf
                echo 'SCA_WARNING_LEVEL = \\"error\\"' >> conf/local.conf
                echo 'SCA_GCC_HARDENING = \\"0\\"' >> conf/local.conf
                echo 'SCA_SEVERITY_TRANSFORM = \\"pylint.pylint.function-redefined=warning cppcheck.cppcheck.uninitvar=warning\\"' >> conf/local.conf
            """
        }
        stage('build') {
            steps {
                sh """
                cd ${pokyDir}
                . ./oe-init-build-env
                bitbake ${pokyTarget}
                """
            }
        }
    }
    post {
       always {
            recordIssues qualityGates: [[threshold: 1, type: 'NEW_ERROR', unstable: false]], tools: [checkStyle(pattern: '$deployDir/sca/*/checkstyle/*.xml')]
       }
    }
}
```

## Further things to be done (if needed)

* Insert a appropriate mail notification, maybe using the great [email ext extension](https://wiki.jenkins.io/display/JENKINS/Email-ext+plugin) of jenkins
* Take actions to archive the build if it was successful
* maybe cleanup the workspace of the build, else you will need plenty of disk space on your jenkins node
