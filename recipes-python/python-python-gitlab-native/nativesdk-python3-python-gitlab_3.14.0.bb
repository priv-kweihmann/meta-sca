SUMMARY = "Interact with GitLab API"
HOMEPAGE = "https://github.com/python-gitlab/python-gitlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    nativesdk-python3-requests \
    nativesdk-python3-requests-toolbelt \
"

PYPI_PACKAGE = "python-gitlab"

SRC_URI[md5sum] = "90cf51ca147502d3d09c207a7d4c4570"
SRC_URI[sha256sum] = "ef3b8960faeee9880f82b0872d807e3fab94ace12b0d2a8418a97875c8812d3c"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-requests \
    nativesdk-python3-requests-toolbelt \
"
