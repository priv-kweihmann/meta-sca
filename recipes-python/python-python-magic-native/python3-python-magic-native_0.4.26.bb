SUMMARY = "A python wrapper for libmagic"
HOMEPAGE = "https://github.com/ahupp/python-magic"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61495c152d794e6be5799a9edca149e3"

DEPENDS += "file-native"

PYPI_PACKAGE = "python-magic"

SRC_URI[md5sum] = "861b7f92dfea3e825a305d652d96bb93"
SRC_URI[sha256sum] = "8262c13001f904ad5b724d38b5e5b5f17ec0450ae249def398a62e4e33108a50"

inherit pypi
inherit setuptools3
inherit native
