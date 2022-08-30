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

SRC_URI[md5sum] = "c9177679da898cea4b76b1abf3708656"
SRC_URI[sha256sum] = "5fc5e88f81f366e11851cb8b4b9a5b827491ce20ba7585446b74c9b097726ba3"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-requests \
    nativesdk-python3-requests-toolbelt \
"
