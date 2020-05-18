SUMMARY = "NPM: strip-bom"
DESCRIPTION = "Strip UTF-8 byte order mark (BOM) from a string"
HOMEPAGE = "https://github.com/sindresorhus/strip-bom#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/strip-bom/-/strip-bom-4.0.0.tgz"
SRC_URI[md5sum] = "ba5ded28e859d1030ed2f1369e379f67"
SRC_URI[sha256sum] = "8880c5faaa4073b8236a50470b966eecf11ee63d5026299e4bb21e5147e3dcab"

NPM_PKGNAME = "strip-bom"

inherit npmhelper
inherit native
