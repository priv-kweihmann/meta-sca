# Configuration examples for shell

## Environment

* Languages: shell
* Scope: recipes and their dependencies
* Active development
* Fast reaction time required
* Severe issues should abort the build, esp. new ones

## Recommended settings

### local.conf

```bitbake
INHERIT += "sca"
SCA_ENABLE = "1"
SCA_AUTO_INH_ON_IMAGE = "0"
SCA_AUTO_INH_ON_RECIPE = "1"
SCA_WARNING_LEVEL = "error"
SCA_VERBOSE_OUTPUT = "0"
SCA_SCOPE_FILTER = "security functional"
SCA_ENABLED_MODULES_RECIPE = "\
                            bashate \
                            checkbashism \
                            shellcheck \
                            "
```

### Jenkins pipeline

```groovy
def deployDir = "$WORKSPACE/tmp/deploy/images/**";
def pokyDir = "$WORKSPACE/meta-poky/poky";
def buildDir = "$WORKSPACE/meta-poky/poky/build";
def pokyTarget = "fancy-company-image"

pipeline {
    agent any
    stages {
        stage('checkout') {
            echo "!!!Checkout your code out from your repo!!!"
        }
        stage('poky setup') {
            sh """
                cd ${pokyDir}
                . ./oe-init-build-env
            """
            sd """
                cd ${buildDir}
                echo "!!!Insert your build command line here!!!"
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
