SUMMARY = "NPM: ini"
DESCRIPTION = "An ini encoder/decoder for node"
HOMEPAGE = "https://github.com/isaacs/ini#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ini/-/ini-1.3.6.tgz"
SRC_URI[md5sum] = "4e495150290ae9b4cd08c5b811798dd8"
SRC_URI[sha256sum] = "20dca0a306e5d836e81ae4471b6f6e9d73f1256b7941ae711bf215c1c4965a4f"

NPM_PKGNAME = "ini"

inherit npmhelper
inherit native
