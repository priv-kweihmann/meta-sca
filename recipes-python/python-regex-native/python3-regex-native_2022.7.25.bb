SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "7c20d099e41212a24ddb2777894655fc"
SRC_URI[sha256sum] = "bd0883e86964cd61360ffc36dbebbc49b928e92a306f886eab02c11dfde5b7aa"

inherit pypi
inherit setuptools3
inherit native
