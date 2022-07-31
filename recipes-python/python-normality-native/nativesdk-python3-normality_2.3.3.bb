SUMMARY = "micro-package that contains a small set of text normalization"
HOMEPAGE = "http://github.com/pudo/normality"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac24567f92cb0c2380157fd45299ceb3"

DEPENDS += "\
    nativesdk-python3-banal \
    nativesdk-python3-chardet \
    nativesdk-python3-text-unidecode \
"

PYPI_PACKAGE = "normality"

SRC_URI[md5sum] = "76839f8fbeee9cb6c4877c85af748958"
SRC_URI[sha256sum] = "c9eda72c288795294db79b1fe0b285b26f0b5e2e7b20b8fa1e617eb165fc3962"

inherit pypi
inherit setuptools3
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
