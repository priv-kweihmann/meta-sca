SUMMARY = "NPM: parse-entities"
DESCRIPTION = "Parse HTML character references: fast, spec-compliant, positional information"
HOMEPAGE = "https://github.com/wooorm/parse-entities#readme"

DEPENDS = "npm-character-entities-legacy-native npm-character-entities-native npm-character-reference-invalid-native npm-is-alphanumerical-native npm-is-decimal-native npm-is-hexadecimal-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

SRC_URI = "https://registry.npmjs.org/parse-entities/-/parse-entities-2.0.0.tgz"
SRC_URI[md5sum] = "005e6bc6a0f7513534717014e63d84bd"
SRC_URI[sha256sum] = "d6b984d3533227f1a79384c51dd3da1e9a439f1fb69a3c173e1ef8fe95cff15f"

NPM_PKGNAME = "parse-entities"

inherit npmhelper
inherit native
