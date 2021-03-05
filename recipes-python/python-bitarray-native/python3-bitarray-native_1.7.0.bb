SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "2c55df4cada265b9d1e936b4fb82ba54"
SRC_URI[sha256sum] = "e31b472ac92e04ea943723cf781ec168e15049d91a3052203defb81652d2b086"

inherit pypi
inherit setuptools3
inherit native
