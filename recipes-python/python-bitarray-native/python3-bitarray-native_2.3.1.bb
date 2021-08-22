SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "a08e368efba7c49f34f1310bbba2e3bc"
SRC_URI[sha256sum] = "4203cdb44d77eb30a745e6576c82b7e33681f134b338105256f77e71dbd330dd"

inherit pypi
inherit setuptools3
inherit native
