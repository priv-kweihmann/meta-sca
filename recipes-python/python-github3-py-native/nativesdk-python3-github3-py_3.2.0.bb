SUMMARY = "Python wrapper for the GitHub API"
HOMEPAGE = "https://github.com/sigmavirus24/github3.py"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b574ed4b26bdce9060017ce052d0109"

DEPENDS += "\
    nativesdk-python3-jwcrypto \
    nativesdk-python3-python-dateutil \
    nativesdk-python3-requests \
    nativesdk-python3-uritemplate \
"

PYPI_PACKAGE = "github3.py"

SRC_URI[md5sum] = "3f8e3b8c870e0f8298fb5b86a38fb79d"
SRC_URI[sha256sum] = "09b72be1497d346b0968cde8360a0d6af79dc206d0149a63cd3ec86c65c377cc"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-jwcrypto \
    nativesdk-python3-python-dateutil \
    nativesdk-python3-requests \
    nativesdk-python3-uritemplate \
"
