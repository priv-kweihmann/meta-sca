SUMMARY = "Setuptools rust extension plugin"
HOMEPAGE = "https://github.com/PyO3/setuptools-rust"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=011cd92e702dd9e6b1a26157b6fd53f5"

DEPENDS += "\
            python3-setuptools-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
            "

PYPI_PACKAGE = "setuptools-rust"

SRC_URI[md5sum] = "8db2fb968c015774435ecba875856daa"
SRC_URI[sha256sum] = "faacca4b85d5f43e9e3836418e1cbf9ed2576a27978b522f3d04513ef052cec5"

inherit pypi
inherit setuptools3
inherit native
