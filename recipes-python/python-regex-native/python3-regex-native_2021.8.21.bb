SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "58021792187208874ceb8d68ca026f94"
SRC_URI[sha256sum] = "faf08b0341828f6a29b8f7dd94d5cf8cc7c39bfc3e67b78514c54b494b66915a"

inherit pypi
inherit setuptools3
inherit native
