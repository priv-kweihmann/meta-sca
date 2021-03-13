SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "ce9aa71f2a8771727d64ad433ab2b148"
SRC_URI[sha256sum] = "e4de977d708b7024760266d827b8285e4405dce4293f25508c4556970139018a"

inherit pypi
inherit setuptools3
inherit native
