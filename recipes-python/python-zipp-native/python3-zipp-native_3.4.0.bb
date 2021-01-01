SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "zipp"

SRC_URI[md5sum] = "ae81f228995578b840d76d1b7d87fede"
SRC_URI[sha256sum] = "ed5eee1974372595f9e416cc7bbeeb12335201d8081ca8a0743c954d4446e5cb"

inherit pypi
inherit native
inherit setuptools3

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0.0.0#${PV}#g" {} \;
}
