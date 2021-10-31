SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "e2a602b2605d69f8c2efb949ee1c0de9"
SRC_URI[sha256sum] = "f3f9a91d3cc5e5b0ddf1043c0ae5fa4852f18a1c0050318baf5fc7930ecc1f9c"

inherit pypi
inherit setuptools3
inherit native
