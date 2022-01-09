SUMMARY = "Python HTTP library"
DESCRIPTION = "Python HTTP library with thread-safe connection pooling, file post support, sanity friendly, and more"
HOMEPAGE = "https://github.com/urllib3/urllib3"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c2823cb995439c984fd62a973d79815c"

PYPI_PACKAGE = "urllib3"

SRC_URI[md5sum] = "50831ca7b19bbe2781abb0a4c2d51760"
SRC_URI[sha256sum] = "0e7c33d9a63e7ddfcb86780aac87befc2fbddf46c58dbb487e0855f7ceec283c"

inherit pypi
inherit setuptools3
inherit native
