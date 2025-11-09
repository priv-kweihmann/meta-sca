# Configuration examples for complete image monitoring

## Environment

* Languages: *
* Scope: final image + all used recipes
* New errors should abort the build
* If there are more than 5 new warnings -> terminate the build
* Only components that are actually shipped should be monitored

## Recommended settings

### local.conf

```bitbake
INHERIT += "sca"
SCA_ENABLE = "1"
SCA_AUTO_INH_ON_IMAGE = "1"
SCA_AUTO_INH_ON_RECIPE = "1"
SCA_WARNING_LEVEL = "warning"
SCA_VERBOSE_OUTPUT = "0"
SCA_SCOPE_FILTER = "security functional"
SCA_ENABLED_MODULES_IMAGE = "\
                            bandit \
                            bashate \
                            bitbake \
                            checkbashism \
                            detectsecrets \
                            flake8 \
                            jsonlint \
                            mypy \
                            pylint \
                            shellcheck \
                            systemdlint \
                            vulture \
                            xmllint \
                            yamllint \
                            "
SCA_ENABLED_MODULES_RECIPE = "\
                            bandit \
                            bashate \
                            bitbake \
                            checkbashism \
                            cppcheck \
                            cpplint \
                            cvecheck \
                            darglint \
                            dennis \
                            detectsecrets \
                            flake8 \
                            flint \
                            gcc \
                            golint \
                            jsonlint \
                            kconfighard \
                            mypy \
                            pylint \
                            rats \
                            revive \
                            shellcheck \
                            sparse \
                            tscancode \
                            vulture \
                            xmllint \
                            yamllint \
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
                bitbake ${openembeddedcoreTarget}
                """
            }
        }
    }
    post {
       always {
            recordIssues qualityGates: [
                [threshold: 1, type: 'NEW_ERROR', unstable: false],
                [threshold: 5, type: 'NEW_HIGH', unstable: false]
            ], tools: [checkStyle(pattern: '$deployDir/sca/checkstyle/*.xml')]
       }
    }
}
```
