SUMMARY = "micro-package that contains a small set of text normalization"
HOMEPAGE = "http://github.com/pudo/normality"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac24567f92cb0c2380157fd45299ceb3"

DEPENDS += "\
            python3-banal-native \
            python3-chardet-native \
            python3-text-unidecode-native \
           "

PYPI_PACKAGE = "normality"

SRC_URI[md5sum] = "a9653c1c2b94024dfcd7b43a34b00a6e"
SRC_URI[sha256sum] = "513d1a394507cc0b132f14c08349d58f9ed24f583aeb1b26a93066a8230906de"

inherit pypi
inherit setuptools3
inherit native

do_install_append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}
