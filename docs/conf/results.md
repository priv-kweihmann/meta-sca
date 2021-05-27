# Results

Depending on how you configured the variable __SCA_EXPORT_DIR__ (default \${DEPLOY_DIR_IMAGE}/sca) you will find several files and folders.

- sca
  - cppcheck
    - checkstyle or console or diff or stat
    - datamodel
    - raw
  - cpplint
    - checkstyle or console or diff or stat
    - datamodel
    - raw
  - pylint
    - checkstyle or console or diff or stat
    - datamodel
    - raw

a.s.o.

## checkstyle folder

In each checkstyle-subfolder you will find a XML-document named __\${PN}_\${PV}.xml__ e.g. for recipe **acl** this would be **acl_1.2.3.xml**.
This document contains all findings in checkstyle-format.

**NOTE**: this applies only if __SCA_EXPORT_FORMAT__ is set to __checkstyle__

## console folder

In each console-subfolder you will find a txt-document named __\${PN}_\${PV}.txt__ e.g. for recipe **acl** this would be **acl_1.2.3.txt**.
This document contains all findings in plain text format.
See [output formats](output_formats.md) for details.

**NOTE**: this applies only if __SCA_EXPORT_FORMAT__ is set to __console__

## diff folder

In each diff-subfolder you will find a txt-document named __\${PN}_\${PV}.txt__ e.g. for recipe **acl** this would be **acl_1.2.3.txt**.
This document contains all findings in plain text format.
See [output formats](output_formats.md) for details.

## stat folder

In each stat-subfolder you will find a json-document named __\${PN}_\${PV}.json__ e.g. for recipe **acl** this would be **acl_1.2.3.json**.
This document contains all findings in stat compatible format.
See [output formats](output_formats.md) for details.

**NOTE**: this applies only if __SCA_EXPORT_FORMAT__ is set to __diff__

## datamodel folder

In this folder you will find the internal representation of all findings detected with the configured tools.
These are used for various things, so just keep them where they are.

## raw folder

In each raw-subfolder you will find the raw output of the tool, without any further processing done to it. The format depends on the tool.

# Source-Files

If you enabled the bitbake-variable __SCA_EXPORT_FINDING_SRC__ (set it to "1") all source-files from the findings will be copied to structure like this.

- sca
  - sources

Also the corresponding path in each checkstyle-XML-entry will be adjusted to point to the file copy.
This helps e.g. jenkins to be capable of giving you inline snippets to the findings.

If you don't need this feature you should leave it turned off.
