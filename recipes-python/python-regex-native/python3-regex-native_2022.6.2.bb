SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "a2b630e676c9456b06f9f9feb0bd6166"
SRC_URI[sha256sum] = "f7b43acb2c46fb2cd506965b2d9cf4c5e64c9c612bac26c1187933c7296bf08c"

inherit pypi
inherit setuptools3
inherit native
