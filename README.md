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

 * ansible (security) [ansible]
 * ansible-lint (ansible) [ansiblelint]
 * bandit (python/security) [bandit]
 * bitbake (handle bitbake issues) [bitbake]
 * detect-secrets (detecting and preventing secrets in code) [detectsecrets]
 * eslint (javascript/html) [eslint]
 * gixy (nginx-config security) [gixy]
 * htmlhint (html) [htmlhint]
 * image-summary (aggregate all findings for package in an image) [image-summary]
 * json-parser (json) [jsonlint]
 * oelint-adv (linting bitbake recipes) [oelint]
 * pylint (python) [pylint]
 * shellcheck (shell) [shellcheck]
 * standard (javascript) [standard]
 * stylelint (css, scss) [stylelint]
 * systemdlint (systemd) [systemdlint]
 * xmllint (xml) [xmllint]
 * yamllint (yaml) [yamllint]

### Tools for all other recipes

 * ansible-lint (ansible) [ansiblelint]
 * bandit (python/security) [bandit]
 * bitbake (handle bitbake issues) [bitbake]
 * clang-tidy (c/c++) [clang]
 * cppcheck (c/c++) [cppcheck]
 * cpplint (c/c++) [cpplint]
 * cspell (spelling in c/c++/html/python/txt/md) [cspell]
 * cve-check (check for unpatched cve's) [cve-check]
 * dennis (i18n) [dennis]
 * detect-secrets (detecting and preventing secrets in code) [detectsecrets]
 * eslint (javascript/html) [eslint]
 * flint++ (c/c++) [flint]
 * gcc (getting compiler warnings/errors) [gcc]
 * htmlhint (html) [htmlhint]
 * json-parser (json) [jsonlint]
 * kconfig-hardened-check (check hardening of kernel) [kconfighard]
 * oclint (c/c++/obj-c) [oclint]
 * oelint-adv (linting bitbake recipes) [oelint]
 * pylint (python) [pylint]
 * pysymbolcheck (check elf-files for used functions) [pysymcheck]
 * pytype (python) [pytype]
 * rats (security for c/php/python/perl/ruby) [rats]
 * shellcheck (shell) [shellcheck]
 * standard (javascript) [standard]
 * stylelint (css, scss) [stylelint]
 * textlint (spelling) [textlint]
 * tscancode (c,c#,lua) [tscancode]
 * xmllint (xml) [xmllint]
 * yamllint (yaml) [yamllint]
 * zeroresourcedetector (g18n/i18n) [zrd]

each tool does have it's own benefits and flaws so don't be mad if you have 10k+ findings on the initial run.

# Optional requirements

To make the integration of clang-module (clang-tidy) work you need to add the [meta-clang](https://github.com/kraj/meta-clang) layer to your bblayer-file. If not present the clang integration will be silently disabled

# Configuration

There are several ways to integrate static code analysis into your code base.

## Configuration wizard

You can find a configuration wizard script at 

``` shell
<layer-root>/script/configure
```

Just execute it and copy the stated result into either your local.conf or your distribution-config.
**NOTE**: the script requires __python3__ to be installed on your system.

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
| SCA_AVAILABLE_MODULES | List of all available modules, use to globally enable/disable modules | space-separated-string | all available modules
| SCA_ENABLE | Does globally enable the analysis | string | "1"
| SCA_ENABLE_BESTOF | Enables/disables the BestOf mode (see chapter BestOf Mode) | string | "0"
| SCA_ENABLE_IMAGE_SUMMARY | En/disable the image-summary module | string | "1"
| SCA_ENABLED_MODULES | The analysis modules to be activated | space-separated-string | see sca-on-image.bbclass or sca-on-recipe.bbclass
| SCA_EXPORT_DIR | Directory where to store the results of analysis | path | \${DEPLOY_DIR_IMAGE}/sca
| SCA_EXPORT_FINDING_DIR | The folder where to store the original source-files of findings | path | \${DEPLOY_DIR_IMAGE}/sca/sources/\${PN}/
| SCA_EXPORT_FINDING_SRC | Do copy the source-files of any finding to deploy-dir. This proved to helpful when integrating into Jenkins. | string | "1"
| SCA_FILE_FILTER | List of glob-expression of file to skip for testing | space separated list | "tests/* test/* doc/* testsuite/* \*\*/tests/* \*\*/test/* \*\*/doc/* \*\*/testsuite/*"
| SCA_SOURCES_DIR | Path where to find the source-files to be checked | path | "\${B}" for recipes, "\${IMAGE_ROOTFS}" for images
| SCA_STD_PYTHON_INTERPRETER | Standard python interpreter to be used in SCA | python or python3 | "python3"
| SCA_WARNING_LEVEL | Filter for severity of findings | string: info, warning or error | "warning"

You can also exclude recipe from all or certain tools therefore a blacklisting configuration exists.
To exclude __all__ tools from a recipe use the following variable

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:|
| SCA_BLACKLIST | regular expression(s) | space separated list | ".*-native"

The effective configuration is a merge of the global blacklist and the tool specific blacklist

Also you can skip testing certain files. You can set this globally by appending to **SCA_FILE_FILTER** or on a recipe level 
by defining a variable called **SCA_FILE_FILTER_EXTRA**.

### Available configuration for ansible

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_ansible | Blacklist filter for this tool | space-separated-list | ""
| SCA_ANSIBLE_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_ANSIBLE_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_ANSIBLE_PLAYBOOKS | List of glob-expr to search for playbooks | space-separated-list | "*.yaml"

**Note**: __A detailed description of how things are working regarding ansible and playbooks will follow soon__

### Available configuration for ansiblelint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_ansiblelint | Blacklist filter for this tool | space-separated-list | ""
| SCA_ANSIBLELINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_ANSIBLELINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_ANSIBLELINT_FILE_FILTER | List of file extensions to search for playbooks | space-separated-list | ".yaml"

### Available configuration for bandit

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BANDIT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_BANDIT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_BLACKLIST_bandit | Blacklist filter for this tool | space-separated-list | "linux-*"

### Available configuration for bitbake

__NOTE:__ this tool does not support suppression or fatal error handling

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_bitbake | Blacklist filter for this tool | space-separated-list | ""

### Available configuration for clang

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_clang | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_CLANG_ADD_INCLUDES | List of additional include paths | space-separated-list | ""
| SCA_CLANG_CHECKERS | List of clang-tidy checkers to execute | space-separated-list | see sca-clang.bbclass for details
| SCA_CLANG_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CLANG_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CLANG_FILE_FILTER | List of file extensions to check | space-separated-list | ".c .cpp"

### Available configuration for cppcheck

For further explanations on the variables see the manpage of cppcheck

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cppcheck | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_CPPCHECK_ADD_INCLUDES | Additional paths leading to includes | space-separated-list | ""
| SCA_CPPCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CPPCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CPPCHECK_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"
| SCA_CPPCHECK_LANG_STD | C standard to check on | space separated list | "c99"

### Available configuration for cpplint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cpplint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_CPPLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CPPLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CPPLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"

### Available configuration for cspell

This module is someway different in configuration than the other.
First of all this module does not support suppression or fatal-errors, as the only error this module 
produces is to warn you about typos and unknown words.
The check itself is done for each configured language - meaning a defined set of dictionaries is used for checking.
Currently available as dictionaries are

| name | purpose | enable default 
| ------------- | -----:| -----:
| companies | Known companies list | yes
| cpp | C/C++ terms and functions | no
| csharp | C# terms and functions | no
| css | CSS terms | no
| django | Django terms | no
| dotnet | .Net terms | no
| elixir | Elixir terms | no
| en_US | standard us-English dict | yes
| filetypes | List of known filetypes | yes
| fonts | List of known fonts | yes
| fullstack | Different terms from software development | yes
| go | Go-Lang terms | no
| html | HTML terms | no
| java | JAVA terms | no
| misc | Term often used | yes
| node | Node.js terms | no
| npm | NPM terms | no
| php | PHP terms | no
| powershell | Powershell terms | no
| python | Python terms | no
| rust | Rust terms | no
| scala | Scala terms | no
| softwareTerms | More terms from software development | yes
| typescript | Typescript terms | no

These dictionaries are applied to language by defining the following case sensitive variables

 * **SCA_CSPELL_LANG_\<LANG_CODE\>_files** - List of file extensions to check
 * **SCA_CSPELL_LANG_\<LANG_CODE\>_dicts** - List of dictionaries to add the default selection for checking
 * **SCA_CSPELL_LANG_\<LANG_CODE\>_shebang** - Regex for getting file by shebang

Following variables are therefore languages are exposed by default

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cspell | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_CSPELL_CHECK_LANG | List of languages configured | space-separated-list | "CPP HTML PYTHON TXT"
| SCA_CSPELL_LANG_CPP_dicts | Dictionaries for CPP | space-separated-list | "cpp"
| SCA_CSPELL_LANG_CPP_files | Files to check for CPP | space-separated-list | ".c .cpp .h .hpp"
| SCA_CSPELL_LANG_HTML_dicts | Dictionaries for HTML | space-separated-list | "html css typescript"
| SCA_CSPELL_LANG_HTML_files | Files to check for HTML | space-separated-list | ".html .htm .js"
| SCA_CSPELL_LANG_PYTHON_dicts | Dictionaries for PYTHON | space-separated-list | "python"
| SCA_CSPELL_LANG_PYTHON_files | Files to check for PYTHON | space-separated-list | ".py"
| SCA_CSPELL_LANG_PYTHON_shebang | Files to check for PYTHON | space-separated-list | ".*python"
| SCA_CSPELL_LANG_TXT_dicts | Dictionaries for TXT | space-separated-list | ""
| SCA_CSPELL_LANG_TXT_files | Files to check for TXT | space-separated-list | ".txt .md .rst"

__NOTE__: By the default this module does only generate warnings of level **"info"**. 
So if you like them to be deployed you have to set **SCA_WARNING_LEVEL** to __"info"__ globally or in the 
recipe.

### Available configuration for cve-check

__NOTE:__ this tool does not support suppression or fatal error handling

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cve_check | Blacklist filter for this tool | space-separated-list | ""

### Available configuration for dennis

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_dennis | Blacklist filter for this tool | space-separated-list | ""
| SCA_DENNIS_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_DENNIS_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for detectsecrets

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_detectsecrets | Blacklist filter for this tool | space-separated-list | ""
| SCA_DETECTSECRETS_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_DETECTSECRETS_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for eslint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_eslint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_ESLINT_CONFIG_FILE | Configuration-file to be used. See recipe eslint-native for details | string: eslint-standard.json, eslint-plain.json, eslint-airbnb.json, eslint-google.json | eslint-plain.json
| SCA_ESLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_ESLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for flint++

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_flint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_FLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_FLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_FLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"

### Available configuration for gcc

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_gcc | Blacklist filter for this tool | space-separated-list | ""
| SCA_GCC_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_GCC_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for gixy

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_gixy | Blacklist filter for this tool | space-separated-list | ""
| SCA_GIXY_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_GIXY_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".json"
| SCA_GIXY_NGINX_CONF | NGINX config file to be checked | string | "/etc/nginx/nginx.conf"

### Available configuration for htmlhint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_htmlhint | Blacklist filter for this tool | space-separated-list | ""
| SCA_HTMLHINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_HTMLHINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for jsonlint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_jsonlint | Blacklist filter for this tool | space-separated-list | ""
| SCA_JSONLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_JSONLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".json"

### Available configuration for kconfighard

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_kconfighard | Blacklist filter for this tool | space-separated-list | ""
| SCA_KCONFIGHARD_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_KCONFIGHARD_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for oclint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_oclint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_OCLINT_ADD_INCLUDES | List of additional include paths | space-separated-list | ""
| SCA_OCLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_OCLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_OCLINT_FILE_FILTER | List of file extensions to check | space-separated-list | ".c .cpp"

### Available configuration for oelint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_oelint | Blacklist filter for this tool | space-separated-list | ""
| SCA_OELINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_OELINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for pylint (image)

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pylint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${IMAGE_ROOTFS}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${IMAGE_ROOTFS}/python.3.5/:\${IMAGE_ROOTFS}/python.3.5/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${IMAGE_ROOTFS}

### Available configuration for pylint (recipe)

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pylint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${STAGING_LIBDIR}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${STAGING_LIBDIR}/python.3.5/:\${STAGING_LIBDIR}/python.3.5/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${B}

### Available configuration for pysymcheck

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pysymcheck | Blacklist filter for this tool | space-separated-list | ""
| SCA_PYSYMCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYSYMCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYSYMCHECK_RULE_FILE | Configuration-file to be used. Must be installed to \<root\>/usr/bin/pysymbolcheck/ | string: basic_rules.json | "basic_rules.json"

### Available configuration for pytype

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pytype | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYTYPE_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYTYPE_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for rats

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_rats | Blacklist filter for this tool | space-separated-list | ""
| SCA_RATS_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_RATS_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for shellcheck

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_shellcheck | Blacklist filter for this tool | space-separated-list | ""
| SCA_SHELLCHECK_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_SHELLCHECK_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

### Available configuration for standard

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_standard | Blacklist filter for this tool | space-separated-list | ""
| SCA_STANDARD_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_STANDARD_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_STANDARD_FILE_FILTER | File extension to scan for | space-separated-list | ".js .jsx"

### Available configuration for stylelint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_stylelint | Blacklist filter for this tool | space-separated-list | ""
| SCA_STYLELINT_CONFIG | Config to use | 'stylelint-config-standard' or 'stylelint-config-recommended' | "stylelint-config-standard"
| SCA_STYLELINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_STYLELINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_STYLELINT_FILE_FILTER | Files to scan | space-separated-list | ".css .scss .html .htm"

### Available configuration for systemdlint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_systemdlint | Blacklist filter for this tool | space-separated-list | ""
| SCA_SYSTEMDLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_SYSTEMDLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_SYSTEMDLINT_SYSTEMD_VERSION | Specifies the version of systemd to be checked against. Leave empty to disable | version string | ""
| SCA_SYSTEMDLINT_FILES | File extensions to check on | space-separated-list | ".automount .conf .link .mount .network .path .service .slice .socket .swap .target .timer"
| SCA_SYSTEMDLINT_PATHS | Paths to search for systemd-files | space-separated-list | ${SCA_SOURCES_DIR}/${sysconfdir}/systemd ${SCA_SOURCES_DIR}/${libdir}/systemd ${SCA_SOURCES_DIR}/run/systemd

### Available configuration for textlint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_textlint | Blacklist filter for this tool | space-separated-list | ""
| SCA_TEXTLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_TEXTLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_TEXTLINT_ONLINE | Allow rules which requires online access to work | 0 or 1 | "1"
| SCA_TEXTLINT_RULES | List of rules to check on | space-separated-list | see sca-textlint.bbclass for details

### Available configuration for tscancode

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_tscancode | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_TSCANCODE_CONFIG_FILES | Files to check for configuration symbols (header or KConfig) | space-separated-list | ".config config.h"
| SCA_TSCANCODE_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_TSCANCODE_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_TSCANCODE_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".cpp .cxx .cc .c++ .c .tpp .txx"
| SCA_TSCANCODE_INCLUDE_PATHS | Extra include paths **WARNING: this will heavily slow down thw check** | space-separated-list | ""
| SCA_TSCANCODE_SYMBOL_PREFIX | Prefix found symbols with | string | "ENABLE_"

### Available configuration for xmllint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_xmllint | Blacklist filter for this tool | space-separated-list | ""
| SCA_XMLLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_XMLLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_XMLLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".xml"

### Available configuration for yamllint

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_yamllint | Blacklist filter for this tool | space-separated-list | ""
| SCA_YAMLLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_YAMLLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_YAMLLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".yaml"

### Available configuration for zrd

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_zrd | Blacklist filter for this tool | space-separated-list | ""
| SCA_ZRD_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_ZRD_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

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
