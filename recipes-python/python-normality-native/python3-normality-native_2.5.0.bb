SUMMARY = "micro-package that contains a small set of text normalization"
HOMEPAGE = "http://github.com/pudo/normality"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2f7219b033913ae167adef13f25265b5"

DEPENDS += "\
            python3-banal-native \
            python3-chardet-native \
            python3-setuptools-scm-native \
            python3-text-unidecode-native \
           "

PYPI_PACKAGE = "normality"

SRC_URI[md5sum] = "12f8652756c93117af3c32e54d9747be"
SRC_URI[sha256sum] = "a55133e972b81c4a3bf8b6dc419f262f94a4fd6f636297046f74d35c93abe153"

inherit pypi
inherit python_setuptools_build_meta
inherit native

do_install:append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-banal \
    nativesdk-python3-chardet \
    nativesdk-python3-text-unidecode \
"
