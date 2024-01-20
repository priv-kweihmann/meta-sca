SUMMARY = "expose pylint as a lint command into setup.py"
HOMEPAGE = "https://github.com/johnnoone/setuptools-pylint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=2;endline=9;md5=c1563877848d2f74bcf0fbcc4330748b"

DEPENDS += "nativesdk-python3-pylint"

SRC_URI:append = " \
    file://0001-adapt-to-pylint-API-changes.patch \
    file://0001-command-switch-to-setuptools.patch \
"

SRC_URI[md5sum] = "1d0bedb4c35ee87ad8382f12de121974"
SRC_URI[sha256sum] = "e794e15c7c8dde970b618d9c7ad4588aeaea067f034ccb4ae8facc630b534199"

PYPI_PACKAGE = "setuptools-lint"

inherit pypi

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "setuptoolslint"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-pip \
    nativesdk-python3-pylint \
    nativesdk-python3-setuptools \
"
