SUMMARY = "functions that facilitate working with various versions of Ansible 2.9 and newer"
HOMEPAGE = "https://github.com/ansible-community/ansible-compat"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4903b3cd13531fe472bdf9fe22554c0c"

DEPENDS += "\
    python3-pyyaml-native \
    python3-subprocess-tee-native \
"

PYPI_PACKAGE = "ansible-compat"

SRC_URI[sha256sum] = "4027da4ec2b524c263a801cc2dc6da2b98c2996cec258cef118a30c790467ed2"

inherit pypi
inherit setuptools3
inherit setuptools_build_meta
inherit native
