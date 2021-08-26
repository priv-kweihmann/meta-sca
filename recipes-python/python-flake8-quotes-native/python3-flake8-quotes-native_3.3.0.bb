SUMMARY = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-quotes"

SRC_URI[md5sum] = "c4882f8ce6190e6494c6e44eee0775bd"
SRC_URI[sha256sum] = "f1dd87830ed77ff2ce47fc0ee0fd87ae20e8f045355354ffbf4dcaa18d528217"

inherit pypi
inherit setuptools3
inherit native
