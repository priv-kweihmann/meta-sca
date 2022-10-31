SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "03406f2897bc9fcfab197c4509ca0b8b"
SRC_URI[sha256sum] = "412052ac4a947f36b891143430fef4859705af11b2572fbb689f90d372cf26ab"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
