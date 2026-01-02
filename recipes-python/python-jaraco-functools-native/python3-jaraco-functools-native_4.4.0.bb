SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1aeae65f25a15b1e46d4381f2f094e0a"

DEPENDS += "\
            python3-coherent-licensed-native \
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "501918900674199182b1bfa39db200b6"
SRC_URI[sha256sum] = "da21933b0417b89515562656547a77b4931f98176eb173644c0d35032a33d6bb"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"
