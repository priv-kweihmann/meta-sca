SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "49a3c230c78bc062a691ef88cb267df4"
SRC_URI[sha256sum] = "21f2e10420f9ae74d3bdfd3cb74947ddbe9fbc0b2e5662f2f039001954f1d8b6"

inherit pypi
inherit setuptools3
inherit native
