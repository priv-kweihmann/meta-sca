SUMMARY = "a little orm"
HOMEPAGE = "https://github.com/coleifer/peewee/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a68e3ec7a6e09a43370f0a3fbc48660"

PYPI_PACKAGE = "peewee"

SRC_URI[md5sum] = "2be1e52cad39bbb95b1a2bcd21d9c24d"
SRC_URI[sha256sum] = "23271422b332c82d30c92597dee905ee831b56c6d99c33e05901e6891c75fe15"

export NO_SQLITE = "1"

inherit pypi
inherit setuptools3
inherit native
