SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "9b4486cceb3141277f345e930e91966f"
SRC_URI[sha256sum] = "92183e9180c392371079262879c6532ccf55f808e6900df5d9f03c9ca8807255"

inherit pypi
inherit setuptools3
inherit native
