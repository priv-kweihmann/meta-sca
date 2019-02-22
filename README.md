# meta-sca

## Purpose
This layer does offer some static code analysis tools, which can be easily configured and integrated into YOCTO/Open-Embedded build system.
The layer is designed to be easily (and fully configurable).
All results are stored to __SCA_EXPORT_DIR__ (which defaults to __${DEPLOY_DIR_IMAGE}/sca__). The results will be stored in the raw-format of the corresponding tool and in checkstyle-format.
Any result-file can be easily integrated into e.g. Jenkins or other CI-tools

## Prerequisites
You need the current standard __poky__-layer installed onto your local build environment

## Installation
In your __bblayers.conf__-file add the following line 
``` shell
BBLAYERS += "<full path to sca-layer>/meta-sca"
```

## Available tools

The layer can check on a recipe-level or on an image-level.
On image-level the whole root-filesystem could be taken into account, which in most cases can't be granted on a recipe-level.
On the other hand some static code analysis does not make any sense on an image-level - so this layer does have different tools for both level available

### Tools for image recipes

 * pylint (python)
 * shellcheck (shell)
 * eslint (javascript/html)

### Tools for all other recipes

 * pylint (python)
 * shellcheck (shell)
 * gcc (getting compiler warnings/errors)
 * cpplint (c/c++)
 * cppcheck (c/c++)
 * eslint (javascript/html)
 * cve-check (check for unpatched cve's)

each tool does have it's own benefits and flaws so don't be mad if you have 10k+ findings on the initial run.

# Configuration

There are several ways to integrate static code analysis into your code base.

## Use on all recipes in your workspace

Edit the file conf/__local.conf__ and add the following line
```shell
INHERIT += "sca"
```
this will run static code analysis on __all__ the recipes available and used in your workspace.
It might be a good idea to do this if you like to wait of a very long time on your build - maybe nightly builds or similar

## Use on particular recipes in your workspace

Edit the recipe-file by adding the following line
```bitbake
inherit sca
```
Now the power of static code analysis will be applied to exactly this image

## Available configuration variables

The behavior of the analysis can be controlled by several __bitbake__-variables

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:|
| SCA_ENABLE  | Does globally enable the analysis | string | "1"
| SCA_AUTO_INH_ON_IMAGE | Do automatically enable analysis on image-recipes | string | "1"
| SCA_AUTO_INH_ON_RECIPE | Do automatically enable analysis on other recipes | string | "1"
| SCA_EXPORT_DIR | Directory where to store the results of analysis | path | \${DEPLOY_DIR_IMAGE}/sca
| SCA_EXPORT_FINDING_SRC | Do copy the source-files of any finding to deploy-dir. This proved to helpful when integrating into Jenkins. | string | "1"
| SCA_EXPORT_FINDING_DIR | The folder where to store the original source-files of findings | path | \${DEPLOY_DIR_IMAGE}/sca/sources/\${PN}/
| SCA_ENABLED_MODULES | The analysis modules to be activated | space-separated-string | "eslint shellcheck pylint" for images, "eslint gcc cpplint cppcheck pylint shellcheck cve-check" for other recipe 
| SCA_SOURCES_DIR | Path where to find the source-files to be checked | path | "\${B}" for recipes, "\${IMAGE_ROOTFS}" for images
| SCA_WARNING_LEVEL | Filter for severity of findings | string: info, warning or error | "warning"
| SCA_AUTO_LICENSE_FILTER | Filter according to recipe license if sca should invoked | license-string | "CLOSED"

### Available configuration for cpplint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_CPPLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CPPLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CPPLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"

### Available configuration for cppcheck
For further explanations on the variables see the manpage of cppcheck

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_CPPCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CPPCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CPPCHECK_ADD_INCLUDES | Additional paths leading to includes | space-separated-list | ""
| SCA_CPPCHECK_LANG_STD | C standard to check on | space separated list | "c99"

### Available configuration for gcc
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_GCC_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_GCC_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""

### Available configuration for pylint (recipe)
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${B}
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${STAGING_LIBDIR}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${STAGING_LIBDIR}/python.3.5/:\${STAGING_LIBDIR}/python.3.5/site-packages/

### Available configuration for pylint (image)
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${IMAGE_ROOTFS}
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${IMAGE_ROOTFS}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${IMAGE_ROOTFS}/python.3.5/:\${IMAGE_ROOTFS}/python.3.5/site-packages/

### Available configuration for shellcheck
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_SHELLCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_SHELLCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":

### Available configuration for eslint
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_ESLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_ESLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_ESLINT_CONFIG_FILE | Configuration-file to be used. See recipe eslint-native for details | string: eslint-standard.json, eslint-plain.json, eslint-airbnb.json, eslint-google.json | eslint-plain.json

### Available configuration for cve-check
n.a. this module does not need configuration, nor does it support suppression or fatal error handling

## Suppression and fatal-error
Every tool has the possibility to suppress some of the findings.
Besides that some findings could be configured to terminate the build, e.g. when a nullptr-dereference is found in C-code.

For this purpose you can configure global suppression or fatal-error.
In the subdirectory __recipes-sca-rules__ you can find __rules__-files for each tool.

E.g. when you want to configure the behavior of pylint for when invoked on an image, you need to modify (or overload in your own layer) the files from __sca-image-pylint__.

Each of these rule-recipe consists of two files

 * suppress - which adds suppressions
 * fatal - which adds fatal errors

In these files every entry must be on a single line.
The format of the entry is defined by the analysis-tool itself.
(a wiki entry will follow soon)

Also you could use the __SCA_\<TOOLNAME\>_EXTRA_SUPPRESS__ and __SCA_\<TOOLNAME\>_EXTRA_FATAL__ variables in each recipe to control the behavior. 

## Results

Depending on how you configured the variable __SCA_EXPORT_DIR__ (default \${DEPLOY_DIR_IMAGE}/sca) you will find several files and folders.

- sca
  - cppcheck
    - checkstyle
    - raw
  - cpplint
    - checkstyle
    - raw
  - pylint
    - checkstyle
    - raw

a.s.o.

In each checkstyle-subfolder you will find a XML-document named __\${PN}_\${PV}.xml__ e.g. for recipe acl this would be acl_1.2.3.xml.
This document contains all findings in checkstyle-format.

In each raw-subfolder you will find the raw output of the tool, without any further processing done to it. The format depends on the tool.

## Source-File

If you enabled the bitbake-variable __SCA_EXPORT_FINDING_SRC__ (set it to "1") all source-files from the findings will be copied to structure like this

- sca
  - sources
    - \${PN}
      - \<items>

Also the corresponding path in each checkstyle-XML-document will be adjusted to point to the file copy.
With this help e.g. Jenkins will be capable of giving you inline snippets to the findings.

If you don't need this feature you should leave it disabled.

## Further development

Feel free to create pull-requests or create an issue if you think there is something wrong or missing.
