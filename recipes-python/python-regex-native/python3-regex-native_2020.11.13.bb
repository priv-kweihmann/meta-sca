SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "4310bfc300d49224476fcd032a8ce5f7"
SRC_URI[sha256sum] = "83d6b356e116ca119db8e7c6fc2983289d87b27b3fac238cfe5dca529d884562"

inherit pypi
inherit setuptools3
inherit native
