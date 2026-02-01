SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "de2493d248508420697c01a26e89859d"
SRC_URI[sha256sum] = "164759aa25575cbc0651bef59a0b18353e54300d79ace8084c818ad8ac72b7d5"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
