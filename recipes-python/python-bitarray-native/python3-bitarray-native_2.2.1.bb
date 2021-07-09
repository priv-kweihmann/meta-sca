SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "e419a9836c7736098e4e9034bf095f8a"
SRC_URI[sha256sum] = "31b40d716a1f0642ea9e2741c29b756299075db2e1d1ebe750e3e2c1469f589d"

inherit pypi
inherit setuptools3
inherit native
