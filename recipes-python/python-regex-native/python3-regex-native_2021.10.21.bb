SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "278daed9ff4a48b17ad21c0e3ce8c1fb"
SRC_URI[sha256sum] = "4832736b3f24617e63dc919ce8c4215680ba94250a5d9e710fcc0c5f457b5028"

inherit pypi
inherit setuptools3
inherit native
