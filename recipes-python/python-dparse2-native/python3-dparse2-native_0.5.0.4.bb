SUMMARY = "A parser for Python dependency files"
HOMEPAGE = "https://github.com/nexB/dparse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=220d28dc5d30a15667788003c931221c"

DEPENDS += "\
            python3-packaging-native \
            python3-pyyaml-native \
            python3-six-native \
           "

PYPI_PACKAGE = "dparse2"

SRC_URI[md5sum] = "e39bf177c6896fbaccec8be650b05265"
SRC_URI[sha256sum] = "8704ed31e2ca5f40cbeaea314affe52a4b2f0c18197dc7ea031b376fdab5a136"

inherit pypi
inherit setuptools3
inherit native
