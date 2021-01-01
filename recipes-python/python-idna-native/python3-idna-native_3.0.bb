SUMMARY = "Internationalized Domain Names for Python"
HOMEPAGE = "https://github.com/kjd/idna"

LICENSE = "BSD-3-Clause"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "idna"

SRC_URI[md5sum] = "527f4b14b1078fed5aa4baf5516dcdcf"
SRC_URI[sha256sum] = "c9a26e10e5558412384fac891eefb41957831d31be55f1e2c98ed97a70abb969"

inherit pypi
inherit native
inherit setuptools3
