SUMMARY = "Pretty print the output of python stdlib ast.parse"
HOMEPAGE = "https://github.com/asottile/astpretty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5fd324061c581b8d45b8cb18c560a543"

SRC_URI[md5sum] = "4c0b5414950d42d10e891776267454ac"
SRC_URI[sha256sum] = "8a801fcda604ec741f010bb36d7cbadc3ec8a182ea6fb83e20ab663463e75ff6"

PYPI_PACKAGE = "astpretty"

inherit pypi
inherit setuptools3
inherit native
