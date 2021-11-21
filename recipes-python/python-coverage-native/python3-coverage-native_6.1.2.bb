SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

DEFAULT_PREFERENCE = "-1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "c9efcf40370d12efaa3e064a96f1cf64"
SRC_URI[sha256sum] = "d9a635114b88c0ab462e0355472d00a180a5fbfd8511e7f18e4ac32652e7d972"

inherit pypi
inherit setuptools3
inherit native
