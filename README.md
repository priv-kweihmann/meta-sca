# meta-sca

## Purpose
This layer does offer some static code analysis tools, which can be easily configured and integrated into YOCTO/Open-Embedded build system.
The layer is designed to be easy to integrate (and fully configurable).
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
On the other hand some static code analysis does not make any sense on an image-level - so this layer does have different tools for both level available. In square brackets the corresponding setting in this layer is given

### Tools for image recipes

 * bandit (python/security) [bandit]
 * bitbake (handle bitbake issues) [bitbake]
 * eslint (javascript/html) [eslint]
 * image-summary (aggregate all findings for package in an image) [image-summary]
 * json-parser (json) [jsonlint]
 * oelint-adv (linting bitbake recipes) [oelint]
 * pylint (python) [pylint]
 * shellcheck (shell) [shellcheck]
 * xmlint (xml) [xmllint]

### Tools for all other recipes

 * bandit (python/security) [bandit]
 * bitbake (handle bitbake issues) [bitbake]
 * clang-tidy (c/c++) [clang]
 * cppcheck (c/c++) [cppcheck]
 * cpplint (c/c++) [cpplint]
 * cve-check (check for unpatched cve's) [cve-check]
 * eslint (javascript/html) [eslint]
 * flint++ (c/c++) [flint]
 * gcc (getting compiler warnings/errors) [gcc]
 * json-parser (json) [jsonlint]
 * kconfig-hardened-check (check hardening of kernel) [kconfighard]
 * oelint-adv (linting bitbake recipes) [oelint]
 * pylint (python) [pylint]
 * pysymbolcheck (check elf-files for used functions) [pysymcheck]
 * oclint (c/c++/obj-c) [oclint]
 * shellcheck (shell) [shellcheck]
 * xmlint (xml) [xmllint]

each tool does have it's own benefits and flaws so don't be mad if you have 10k+ findings on the initial run.

# Optional requirements

To make the integration of clang-module (clang-tidy) work you need to add the [meta-clang](https://github.com/kraj/meta-clang) layer to your bblayer-file. If not present the clang integration will be silently disabled

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
| SCA_AUTO_INH_ON_IMAGE | Do automatically enable analysis on image-recipes | string | "1"
| SCA_AUTO_INH_ON_RECIPE | Do automatically enable analysis on other recipes | string | "1"
| SCA_AUTO_LICENSE_FILTER | Filter according to recipe license if sca should invoked | space separated regular expression | ".*"
| SCA_AVAILABLE_MODULES | List of all available modules, use to globally enable/dsiable modules | space-separated-string | all available modules
| SCA_ENABLE | Does globally enable the analysis | string | "1"
| SCA_ENABLE_BESTOF | Enables/disables the BestOf mode (see chapter BestOf Mode) | string | "0"
| SCA_ENABLE_IMAGE_SUMMARY | En/disable the image-summary module | string | "1"
| SCA_ENABLED_MODULES | The analysis modules to be activated | space-separated-string | see sca-on-image.bbclass or sca-on-recipe.bbclass
| SCA_EXPORT_DIR | Directory where to store the results of analysis | path | \${DEPLOY_DIR_IMAGE}/sca
| SCA_EXPORT_FINDING_DIR | The folder where to store the original source-files of findings | path | \${DEPLOY_DIR_IMAGE}/sca/sources/\${PN}/
| SCA_EXPORT_FINDING_SRC | Do copy the source-files of any finding to deploy-dir. This proved to helpful when integrating into Jenkins. | string | "1"
| SCA_SOURCES_DIR | Path where to find the source-files to be checked | path | "\${B}" for recipes, "\${IMAGE_ROOTFS}" for images
| SCA_STD_PYTHON_INTERPRETER | Standard python interpreter to be used in SCA | python or python3 | "python3"
| SCA_WARNING_LEVEL | Filter for severity of findings | string: info, warning or error | "warning"


### Available configuration for cpplint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_CPPLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CPPLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CPPLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"

### Available configuration for cppcheck
For further explanations on the variables see the manpage of cppcheck

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_CPPCHECK_ADD_INCLUDES | Additional paths leading to includes | space-separated-list | ""
| SCA_CPPCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CPPCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CPPCHECK_LANG_STD | C standard to check on | space separated list | "c99"

### Available configuration for gcc
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_GCC_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_GCC_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for pylint (recipe)
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${STAGING_LIBDIR}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${STAGING_LIBDIR}/python.3.5/:\${STAGING_LIBDIR}/python.3.5/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${B}

### Available configuration for pylint (image)
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${IMAGE_ROOTFS}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${IMAGE_ROOTFS}/python.3.5/:\${IMAGE_ROOTFS}/python.3.5/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${IMAGE_ROOTFS}

### Available configuration for shellcheck
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_SHELLCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_SHELLCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for eslint
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_ESLINT_CONFIG_FILE | Configuration-file to be used. See recipe eslint-native for details | string: eslint-standard.json, eslint-plain.json, eslint-airbnb.json, eslint-google.json | eslint-plain.json
| SCA_ESLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_ESLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for cve-check
n.a. this module does not need configuration, nor does it support suppression or fatal error handling

### Available configuration for bitbake
n.a. this module does not need configuration, nor does it support suppression or fatal error handling

### Available configuration for kconfighard
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_KCONFIGHARD_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_KCONFIGHARD_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for pysymcheck
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_PYSYMCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYSYMCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYSYMCHECK_RULE_FILE | Configuration-file to be used. Must be installed to \<root\>/usr/bin/pysymbolcheck/ | string: basic_rules.json | "basic_rules.json"

### Available configuration for clang
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_CLANG_ADD_INCLUDES | List of additional include paths | space-separated-list | ""
| SCA_CLANG_CHECKERS | List of clang-tidy checkers to execute | space-separated-list | see sca-clang.bbclass for details
| SCA_CLANG_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CLANG_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CLANG_FILE_FILTER | List of file extentions to check | space-separated-list | ".c .cpp"

### Available configuration for flint++
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_FLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_FLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for oclint
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_OCLINT_ADD_INCLUDES | List of additional include paths | space-separated-list | ""
| SCA_OCLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_OCLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_OCLINT_FILE_FILTER | List of file extentions to check | space-separated-list | ".c .cpp"

### Available configuration for bandit
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BANDIT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_BANDIT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for xmllint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_XMLLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_XMLLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_XMLLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".xml"

### Available configuration for oelint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_OELINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_OELINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for jsonlint
| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_JSONLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_JSONLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".json"

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

## BestOf mode
BestOf mode is an advanced filter for findings. In this mode only the findings are listed where more than one tool has reported a finding in source code.

You can call it the lazy programmers mode.
Main purpose of this module is to filter out the findings, which have been reported by one tool only. So the result of BestOf mode should give you a very strong hint that the finding reported is real.

You can either filter by a minimum number of tools that should have reported a finding (threshold), or by a percentage of tools that reported a finding (ratio).

The filtering is done on the basis of checked language (e.g. C, shell, python, a.s.o).
If there is only 1 tool available for the language the results will remain untouched/unfiltered.

This mode might be helpful for people who are drowning in false positives or are simply overwhelmed by the amount of findings.

__NOTE: the chance that this mode does also filter out important messages is extremely high. So use it with caution__

Following configuration exists

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BESTOF_MODE | Filter mode | threshold or ratio | "threshold"
| SCA_BESTOF_RATIO | Percentage of tools that reported a finding  | float 0.0-1.0 | "0.5"
| SCA_BESTOF_THRESHOLD_MIN | Minimum value of tools that reported a finding | number | "2"

## Further development

Feel free to create pull-requests or create an issue if you think there is something wrong or missing.
