SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "aea00ceb50ae31b8d717f387bd26ff06"
SRC_URI[sha256sum] = "ee13850d3237c254c7af8acce2f1a044a1c4f22dcec5380cba7443c8be38f701"

inherit pypi
inherit setuptools3
inherit native
