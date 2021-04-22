SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "06aede2ebac9d261cb0865c69efc40af"
SRC_URI[sha256sum] = "ec3a4f6d711a79ed23aea9541638d3353dc3f083f293a13180b14b482e3e19ef"

inherit pypi
inherit setuptools3
inherit native
