SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "c8621b41d5ae7fbad3c09284620b9c26"
SRC_URI[sha256sum] = "c45eeefaa600f6f2f6843fc4699869ae5d7c1e8b8fb58ff380584ce9bc7a7082"

inherit pypi
inherit setuptools3
inherit native
