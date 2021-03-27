SUMMARY = "NPM: parse-entities"
DESCRIPTION = "Parse HTML character references: fast, spec-compliant, positional information"
HOMEPAGE = "https://github.com/wooorm/parse-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-character-entities-legacy-native \
           npm-character-entities-native \
           npm-character-reference-invalid-native \
           npm-is-alphanumerical-native \
           npm-is-decimal-native \
           npm-is-hexadecimal-native"

SRC_URI = "https://registry.npmjs.org/parse-entities/-/parse-entities-3.0.0.tgz"
SRC_URI[md5sum] = "f2a69a80cd12e822877d8e66d9255df2"
SRC_URI[sha256sum] = "b94598387ea056619c0e30acdbb59d15a1ae12f389786916a8cbd6c30bd6ec0b"

NPM_PKGNAME = "parse-entities"

inherit npmhelper
inherit native
