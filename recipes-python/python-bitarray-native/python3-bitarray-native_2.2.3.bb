SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "514c16abe01a86ce96727b3cfb5d329f"
SRC_URI[sha256sum] = "b5d707d9c4aa75e684e21ff1848b234f3d2ff41d5038db89e2465e5527f90c68"

inherit pypi
inherit setuptools3
inherit native
