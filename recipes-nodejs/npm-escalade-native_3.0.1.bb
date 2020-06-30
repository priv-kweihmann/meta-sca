SUMMARY = "NPM: escalade"
DESCRIPTION = "A tiny (183B to 210B) and fast utility to ascend parent directories"
HOMEPAGE = "https://github.com/lukeed/escalade#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=1cb46128f91146188c0ded3a1c6144f3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escalade/-/escalade-3.0.1.tgz"
SRC_URI[md5sum] = "ffaaf2c81b6e16ad1050a67ce2fc657e"
SRC_URI[sha256sum] = "958e3deafe17a971fb4dc461e54b202e9f9bac559bc2b965802fc40e0e7ed5a6"

NPM_PKGNAME = "escalade"

inherit npmhelper
inherit native
