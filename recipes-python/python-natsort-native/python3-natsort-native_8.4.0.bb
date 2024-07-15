SUMMARY = "Simple yet flexible natural sorting in Python."
HOMEPAGE = "https://github.com/SethMMorton/natsort"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32431d1b650010945da4e078011c8fa"

DEPENDS += "\
    python3-typing-extensions-native \
"

SRC_URI[sha256sum] = "45312c4a0e5507593da193dedd04abb1469253b601ecaf63445ad80f0a1ea581"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "natsort"
