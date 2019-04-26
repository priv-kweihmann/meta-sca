SUMMARY = "Utility library for gitignore style pattern matching of file paths. "
DESCRIPTION = "Utility library for gitignore style pattern matching of file paths. "
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pathspec"

inherit pypi

FILES_${PN} += "${datadir}/pathspec"

inherit native
