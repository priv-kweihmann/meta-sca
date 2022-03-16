SUMMARY = "Find ROP exploitation pattern"
DESCRIPTION = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation"
HOMEPAGE = "https://github.com/JonathanSalwan/ROPgadget"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += "\
            python3-capstone-native \
            python3-native \
           "

SRC_URI[sha256sum] = "a048f2e51c397b902e4586997bd4fe62af97984e207567cb63e67d86e8e09c8e"

PYPI_PACKAGE = "ROPGadget"

inherit sca-description
inherit pypi
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "ropgadget"
