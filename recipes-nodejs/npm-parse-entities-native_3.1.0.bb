SUMMARY = "NPM: parse-entities"
DESCRIPTION = "Parse HTML character references"
HOMEPAGE = "https://github.com/wooorm/parse-entities#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-character-entities-legacy-native \
           npm-character-entities-native \
           npm-character-reference-invalid-native \
           npm-is-alphanumerical-native \
           npm-is-decimal-native \
           npm-is-hexadecimal-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/parse-entities/-/parse-entities-3.1.0.tgz"
SRC_URI[md5sum] = "552abc0521aa967697531b00840f33d4"
SRC_URI[sha256sum] = "d43a63a456fb660536d29279392f4796ef3a625d242b58e70abcb6656c648810"

NPM_PKGNAME = "parse-entities"

inherit npmhelper
inherit native
