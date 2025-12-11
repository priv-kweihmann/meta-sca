SUMMARY = "Mypyc runtime library"
HOMEPAGE = "https://github.com/mypyc/librt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42baf4796d8073a1896b15d602af78f6"

SRC_URI[sha256sum] = "3ec50cf65235ff5c02c5b747748d9222e564ad48597122a361269dd3aa808798"

inherit pypi python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "librt"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
"
