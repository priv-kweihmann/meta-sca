SUMMARY = "NPM: map-age-cleaner"
DESCRIPTION = "Automatically cleanup expired items in a Map"
HOMEPAGE = "https://github.com/SamVerschueren/map-age-cleaner#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a775f12cfff35aa8881152fa96fb8d0a"

DEPENDS = "npm-p-defer-native"

SRC_URI = "https://registry.npmjs.org/map-age-cleaner/-/map-age-cleaner-0.2.0.tgz"
SRC_URI[md5sum] = "d3ef1d7984121b7e5e6f0b21f7648cc0"
SRC_URI[sha256sum] = "56f9709b2de55bed367c59982d861a9d3d4291ee0a46a9fde9cbcc2dbf6ca975"

NPM_PKGNAME = "map-age-cleaner"

inherit npmhelper
inherit native
