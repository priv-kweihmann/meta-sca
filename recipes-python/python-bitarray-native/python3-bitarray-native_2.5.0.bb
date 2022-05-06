SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "9f80f324cf478c5e0150c93923ce9af4"
SRC_URI[sha256sum] = "5abed04adcd2031f6e714993d95223bf9ae85354c640c270b2ed6f46b83573ba"

inherit pypi
inherit setuptools3
inherit native
