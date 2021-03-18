SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "c72d3bf55414ffbf92e43462ad91d508"
SRC_URI[sha256sum] = "4b8a1fb724904139149a43e172850f35aa6ea97fb0545244dc0b805e0154ed68"

inherit pypi
inherit setuptools3
inherit native
