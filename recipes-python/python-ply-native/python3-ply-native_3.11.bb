SUMMARY = "Python Lex & Yacc"
HOMEPAGE = "https://github.com/dabeaz/ply"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://README.md;beginline=4;endline=33;md5=e59186804366f14c792cf7188d35108c"

PYPI_PACKAGE = "ply"

SRC_URI[md5sum] = "6465f602e656455affcd7c5734c638f8"
SRC_URI[sha256sum] = "00c7c1aaa88358b9c765b6d3000c6eec0ba42abca5351b095321aef446081da3"

inherit pypi
inherit setuptools3
inherit native
