SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bracex is a brace expanding library (à la Bash) for Python."
HOMEPAGE = "https://github.com/facelessuser/bracex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=afeaf26eb7075154cef8e8a5fe5fa5ee"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "bracex"

SRC_URI[md5sum] = "c82d520f9d52acc10d0b98d7b6c185a6"
SRC_URI[sha256sum] = "1c8d1296e00ad9a91030ccb4c291f9e4dc7c054f12c707ba3c5ff3e9a81bcd21"

inherit pypi
inherit setuptools3
inherit native
