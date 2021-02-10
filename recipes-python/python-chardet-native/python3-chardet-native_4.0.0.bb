DESCRIPTION = "Python 2/3 compatible character encoding detector"
HOMEPAGE = "https://github.com/chardet/chardet"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6f89e2100d9b6cdffcea4f398e37343"

PYPI_PACKAGE = "chardet"

SRC_URI[md5sum] = "bc9a5603d8d0994b2d4cbf255f99e654"
SRC_URI[sha256sum] = "0d6f53a15db4120f2b08c94f11e7d93d2c911ee118b6b30a04ec3ee8310179fa"

inherit pypi
inherit setuptools3
inherit native
