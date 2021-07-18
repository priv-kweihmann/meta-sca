SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "99bfbc6c6c15f6c7cbf7e2ca826e473e"
SRC_URI[sha256sum] = "5ed37f0482199de5a3e096405a646ab3f45dd020d234c42539b3c11ea0e2278d"

inherit pypi
inherit setuptools3
inherit native
