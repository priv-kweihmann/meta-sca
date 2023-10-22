SUMMARY = "micro-package that contains a small set of text normalization"
HOMEPAGE = "http://github.com/pudo/normality"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2f7219b033913ae167adef13f25265b5"

DEPENDS += "\
    nativesdk-python3-banal \
    nativesdk-python3-chardet \
    nativesdk-python3-text-unidecode \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "normality"

SRC_URI[md5sum] = "860e620b837627282c0b01f1327e40ac"
SRC_URI[sha256sum] = "38bbe4e1dfd737c318ffd70e981ae8ff40bd8839393f6d62f0e200e5aab9e992"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

do_install:append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-banal \
    nativesdk-python3-chardet \
    nativesdk-python3-text-unidecode \
"
