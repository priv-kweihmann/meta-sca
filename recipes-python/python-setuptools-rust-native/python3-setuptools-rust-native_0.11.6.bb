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

SRC_URI[md5sum] = "319d2968f076f37279c866e51bcccbcc"
SRC_URI[sha256sum] = "a5b5954909cbc5d66b914ee6763f81fa2610916041c7266105a469f504a7c4ca"

inherit pypi
inherit setuptools3
inherit native
