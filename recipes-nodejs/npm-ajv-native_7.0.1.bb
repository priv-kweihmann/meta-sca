SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.0.1.tgz"
SRC_URI[md5sum] = "476af839c8ea67fcff4502b83c29c66c"
SRC_URI[sha256sum] = "7cf220b666ea5f8d149e5d4d980842ac68606b5fba19f141ba321ad68d1b7223"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
