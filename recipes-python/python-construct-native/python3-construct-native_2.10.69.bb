SUMMARY = "A powerful declarative symmetric parser/builder for binary data"
HOMEPAGE = "https://github.com/construct/construct"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=202b39559c1c79fe4715ce81e9e0ac02"

PYPI_PACKAGE = "construct"

SRC_URI[sha256sum] = "08573d1573827a6fe6b846756d54270650e221a6cec6a72e06b582cde775599e"

inherit pypi
inherit setuptools3
inherit native
