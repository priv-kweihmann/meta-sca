SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "1fcd30f34933994b93cc08e8a52879e7"
SRC_URI[sha256sum] = "6266fde576e12357b25096351aac2b4b880b0066263e7bc7a9a1b4307991bb0e"

inherit pypi
inherit setuptools3
inherit native
