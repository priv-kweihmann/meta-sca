SUMMARY = "A python package that provides useful locks"
HOMEPAGE = "https://github.com/harlowja/fasteners"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4476c4be31402271e101d9a4a3430d52"

PYPI_PACKAGE = "fasteners"

SRC_URI[md5sum] = "b01609ddea36c33cccf64299bdeb83d8"
SRC_URI[sha256sum] = "2aceacb2bd618ce8526676f7a3e84ea25d0165ef10abb574a45b4a9c07292d2e"

inherit pypi
inherit setuptools3
inherit sca-setuptools-legacy
inherit native
