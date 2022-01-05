SUMMARY = "The Real First Universal Charset Detector"
HOMEPAGE = "https://github.com/ousret/charset_normalizer"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

PYPI_PACKAGE = "charset-normalizer"

SRC_URI[sha256sum] = "876d180e9d7432c5d1dfd4c5d26b72f099d503e8fcc0feb7532c9289be60fcbd"

inherit pypi
inherit setuptools3
inherit native
