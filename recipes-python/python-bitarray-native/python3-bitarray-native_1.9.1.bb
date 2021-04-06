SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "c7e9450fbd99bee94dc2d53404da3e87"
SRC_URI[sha256sum] = "ec99acc1b18f99b7e9d0b77766b99f80b3c42d4e83306334deef9745b41a2079"

inherit pypi
inherit setuptools3
inherit native
