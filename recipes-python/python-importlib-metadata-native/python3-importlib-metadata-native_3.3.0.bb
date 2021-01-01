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

SRC_URI[md5sum] = "76dc19f32bff3c485269ae5aa438dd86"
SRC_URI[sha256sum] = "5c5a2720817414a6c41f0a49993908068243ae02c1635a228126519b509c8aed"

inherit pypi
inherit native
inherit setuptools3

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0.0.0#${PV}#g" {} \;
}
