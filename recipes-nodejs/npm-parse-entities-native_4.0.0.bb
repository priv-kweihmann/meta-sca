SUMMARY = "NPM: parse-entities"
DESCRIPTION = "Parse HTML character references"
HOMEPAGE = "https://github.com/wooorm/parse-entities#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-character-entities-legacy-native \
           npm-character-entities-native \
           npm-character-reference-invalid-native \
           npm-decode-named-character-reference-native \
           npm-is-alphanumerical-native \
           npm-is-decimal-native \
           npm-is-hexadecimal-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/parse-entities/-/parse-entities-4.0.0.tgz"
SRC_URI[md5sum] = "b6c06ed39970a03ff40bcb057a40b44b"
SRC_URI[sha256sum] = "a60d950a8108f32b5f7ef95eaaf313af7983764ac27892ae6addc2cd13d74e92"

NPM_PKGNAME = "parse-entities"

inherit npmhelper
inherit native
