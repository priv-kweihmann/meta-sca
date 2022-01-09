SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "639116edb86ff4f09ee4c5ad8f4e0bb4"
SRC_URI[sha256sum] = "60285184cb02fdba5e1cc8605ac84e150a50f940e9383ab43564e5258d1f47bb"

inherit pypi
inherit setuptools3
inherit native
