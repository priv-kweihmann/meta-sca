SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "10281013791f1d68844e14aa77a33690"
SRC_URI[sha256sum] = "3bfdb59ded15c961e6e3d5b7f167155cda053be2475ea8017461df0b4d820b7d"

inherit pypi
inherit setuptools3
inherit native
