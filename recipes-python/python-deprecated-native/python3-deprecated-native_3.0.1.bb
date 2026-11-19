SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=656397bbedec0bd68b9163ff5e53032b"

DEPENDS += "\
    python3-wrapt-native \
"

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "ee36966ce5fd255333f5fd1264560b1c"
SRC_URI[sha256sum] = "2f5a9fecc9961e26462846cf1e57f73a612b1d0b79c27dceeed8de647beadcee"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer native
