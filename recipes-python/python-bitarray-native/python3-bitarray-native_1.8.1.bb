SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "52510a2a9cebd5524344d97dfc277616"
SRC_URI[sha256sum] = "e02f79fba7a470d438eb39017d503498faaf760b17b6b46af1a9de12fd58d311"

inherit pypi
inherit setuptools3
inherit native
