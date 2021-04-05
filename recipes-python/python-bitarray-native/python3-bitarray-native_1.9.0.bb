SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "63034bdfa8904a92fdd32462d90da0ba"
SRC_URI[sha256sum] = "db00073387af7fe30852d96b04742a0cdbc7feaf3158558520ab7898b0435ee2"

inherit pypi
inherit setuptools3
inherit native
