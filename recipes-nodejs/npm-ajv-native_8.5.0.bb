SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.5.0.tgz"
SRC_URI[md5sum] = "dfa88f0a806874659f4cf97c2da2fcd0"
SRC_URI[sha256sum] = "aa4a196a1cc2a0aa015dae462721aff31235b164a08e81b14a0095804dabb4da"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
