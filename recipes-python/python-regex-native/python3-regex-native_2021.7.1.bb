SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "ff0c55bd7160a8b9295f43ee830527f7"
SRC_URI[sha256sum] = "849802379a660206277675aa5a5c327f5c910c690649535863ddf329b0ba8c87"

inherit pypi
inherit setuptools3
inherit native
