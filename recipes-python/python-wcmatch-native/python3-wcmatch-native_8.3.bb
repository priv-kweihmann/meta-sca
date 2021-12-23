SUMMARY = "Wildcard/glob file name matcher"
DESCRIPTION = "Wildcard Match provides an enhanced fnmatch, glob, and pathlib library."
HOMEPAGE = "https://github.com/facelessuser/wcmatch"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=838e17f50a700d2416b311b28960bcd3"

DEPENDS += "\
            python3-bracex-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "wcmatch"

SRC_URI[md5sum] = "d3e45a9f6853ebbb4d64c60d279de2f8"
SRC_URI[sha256sum] = "371072912398af61d1e4e78609e18801c6faecd3cb36c54c82556a60abc965db"

inherit pypi
inherit setuptools3
inherit native
