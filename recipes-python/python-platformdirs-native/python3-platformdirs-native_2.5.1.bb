SUMMARY = "A small Python module for determining appropriate platform-specific dirs"
HOMEPAGE = "https://github.com/platformdirs/platformdirs"

DEPENDS += " \
    python3-setuptools-scm-native \
    python3-toml-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=282c970bb844954c8535dd6e9733db7f"

PYPI_PACKAGE = "platformdirs"

SRC_URI[md5sum] = "83d3ce3feb4af1ccfaca24375574f44d"
SRC_URI[sha256sum] = "7535e70dfa32e84d4b34996ea99c5e432fa29a708d0f4e394bbcb2a8faa4f16d"

inherit pypi
inherit setuptools3
inherit native
