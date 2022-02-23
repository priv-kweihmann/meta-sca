# Setting up a parametrized build for SCA

To setup a jenkins build with parameters you can adopt the following pipeline to your needs.
With this pipeline you can switch on/off SCA feature within jenkins.

## Full Example

```groovy
pipeline {
    agent any
    parameters {
        choice(name: 'SCA_ENABLE', choices: ['0', '1'], description: 'Enable SCA', defaultValue: '1')
    }
    stages {
        stage('Build') {
            steps {
                sh """
                    export BB_ENV_PASSTHROUGH_ADDITIONS="$BB_ENV_PASSTHROUGH_ADDITIONS SCA_ENABLE"
                    . ./oe-init-build-env
                    SCA_ENABLE=${params.SCA_ENABLE} bitbake core-image-minimal
                """
            }
        }
    }
}
```
