SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "447be4afb076c8325a7dc659aff5b931"
SRC_URI[sha256sum] = "b3ed06a9e8ac9a9aae5a6f5dbe78a8a58655d17b43b93c078f094ddc476ae297"

inherit pypi
inherit setuptools3
inherit native
