SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "439dbe4ad373d94081cb93db624bbe3d"
SRC_URI[sha256sum] = "f07373b6e56a6f3a0df3d75b651a278ca7bd357a796078a26a958ea1ce0588fd"

inherit pypi
inherit setuptools3
inherit native
