SUMMARY = "a little orm"
HOMEPAGE = "https://github.com/coleifer/peewee/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a68e3ec7a6e09a43370f0a3fbc48660"

PYPI_PACKAGE = "peewee"

SRC_URI[md5sum] = "0ba150268fd8362f20a7fe1c384de2db"
SRC_URI[sha256sum] = "9e356b327c2eaec6dd42ecea6f4ddded025793dba906a3d065a0452e726c51a2"

export NO_SQLITE = "1"

inherit pypi
inherit setuptools3
inherit native
