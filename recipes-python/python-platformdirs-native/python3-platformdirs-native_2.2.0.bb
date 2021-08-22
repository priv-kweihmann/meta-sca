SUMMARY = "A small Python module for determining appropriate platform-specific dirs"
HOMEPAGE = "https://github.com/platformdirs/platformdirs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=282c970bb844954c8535dd6e9733db7f"

PYPI_PACKAGE = "platformdirs"

SRC_URI[md5sum] = "aaf02d3d87404767abc335d4bd4536e8"
SRC_URI[sha256sum] = "632daad3ab546bd8e6af0537d09805cec458dce201bccfe23012df73332e181e"

inherit pypi
inherit setuptools3
inherit native
