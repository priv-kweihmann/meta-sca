SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS += "python3-hatch-vcs-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "62e8ed4fd6a45864acc8235409461b72c9a28ee785a2011cc5eb78318786c89c"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit python_hatchling
inherit_defer native
