SUMMARY = "Utility library for gitignore style pattern matching of file paths. "
DESCRIPTION = "Utility library for gitignore style pattern matching of file paths. "
HOMEPAGE = "https://github.com/cpburnz/python-path-specification"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pathspec"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "d76bc12293518c652e1c2b7fb028529e"
SRC_URI[sha256sum] = "54a5eab895d89f342b52ba2bffe70930ef9f8d96e398cccf530d21fa0516a873"
