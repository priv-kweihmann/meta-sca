SUMMARY = "Python implementation of the WHATWG Encoding standard"
HOMEPAGE = "https://github.com/SimonSapin/python-webencodings"

LICENSE = "BSD-3-Clause"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "webencodings"

SRC_URI[md5sum] = "32f6e261d52e57bf7e1c4d41546d15b8"
SRC_URI[sha256sum] = "b36a1c245f2d304965eb4e0a82848379241dc04b865afcc4aab16748587e1923"

inherit pypi
inherit setuptools3
inherit native
