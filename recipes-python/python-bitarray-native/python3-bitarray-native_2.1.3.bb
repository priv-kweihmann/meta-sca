SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "1230ee19501d82427a2b9ee773f7e124"
SRC_URI[sha256sum] = "a24aff72a7f1b09571b5daf9dbfcffd98481be1fe085ae5ef662cf11452a97e0"

inherit pypi
inherit setuptools3
inherit native
