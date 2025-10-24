SUMMARY = "A fast, extensible Markdown parser in pure Python."
HOMEPAGE = "https://github.com/miyuchina/mistletoe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57943b291c8e54f0e5b648dc17a6f76c"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "68b73be68bf8075ec882e035176d5c379d0d7f3401392c6f39c2cc9cd3264d44"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "mistletoe"
