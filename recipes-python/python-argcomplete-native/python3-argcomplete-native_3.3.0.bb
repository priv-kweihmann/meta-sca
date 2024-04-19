SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "fd03ff4a5b9e6580569d34b273f741e85cd9e072f3feeeee3eba4891c70eda62"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit setuptools3
inherit native
