SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "7857d00b36dfdc1ad7727ebe7d57fe45"
SRC_URI[sha256sum] = "601c99ac775b6c89699a48976f3dbb000b47d3ca59362c8abc9582e6d0780d91"

inherit pypi
inherit setuptools3
inherit native
