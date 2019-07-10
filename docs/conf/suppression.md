# Suppression and fatal-error
Every tool has the possibility to suppress some of the findings.
Besides that some findings could be configured to terminate the build, e.g. when a nullptr-dereference is found in C-code.

## Global suppression and fatal-error

For this purpose you can configure global suppression or fatal-error.
In the subdirectory __recipes-sca-rules__ you can find __rules__-files for each tool.

E.g. when you want to configure the behavior of pylint for when invoked on an image, you need to modify (or overload in your own layer) the files from __sca-image-pylint__.

Each of these rule-recipe consists of two files

 * suppress - which adds suppressions
 * fatal - which adds fatal errors

### suppress file

In this file you can insert any error id which should suppressed in output for the given tool and SCA-mode.
Per line one error-id could be inserted

### fatal file

In this file you can insert any error id which terminate the build immediately.
Use this for e.g. regression.
Per line one error-id could be inserted.

## Local suppression and fatal-error

Beside the global settings you could use the __SCA\_\<TOOLNAME\>\_EXTRA_SUPPRESS__ and __SCA\_\<TOOLNAME\>\_EXTRA_FATAL__ variables in each recipe to control the behavior.
Both global and local settings are being merged into the effective settings.

## Example

The following error of the tool pylint are not of interest for you: 'warning1', 'someotherinfo', 'notofinteresterror'
So put into __recipes-sca-rules/sca-recipe-pylint-native/files/suppress__ and __recipes-sca-rules/sca-image-pylint-native/files/suppress__

```sh
pylint.pylint.warning1
pylint.pylint.someotherinfo
pylint.pylint.notofinteresterror
```

if you want furthermore suppress the pylint error 'someobscureinfo' for just the recipe 'foo'. Insert into foo.bb 
```bitbake
SCA_PYLINT_EXTRA_SUPPRESS += "pylint.pylint.someobscureinfo"
```