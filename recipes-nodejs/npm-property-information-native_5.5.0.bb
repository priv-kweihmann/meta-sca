SUMMARY = "NPM: property-information"
DESCRIPTION = "Information for HTML properties"
HOMEPAGE = "https://github.com/wooorm/property-information#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/property-information/-/property-information-5.5.0.tgz"
SRC_URI[md5sum] = "e65fb154305eb9e0c31ae7c659ba5fea"
SRC_URI[sha256sum] = "b812fb58f9211aaf527e22146df8a42b16ad48701915bf1bd6663bdd5221e299"

NPM_PKGNAME = "property-information"

inherit npmhelper
inherit native
