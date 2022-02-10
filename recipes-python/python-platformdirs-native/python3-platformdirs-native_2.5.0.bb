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

SRC_URI[md5sum] = "6ada979615bc229d187792c27546de1d"
SRC_URI[sha256sum] = "8ec11dfba28ecc0715eb5fb0147a87b1bf325f349f3da9aab2cd6b50b96b692b"

inherit pypi
inherit setuptools3
inherit native
