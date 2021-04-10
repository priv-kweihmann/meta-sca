SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "6dd8fd31c767c2991816b965e5decca1"
SRC_URI[sha256sum] = "d7a49d21ae04c5af195023b140800186ebf208e3a4fc5b21a1389531cb7a7170"

inherit pypi
inherit setuptools3
inherit native
