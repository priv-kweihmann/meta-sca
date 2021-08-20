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

SRC_URI[md5sum] = "9c31adeda3605cb99161dc073372bafb"
SRC_URI[sha256sum] = "cb7ff88348f090b8f5517baeda3d7cced94cebf6ae3e6756689a73d18b1bc041"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}
