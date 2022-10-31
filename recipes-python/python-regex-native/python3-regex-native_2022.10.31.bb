SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "a85ced10be8bfe76fed4f30c42d32d5c"
SRC_URI[sha256sum] = "a3a98921da9a1bf8457aeee6a551948a83601689e5ecdd736894ea9bbec77e83"

inherit pypi
inherit setuptools3
inherit native
