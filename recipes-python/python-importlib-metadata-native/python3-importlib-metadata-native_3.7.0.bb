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

SRC_URI[md5sum] = "3926d64c7a83e2c0fca5bb78d3659091"
SRC_URI[sha256sum] = "24499ffde1b80be08284100393955842be4a59c7c16bbf2738aad0e464a8e0aa"

inherit pypi
inherit setuptools3
inherit native

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0\.0\.0#${PV}#g" {} \;
}
