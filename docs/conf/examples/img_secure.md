# Configuration examples for image polishing

## Environment

* Languages: *
* Scope: final image
* Should be a secure and hardened as possible
* New severe issues should abort the build
* Component hardening is not part of the plan

## Recommended settings

### local.conf

```bitbake
INHERIT += "sca"
SCA_ENABLE = "1"
SCA_AUTO_INH_ON_IMAGE = "1"
SCA_AUTO_INH_ON_RECIPE = "0"
SCA_WARNING_LEVEL = "error"
SCA_ENABLE_IMAGE_SUMMARY = "0"
SCA_ENABLE_BESTOF = "0"
SCA_VERBOSE_OUTPUT = "0"
SCA_SCOPE_FILTER = "security"
SCA_ENABLED_MODULES_IMAGE ?= "\
                            ansible \
                            bandit \
                            bitbake \
                            detectsecrets \
                            jsonlint \
                            lynis \
                            pyfindinjection \
                            pylint \
                            shellcheck \
                            standard \
                            systemdlint \
                            tiger \
                            upc \
                            xmllint \
                            yamllint \
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
