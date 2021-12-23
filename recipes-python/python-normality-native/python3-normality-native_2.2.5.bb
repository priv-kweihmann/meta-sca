SUMMARY = "micro-package that contains a small set of text normalization"
HOMEPAGE = "http://github.com/pudo/normality"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac24567f92cb0c2380157fd45299ceb3"

DEPENDS += "\
            python3-banal-native \
            python3-chardet-native \
            python3-text-unidecode-native \
           "

PYPI_PACKAGE = "normality"

SRC_URI[md5sum] = "594ded145c200f47d316767c9854035d"
SRC_URI[sha256sum] = "b27d8c9b79efa7a6a7e90253b56ccb448b4873dfc3803a669e72159b2038625a"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}
