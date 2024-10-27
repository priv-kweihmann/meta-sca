SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "eb1ee355aa2557bd3d0145de7b06b2a45b0ce461e1e7813f5d066039ab4177b4"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
