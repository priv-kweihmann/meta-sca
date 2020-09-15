SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-fast-json-stable-stringify-native \
           npm-json-schema-traverse-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-6.12.5.tgz"
SRC_URI[md5sum] = "3b90ad7eae98bfc08693d2a6afc544ca"
SRC_URI[sha256sum] = "cbf766533b98b6e0d8c40049046628d7fd6154ba9edb19e4fb5a8f3f0ef95bfd"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
