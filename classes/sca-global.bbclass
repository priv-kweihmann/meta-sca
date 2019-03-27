SCA_ENABLE ?= "1"
SCA_EXPORT_DIR ?= "${DEPLOY_DIR_IMAGE}/sca"
SCA_EXPORT_FINDING_SRC = "1"
SCA_EXPORT_FINDING_DIR ?= "${DEPLOY_DIR_IMAGE}/sca/sources/${PN}/"

SCA_AUTO_INH_ON_IMAGE ?= "1"
SCA_AUTO_INH_ON_RECIPE ?= "1"

## Just apply the one of the following license (regex)
SCA_AUTO_LICENSE_FILTER ?= ".*"

## All findings below this level will be dropped
## from checkstyle-result
## possible options error, warning or info
SCA_WARNING_LEVEL ?= "warning"

## Enable an extra report per image
SCA_ENABLE_IMAGE_SUMMARY ?= "1"

## Enable an extra report from bestof-module
SCA_ENABLE_BESTOF ?= "0"

## Standard python interpreter to be used in SCA
SCA_STD_PYTHON_INTERPRETER ?= "python3"

## List of overall available modules
SCA_AVAILABLE_MODULES ?= "\
                          bandit \
                          bitbake \
                          cppcheck \
                          cpplint \
                          cve-check \
                          eslint \
                          flint \
                          gcc \
                          gixy \
                          jsonlint \
                          kconfighard \
                          oclint \
                          oelint \
                          pylint \
                          pysymcheck \
                          pytype \
                          rats \
                          shellcheck \
                          tscancode \
                          xmllint"

inherit sca-conv-checkstyle-helper

def do_sca_export_sources(d, _file):
    import os
    import shutil
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom

    ## Helper function to export the sources file
    ## of any findings
    ## NOTE: This also adjusts the paths accordingly in the result file
    if d.getVar("SCA_EXPORT_FINDING_SRC") == "1":
        if _file:
            data = ElementTree.parse(_file).getroot()
            for node in data.findall(".//file"):
                if not os.path.exists(node.attrib["name"]):
                    continue
                _targetfilename = os.path.relpath(node.attrib["name"], d.getVar("SCA_SOURCES_DIR"))
                if _targetfilename.startswith("/"):
                    _targetfilename = _targetfilename[1:]
                _targetfilename = os.path.join(d.getVar("SCA_EXPORT_FINDING_DIR", True), _targetfilename)
                _targetfilename = _targetfilename.replace("../", "")
                if node.attrib["name"] == _targetfilename:
                    continue
                os.makedirs(os.path.dirname(_targetfilename), exist_ok=True)
                shutil.copy(node.attrib["name"], _targetfilename)
                ## Adjust the file attribute
                node.attrib["name"] = _targetfilename
            with open(_file, "w") as f:
                f.write(checkstyle_prettify(d, data))