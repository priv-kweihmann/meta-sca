SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "bdaa4e5230465a8453ceef8cfd3ebc59"
SRC_URI[sha256sum] = "97224a19325ecee49a3bf4df3ee0531d3af9cf288b67d089a7ef44a3c4ea3839"

inherit pypi
inherit setuptools3
inherit native
