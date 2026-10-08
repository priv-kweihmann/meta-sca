SUMMARY = "Python @deprecated decorator to deprecate old classes, functions or methods"
HOMEPAGE = "https://github.com/tantale/deprecated"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=656397bbedec0bd68b9163ff5e53032b"

DEPENDS += "\
    python3-wrapt-native \
"

PYPI_PACKAGE = "Deprecated"

SRC_URI[md5sum] = "c4b5257eacc1ecfb22212b910079dc37"
SRC_URI[sha256sum] = "16850204d3a1e6bb0acd06bff48d96e8b0a0d25d1c52f71705405a0f4894192d"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer native
