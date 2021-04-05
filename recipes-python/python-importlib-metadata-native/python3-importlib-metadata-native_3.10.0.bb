SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "\
           python3-typing-extensions-native \
           python3-zipp-native \
           "

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "f9805f90cecb9eeb0d75349f7fa3ad43"
SRC_URI[sha256sum] = "c9db46394197244adf2f0b08ec5bc3cf16757e9590b02af1fca085c16c0d600a"

inherit pypi
inherit setuptools3
inherit native

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0\.0\.0#${PV}#g" {} \;
}
