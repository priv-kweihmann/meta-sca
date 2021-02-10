SUMMARY = "A JSON streaming writer"
HOMEPAGE = "https://github.com/dcbaker/jsonstreams"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0fc5df914ce7fef4b2393c8eab07808"

DEPENDS += "\
            python3-six-native \
           "

PYPI_PACKAGE = "jsonstreams"

SRC_URI[md5sum] = "68fded16d2ab839c1ba30051224ff594"
SRC_URI[sha256sum] = "adb58f50ae374fdc01ef7cf29958dee662b03e190519c6d32402ea903ac8fac5"

inherit pypi
inherit setuptools3
inherit native
