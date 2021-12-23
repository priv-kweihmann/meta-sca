SUMMARY = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-quotes"

SRC_URI[md5sum] = "a869b032d893d28cf63ad1451f8778ad"
SRC_URI[sha256sum] = "633adca6fb8a08131536af0d750b44d6985b9aba46f498871e21588c3e6f525a"

inherit pypi
inherit setuptools3
inherit native
