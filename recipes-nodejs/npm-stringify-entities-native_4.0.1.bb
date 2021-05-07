SUMMARY = "NPM: stringify-entities"
DESCRIPTION = "Encode HTML character references and character entities"
HOMEPAGE = "https://github.com/wooorm/stringify-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-character-entities-html4-native \
           npm-character-entities-legacy-native"

SRC_URI = "https://registry.npmjs.org/stringify-entities/-/stringify-entities-4.0.1.tgz"
SRC_URI[md5sum] = "b39647d4010d39508373b9c33796eba2"
SRC_URI[sha256sum] = "34a757278f10b22c04ad9277714da0cae5b2fd76a78e576b455021520d6a774c"

NPM_PKGNAME = "stringify-entities"

inherit npmhelper
inherit native
