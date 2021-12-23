SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "695d34b744803d28e7d976c71a2179ea"
SRC_URI[sha256sum] = "f341ee2df0999bfdf7a95e448075effe0db212a59387de1a70690e4acb03d4c6"

inherit pypi
inherit setuptools3
inherit native
