SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2e21c3f75eb8d9427c8a611a8e83e9d6"

DEPENDS += "\
            python3-coherent-licensed-native \
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "94647e0a43cf1ef4d89e53a6397d831d"
SRC_URI[sha256sum] = "3bb5665ea4a020cf78a7040e89154c77edadb3ca74f366479669c5999aa70b03"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"
