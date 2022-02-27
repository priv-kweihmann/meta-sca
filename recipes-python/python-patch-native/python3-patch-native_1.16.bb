SUMMARY = "Library to parse and apply unified diffs"
HOMEPAGE = "https://github.com/techtonik/python-patch/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "patch"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "dbcbbd4e45ddd8baeb02bddf663a3176"
SRC_URI[sha256sum] = "c62073f356cff054c8ac24496f1a3d7cfa137835c31e9af39a9f5292fd75bd9f"

inherit pypi

SRC_URI = "${PYPI_SRC_URI};subdir=${PYPI_PACKAGE}-${PV}"

do_configure:prepend() {
    sed -i "s#distutils.core#setuptools#g" ${S}/setup.py
}

inherit setuptools3
inherit native
