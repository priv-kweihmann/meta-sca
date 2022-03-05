SUMMARY = "Read & write Java .properties files"
HOMEPAGE = "https://github.com/jwodder/javaproperties"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=731e3f36ccd931c8aa8b40c94ad267af"

SRC_URI[sha256sum] = "9dcba389effe67d3f906bbdcc64b8ef2ee8eac00072406784ea636bb6ba56061"

PYPI_PACKAGE = "javaproperties"

inherit pypi
inherit setuptools_build_meta
inherit native
