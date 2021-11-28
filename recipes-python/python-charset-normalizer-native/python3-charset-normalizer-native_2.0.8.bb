SUMMARY = "The Real First Universal Charset Detector"
HOMEPAGE = "https://github.com/ousret/charset_normalizer"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

PYPI_PACKAGE = "charset-normalizer"

SRC_URI[sha256sum] = "735e240d9a8506778cd7a453d97e817e536bb1fc29f4f6961ce297b9c7a917b0"

inherit pypi
inherit setuptools3
inherit native
