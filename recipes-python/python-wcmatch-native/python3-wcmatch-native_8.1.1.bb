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

SRC_URI[md5sum] = "d2b88127f7c6d223de22c4359f27689c"
SRC_URI[sha256sum] = "7ba09191f9582e82d864829bdfbab02df46e26a46a304e57c7fe5652f07f297a"

inherit pypi
inherit setuptools3
inherit native
