SUMMARY = "NPM: stringify-entities"
DESCRIPTION = "Encode HTML character references and character entities"
HOMEPAGE = "https://github.com/wooorm/stringify-entities#readme"

DEPENDS = "npm-character-entities-html4-native npm-character-entities-legacy-native npm-is-alphanumerical-native npm-is-decimal-native npm-is-hexadecimal-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

SRC_URI = "https://registry.npmjs.org/stringify-entities/-/stringify-entities-3.0.1.tgz"
SRC_URI[md5sum] = "3e44bc64df2afe5cadca593b080300e7"
SRC_URI[sha256sum] = "a017f96e86e915bd85f865f5fdf8f80827dfd16f533aa8f2a2edbb47e4a367a6"

NPM_PKGNAME = "stringify-entities"

inherit npmhelper
inherit native
