SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS += "python3-hatch-vcs-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "2e4e42ec0ba2fff54b0d244d0b1623e86057673e57bafe72dda59c64bd5dee8b"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit python_hatchling
inherit_defer native
