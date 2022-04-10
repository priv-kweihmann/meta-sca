SUMMARY = "NPM: ini"
DESCRIPTION = "An ini encoder/decoder for node"
HOMEPAGE = "https://github.com/npm/ini#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ini/-/ini-3.0.0.tgz"
SRC_URI[md5sum] = "9e002460e78e8a2b25f4dfca32e2b9e3"
SRC_URI[sha256sum] = "97b4784ea128e6439ab9003c2520381298192d23324fe2c022540391e7f68d3f"

NPM_PKGNAME = "ini"

inherit npmhelper
inherit native
