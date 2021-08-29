SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "a8fc8b98b30f816eda5ed5c351ab6c9d"
SRC_URI[sha256sum] = "f585cbbeecb35f35609edccb95efd95a3e35824cd7752b586503f7e6087303f1"

inherit pypi
inherit setuptools3
inherit native
