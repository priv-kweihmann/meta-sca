SUMMARY = "NPM: stringify-entities"
DESCRIPTION = "Encode HTML character references and character entities"
HOMEPAGE = "https://github.com/wooorm/stringify-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-character-entities-html4-native \
           npm-character-entities-legacy-native"

SRC_URI = "https://registry.npmjs.org/stringify-entities/-/stringify-entities-4.0.0.tgz"
SRC_URI[md5sum] = "b0f026d81eff30554bb2929f74c65bb6"
SRC_URI[sha256sum] = "56f65c7e776b2a5477b02f5fb41249b4c060e5035d4883e0bf0877c46e1dd5ea"

NPM_PKGNAME = "stringify-entities"

inherit npmhelper
inherit native
