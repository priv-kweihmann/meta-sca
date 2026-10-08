SUMMARY = "Mypyc runtime library"
HOMEPAGE = "https://github.com/mypyc/librt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42baf4796d8073a1896b15d602af78f6"

SRC_URI[sha256sum] = "ac38d6d8d66bf3d744148dbbc0b8e193e195a51e364ed55e224631f5721891fc"

inherit pypi python_setuptools_build_meta
inherit_defer nativesdk

PYPI_PACKAGE = "librt"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
"
