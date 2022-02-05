SUMMARY = "A python wrapper for libmagic"
HOMEPAGE = "https://github.com/ahupp/python-magic"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61495c152d794e6be5799a9edca149e3"

DEPENDS += "file-native"

PYPI_PACKAGE = "python-magic"

SRC_URI[md5sum] = "57af55974d979eed1e58965eb8a45849"
SRC_URI[sha256sum] = "21f5f542aa0330f5c8a64442528542f6215c8e18d2466b399b0d9d39356d83fc"

inherit pypi
inherit setuptools3
inherit native
