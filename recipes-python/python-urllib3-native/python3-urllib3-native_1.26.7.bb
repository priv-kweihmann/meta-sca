SUMMARY = "Python HTTP library"
DESCRIPTION = "Python HTTP library with thread-safe connection pooling, file post support, sanity friendly, and more"
HOMEPAGE = "https://github.com/urllib3/urllib3"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c2823cb995439c984fd62a973d79815c"

PYPI_PACKAGE = "urllib3"

SRC_URI[md5sum] = "e0051a87a956e618a6bb514a07fa7773"
SRC_URI[sha256sum] = "4987c65554f7a2dbf30c18fd48778ef124af6fab771a377103da0585e2336ece"

inherit pypi
inherit setuptools3
inherit native
