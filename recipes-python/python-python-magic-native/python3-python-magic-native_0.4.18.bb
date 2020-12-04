SUMMARY = "A python wrapper for libmagic"
HOMEPAGE = "https://github.com/ahupp/python-magic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=16a934f165e8c3245f241e77d401bb88"

DEPENDS += "file-native"

PYPI_PACKAGE = "python-magic"

SRC_URI[md5sum] = "5edc6caa39cc62641850f6b1b6f284ba"
SRC_URI[sha256sum] = "b757db2a5289ea3f1ced9e60f072965243ea43a2221430048fd8cacab17be0ce"

inherit pypi
inherit native
inherit setuptools3

do_install_append() {
    # Rename magic.py to python_magic.py to avoid clashes with other python modules
    [ -e ${D}${PYTHON_SITEPACKAGES_DIR}/magic.py ] && \
        mv ${D}${PYTHON_SITEPACKAGES_DIR}/magic.py ${D}${PYTHON_SITEPACKAGES_DIR}/python_magic.py
}