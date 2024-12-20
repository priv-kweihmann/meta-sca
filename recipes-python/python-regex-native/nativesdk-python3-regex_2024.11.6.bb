SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "02b86394591ba39d34bc35d11e9e7d96"
SRC_URI[sha256sum] = "7ab159b063c52a0333c884e4679f8d7a85112ee3078fe3d9004b2dd875585519"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk
