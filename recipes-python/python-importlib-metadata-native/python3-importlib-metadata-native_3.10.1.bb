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

SRC_URI[md5sum] = "100e01419dcc45c4d767bbd573b08224"
SRC_URI[sha256sum] = "c9356b657de65c53744046fa8f7358afe0714a1af7d570c00c3835c2d724a7c1"

inherit pypi
inherit setuptools3
inherit native

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0\.0\.0#${PV}#g" {} \;
}
