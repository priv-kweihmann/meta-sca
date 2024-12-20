SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "23146ed7ac4403b70bd6026402468942ceba34a6732255b9edf5b7354f68a6bb"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
