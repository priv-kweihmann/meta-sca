SUMMARY = "Mypyc runtime library"
HOMEPAGE = "https://github.com/mypyc/librt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42baf4796d8073a1896b15d602af78f6"

SRC_URI[sha256sum] = "1a4ede613941d9c3470b0368be851df6bb78ab218635512d0370b27a277a0862"

inherit pypi python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "librt"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
"
