SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "cd206281327b4c087bb20bf93cee4ab9"
SRC_URI[sha256sum] = "52ba3d3f9b942c49d7e4bc105bb28551c44065f139a65062ab7912bef10c9afb"

inherit pypi
inherit setuptools3
inherit native
