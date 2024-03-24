SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "bf7900329262e481be5a15f56f19736b376df6f82ed27576fa893652c5de6c23"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit setuptools3
inherit native
