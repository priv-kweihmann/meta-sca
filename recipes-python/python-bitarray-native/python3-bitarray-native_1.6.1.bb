SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "a082075dbae478fb53c69e25cc7f9cd6"
SRC_URI[sha256sum] = "ab85b38365dd9956264226b30dababa02161ed49bb36c7ee82cc6545e07b1599"

inherit pypi
inherit native
inherit setuptools3
