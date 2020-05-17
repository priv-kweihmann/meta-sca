SUMMARY = "NPM: map-age-cleaner"
DESCRIPTION = "Automatically cleanup expired items in a Map"
HOMEPAGE = "https://github.com/SamVerschueren/map-age-cleaner#readme"

DEPENDS = "npm-p-defer-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a775f12cfff35aa8881152fa96fb8d0a"

SRC_URI = "https://registry.npmjs.org/map-age-cleaner/-/map-age-cleaner-0.1.3.tgz"
SRC_URI[md5sum] = "249ab4f0e12495ae4bb44fe44dcf6bff"
SRC_URI[sha256sum] = "0fc717582e2eebb184829f4b79ad3dc09a3c7799ee576420681034dfaebcea80"

NPM_PKGNAME = "map-age-cleaner"

inherit npmhelper
inherit native
