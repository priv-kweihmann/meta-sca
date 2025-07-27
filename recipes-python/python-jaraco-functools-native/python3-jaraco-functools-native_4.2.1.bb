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

SRC_URI[md5sum] = "23b95c0de9c5f97dcc033f25fdcc9d0c"
SRC_URI[sha256sum] = "be634abfccabce56fa3053f8c7ebe37b682683a4ee7793670ced17bab0087353"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"
