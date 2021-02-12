SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.1.0.tgz"
SRC_URI[md5sum] = "033d88300d948b2d89c4b2d812ec79df"
SRC_URI[sha256sum] = "b9a543a29c0f02f8421400228286603f285f411fe2e5de32c28e45e2a9c317d2"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
