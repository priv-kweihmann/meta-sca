SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "7572db2de93b348da00cdcd07852ad61"
SRC_URI[sha256sum] = "fe4444d92b17073bf1f9f24e3015a0e5bb70a645c47df93ef8a9ce8be33fcbad"

inherit pypi
inherit setuptools3
inherit native
