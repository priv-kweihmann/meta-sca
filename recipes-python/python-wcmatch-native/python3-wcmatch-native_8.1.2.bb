SUMMARY = "Wildcard/glob file name matcher"
DESCRIPTION = "Wildcard Match provides an enhanced fnmatch, glob, and pathlib library."
HOMEPAGE = "https://github.com/facelessuser/wcmatch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=afeaf26eb7075154cef8e8a5fe5fa5ee"

DEPENDS += "\
            python3-bracex-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "wcmatch"

SRC_URI[md5sum] = "f215eae2744eb344183b42bd1ae32839"
SRC_URI[sha256sum] = "efda751de15201b395b6d6e64e6ae3b6b03dc502a64c3c908aa5cad14c27eee5"

inherit pypi
inherit setuptools3
inherit native
