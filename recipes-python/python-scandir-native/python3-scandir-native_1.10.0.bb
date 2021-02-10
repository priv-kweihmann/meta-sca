SUMMARY = "Better directory iterator and faster os.walk()"
HOMEPAGE = "https://github.com/benhoyt/scandir"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=482ee62da51806409d432a80eed4e3ea"

PYPI_PACKAGE = "scandir"

SRC_URI[md5sum] = "f8378f4d9f95a6a78e97ab01aa900c1d"
SRC_URI[sha256sum] = "4d4631f6062e658e9007ab3149a9b914f3548cb38bfb021c64f39a025ce578ae"

inherit pypi
inherit setuptools3
inherit native
