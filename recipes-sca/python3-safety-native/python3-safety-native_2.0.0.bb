SUMMARY = "Safety checks your installed dependencies for known security vulnerabilities"
HOMEPAGE = "https://github.com/pyupio/safety"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=558baaefeb02113f2331ea2fd536fa86"

DEPENDS += "\
            python3-click-native \
            python3-dparse-native \
            python3-packaging-native \
            python3-pyparsing-native \
            python3-requests-native \
            python3-ruamel-yaml-native \
            python3-safety-db-native \
            "

SRC_URI[md5sum] = "56d715c9da8dbb696c87db0f09835390"
SRC_URI[sha256sum] = "d739d00a9e4203cfaba34540c822a73ca1d327159ed7776b3dce09391f81c35d"

PYPI_PACKAGE = "safety"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit native

SCA_TOOL_DESCRIPTION = "safety"
