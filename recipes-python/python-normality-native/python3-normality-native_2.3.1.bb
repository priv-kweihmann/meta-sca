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

SRC_URI[md5sum] = "bd78833fb45aa7ba4f6086ea9fd27e2c"
SRC_URI[sha256sum] = "a9f2b5dca05dc41bffeeea2a32194f68ff391ca10715bdd2f6914c7f781fe533"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}
