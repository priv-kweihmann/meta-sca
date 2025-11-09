# Configuration examples for software integration stage

## Environment

* Languages: *
* Scope: recipes and final image(s)
* No regression of set policies
* Ensure packages are consistent and self-containing
* License compliance
* No regression of maintainability of layers/recipes
* Code quality of the individual components is secondary

## Recommended settings

**NOTE** recommended setup, requires *meta-openembedded* and *meta-rubygems* to be part of your setup

### local.conf

```bitbake
INHERIT += "sca"
SCA_ENABLE = "1"
SCA_AUTO_INH_ON_IMAGE = "1"
SCA_AUTO_INH_ON_RECIPE = "1"
SCA_WARNING_LEVEL = "warning"
SCA_VERBOSE_OUTPUT = "0"
SCA_BACKTRACK = "1"
SCA_ENABLED_MODULES_IMAGE ?= "\
                            bitbake \
                            oelint \
                            pkgqaenc \
                            scancode \
                            shellcheck \
                            systemdlint \
                            "
```

### Jenkins pipeline

```groovy
def deployDir = "$WORKSPACE/tmp/deploy/images/**";
def openembeddedcoreDir = "$WORKSPACE/meta-openembedded-core/openembedded-core";
def buildDir = "$WORKSPACE/meta-openembedded-core/openembedded-core/build";
def openembeddedcoreTarget = "fancy-company-image"

pipeline {
    agent any
    stages {
        stage('checkout') {
            echo "!!!Checkout your code out from your repo!!!"
        }
        stage('openembedded-core setup') {
            sh """
                cd ${openembeddedcoreDir}
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
                cd ${openembeddedcoreDir}
                . ./oe-init-build-env
                bitbake ${openembedded-coreTarget}
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
