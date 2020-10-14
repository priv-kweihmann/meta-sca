SUMMARY = "NPM: property-information"
DESCRIPTION = "Information for HTML properties"
HOMEPAGE = "https://github.com/wooorm/property-information#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/property-information/-/property-information-5.6.0.tgz"
SRC_URI[md5sum] = "8a9b8bbc61ad36dc8a5c635031b9bded"
SRC_URI[sha256sum] = "50829cc14003ccababc0738caab4035193685520e824a82bccf92f14143cac68"

NPM_PKGNAME = "property-information"

inherit npmhelper
inherit native
