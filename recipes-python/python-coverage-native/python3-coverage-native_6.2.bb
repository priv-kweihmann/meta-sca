SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "eca9865d8e2257f0b0144fb3a4f7f8d3"
SRC_URI[sha256sum] = "e2cad8093172b7d1595b4ad66f24270808658e11acf43a8f95b41276162eb5b8"

inherit pypi
inherit setuptools3
inherit native
