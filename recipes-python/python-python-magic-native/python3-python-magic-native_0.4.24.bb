SUMMARY = "A python wrapper for libmagic"
HOMEPAGE = "https://github.com/ahupp/python-magic"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61495c152d794e6be5799a9edca149e3"

DEPENDS += "file-native"

PYPI_PACKAGE = "python-magic"

SRC_URI[md5sum] = "7a1629d43ef506f29f2b0256510d25aa"
SRC_URI[sha256sum] = "de800df9fb50f8ec5974761054a708af6e4246b03b4bdaee993f948947b0ebcf"

inherit pypi
inherit setuptools3
inherit native
