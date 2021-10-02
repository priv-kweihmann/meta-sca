SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "bb92e04b62c808d28a51d7f7d21acb51"
SRC_URI[sha256sum] = "81e125d9ba54c34579e4539a967e976a3c56150796674aec318b1b2f49251be7"

inherit pypi
inherit setuptools3
inherit native
