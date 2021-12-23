SUMMARY = "A JSON streaming writer"
HOMEPAGE = "https://github.com/dcbaker/jsonstreams"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0fc5df914ce7fef4b2393c8eab07808"

DEPENDS += "\
            python3-six-native \
           "

PYPI_PACKAGE = "jsonstreams"

SRC_URI[md5sum] = "f3a40174a4f54e0ecbf803cf92ead38a"
SRC_URI[sha256sum] = "721cda7391e9415b7b15cebd6cf92fc7f8788ca211eda7d64162a066ee45a72e"

inherit pypi
inherit setuptools3
inherit native
