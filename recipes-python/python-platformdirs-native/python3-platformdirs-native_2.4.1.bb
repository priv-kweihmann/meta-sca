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

SRC_URI[md5sum] = "861f5c87f1b5db13714db1849d6e4092"
SRC_URI[sha256sum] = "440633ddfebcc36264232365d7840a970e75e1018d15b4327d11f91909045fda"

inherit pypi
inherit setuptools3
inherit native
