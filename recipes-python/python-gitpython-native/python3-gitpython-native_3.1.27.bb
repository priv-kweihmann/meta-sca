SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            python3-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "dc3bde87ec2c22b8117eecc1c351c417"
SRC_URI[sha256sum] = "1c885ce809e8ba2d88a29befeb385fcea06338d3640712b59ca623c220bb5704"

inherit pypi
inherit setuptools3
inherit native
