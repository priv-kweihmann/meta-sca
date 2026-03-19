SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "d0ce2a36afe1d6fe7b6e188963db1b22"
SRC_URI[sha256sum] = "a729e47d418ea11d03469f321aaf67cdee8954cde3ff2cf8403ab87951ad10f2"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk
