SUMMARY = "Persistent/Immutable/Functional data structures for Python"
HOMEPAGE = "https://github.com/tobgu/pyrsistent"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.mit;md5=a4b94c2b800b582a8d3925a9939cbf44"

PYPI_PACKAGE = "pyrsistent"

SRC_URI[md5sum] = "1b335355d3eb40d0870988a1a41894b3"
SRC_URI[sha256sum] = "773c781216f8c2900b42a7b638d5b517bb134ae1acbebe4d1e8f1f41ea60eb4b"

inherit pypi
inherit setuptools3
inherit native
