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

SRC_URI[md5sum] = "9cc01b572ffbef3539d51b87f95d8cdb"
SRC_URI[sha256sum] = "fa5daa4477a7414ae34e95942e4dd07f62adf589143c875c133c1e53c4eff38d"

inherit pypi
inherit native
inherit setuptools3

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0\.0\.0#${PV}#g" {} \;
}
