SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "3f07d8af1b76433ce2fdd73666147c37"
SRC_URI[sha256sum] = "0edf630a4471a48627aec0b840cf3b8e10901191d328f6511560420459de282e"

inherit pypi
inherit setuptools3
inherit native
