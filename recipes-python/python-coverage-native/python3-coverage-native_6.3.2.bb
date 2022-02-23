SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "c306f8112ca0192ee31ce09e806f90d0"
SRC_URI[sha256sum] = "03e2a7826086b91ef345ff18742ee9fc47a6839ccd517061ef8fa1976e652ce9"

inherit pypi
inherit setuptools3
inherit native
