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

SRC_URI[md5sum] = "81573c9d0dbc81a892f652fe9f44f526"
SRC_URI[sha256sum] = "14930a16fdd7f36f67b9373e7d4d4720e8e374800028380289db3306e9f74614"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-requests \
    nativesdk-python3-requests-toolbelt \
"
