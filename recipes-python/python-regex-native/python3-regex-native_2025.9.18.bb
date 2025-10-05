SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "04290f5110e06884d5092aa03470a3ad"
SRC_URI[sha256sum] = "c5ba23274c61c6fef447ba6a39333297d0c247f53059dba0bca415cac511edc4"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
