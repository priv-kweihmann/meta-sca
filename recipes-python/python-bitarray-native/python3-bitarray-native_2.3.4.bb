SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "afe4071ec397a5027e4faef616e309f5"
SRC_URI[sha256sum] = "f19c62425576d3d1821ed711b94d1a4e5ede8f05ca121e99b6d978ed49c7a765"

inherit pypi
inherit setuptools3
inherit native
