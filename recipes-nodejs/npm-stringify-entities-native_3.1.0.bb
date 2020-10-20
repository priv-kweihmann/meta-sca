SUMMARY = "NPM: stringify-entities"
DESCRIPTION = "Encode HTML character references and character entities"
HOMEPAGE = "https://github.com/wooorm/stringify-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-character-entities-html4-native \
           npm-character-entities-legacy-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/stringify-entities/-/stringify-entities-3.1.0.tgz"
SRC_URI[md5sum] = "7d71679b87d65a15b302bd5c178d3dcd"
SRC_URI[sha256sum] = "e111e700c86084c6abd9c1d63edcdd40a72a6f2a4b3b8c5504ff389bef14f583"

NPM_PKGNAME = "stringify-entities"

inherit npmhelper
inherit native
