SUMMARY = "Utilities for handling packages."
HOMEPAGE = "https://github.com/domdfcoding/shippinglabel"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c61fe6187288c5c2e41810d0457f1e89"

DEPENDS += "\
    python3-hatch-requirements-txt-native \
"

SRC_URI[sha256sum] = "baf43a3231e9d57eb73e510340a6a260c2e807bfe0aace0a7c5c99a0278d3574"

inherit pypi
inherit python_hatchling
inherit_defer native

PYPI_PACKAGE = "shippinglabel"
