SUMMARY = "A parser for Python dependency files"
HOMEPAGE = "https://github.com/pyupio/dparse"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=220d28dc5d30a15667788003c931221c"

DEPENDS += "\
            python3-packaging-native \
            python3-pyyaml-native \
            python3-six-native \
           "

PYPI_PACKAGE = "dparse"

SRC_URI[md5sum] = "d5174ef465e97f8465a427a4aa64cce9"
SRC_URI[sha256sum] = "a1b5f169102e1c894f9a7d5ccf6f9402a836a5d24be80a986c7ce9eaed78f367"

inherit pypi
inherit setuptools3
inherit native
