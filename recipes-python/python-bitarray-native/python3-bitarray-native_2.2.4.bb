SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "66c57cebd4b88b7f6054ee01fb25705f"
SRC_URI[sha256sum] = "0a7416a147eba80d7e7b46a9c8898371edcb033ca68b0332b6c7b240cc321258"

inherit pypi
inherit setuptools3
inherit native
