SUMMARY = "NPM: escalade"
DESCRIPTION = "A tiny (183B to 210B) and fast utility to ascend parent directories"
HOMEPAGE = "https://github.com/lukeed/escalade#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=1cb46128f91146188c0ded3a1c6144f3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escalade/-/escalade-3.1.0.tgz"
SRC_URI[md5sum] = "6eb7b0919936f729f8c781f3a338c7a5"
SRC_URI[sha256sum] = "a652b7b304c88f211508e4f5d482fbfdac5da8d5390f8116307e2bce10aaf085"

NPM_PKGNAME = "escalade"

inherit npmhelper
inherit native
