SUMMARY = "Simple URL parsing, canonicalization and equivalence"
HOMEPAGE = "http://github.com/nexB/urlpy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2cb2cc4130a20de8c1c89ef07b8e238d"

DEPENDS += "python3-publicsuffix2-native"

PYPI_PACKAGE = "urlpy"

SRC_URI[md5sum] = "5269297d7129cbee8022b8af4417c28b"
SRC_URI[sha256sum] = "e98ead47f4e422ca35080fd60a039f4546b7788bbba1b0a542a34c193dfba4bc"

inherit pypi
inherit setuptools3
inherit native
