SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "53e19c6ae7079a7636b1758b7859c91b"
SRC_URI[sha256sum] = "18f4039b96b5567bc4745eb851737ce456a2d499cecd71e84f5c0950e92d0e53"

inherit pypi
inherit setuptools3
inherit native
