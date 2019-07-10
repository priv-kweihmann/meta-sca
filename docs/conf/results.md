# Results

Depending on how you configured the variable __SCA_EXPORT_DIR__ (default \${DEPLOY_DIR_IMAGE}/sca) you will find several files and folders.

- sca
  - cppcheck
    - checkstyle
    - datamodel
    - raw
  - cpplint
    - checkstyle
    - datamodel
    - raw
  - pylint
    - checkstyle
    - datamodel
    - raw

a.s.o.

## checkstyle folder

In each checkstyle-subfolder you will find a XML-document named __\${PN}_\${PV}.xml__ e.g. for recipe **acl** this would be **acl_1.2.3.xml**.
This document contains all findings in checkstyle-format.

## datamodel folder

In this folder you will find the internal representation of all 
findings detected with the configured tools.
These are used for various things, so just keep them where they are.

## raw folder

In each raw-subfolder you will find the raw output of the tool, without any further processing done to it. The format depends on the tool.

# Source-File

If you enabled the bitbake-variable __SCA_EXPORT_FINDING_SRC__ (set it to "1") all source-files from the findings will be copied to structure like this.

- sca
  - sources

Also the corresponding path in each checkstyle-XML-document will be adjusted to point to the file copy.
With this help e.g. Jenkins will be capable of giving you inline snippets to the findings.

If you don't need this feature you should leave it disabled.