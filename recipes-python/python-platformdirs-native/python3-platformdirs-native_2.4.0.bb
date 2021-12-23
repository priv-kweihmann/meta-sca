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

SRC_URI[md5sum] = "4e5b836d19600cc4bf0b789ab1de3b51"
SRC_URI[sha256sum] = "367a5e80b3d04d2428ffa76d33f124cf11e8fff2acdaa9b43d545f5c7d661ef2"

inherit pypi
inherit setuptools3
inherit native
