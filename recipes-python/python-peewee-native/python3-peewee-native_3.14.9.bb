SUMMARY = "a little orm"
HOMEPAGE = "https://github.com/coleifer/peewee/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a68e3ec7a6e09a43370f0a3fbc48660"

PYPI_PACKAGE = "peewee"

SRC_URI[md5sum] = "53df1fa8049525a553434890da4c65e5"
SRC_URI[sha256sum] = "69c1b88dc89b184231cc1ce6df241075aca5cec43e89749cc4a63108f9ceea47"

export NO_SQLITE = "1"

inherit pypi
inherit setuptools3
inherit native
