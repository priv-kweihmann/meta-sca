SUMMARY = "Setuptools rust extension plugin"
HOMEPAGE = "https://github.com/PyO3/setuptools-rust"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=011cd92e702dd9e6b1a26157b6fd53f5"

DEPENDS += "\
            python3-setuptools-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
            "

PYPI_PACKAGE = "setuptools-rust"

SRC_URI[md5sum] = "33c3fd3bcde2877483ab782353bee54c"
SRC_URI[sha256sum] = "647009e924f0ae439c7f3e0141a184a69ad247ecb9044c511dabde232d3d570e"

inherit pypi
inherit setuptools3
inherit native
