SUMMARY = "Python HTTP library"
DESCRIPTION = "Python HTTP library with thread-safe connection pooling, file post support, sanity friendly, and more"
HOMEPAGE = "https://github.com/urllib3/urllib3"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ea114851ad9a8c311aac8728a681a067"

PYPI_PACKAGE = "urllib3"

UPSTREAM_CHECK_REGEX = "/${PYPI_PACKAGE}/(?P<pver>1\.21\.\d+)"

SRC_URI[md5sum] = "ef6c72c79b9c6bcd68c204f9b92abc86"
SRC_URI[sha256sum] = "b14486978518ca0901a76ba973d7821047409d7f726f22156b24e83fd71382a5"

inherit pypi
inherit setuptools3
inherit native
