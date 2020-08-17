SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-fast-json-stable-stringify-native \
           npm-json-schema-traverse-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-6.12.4.tgz"
SRC_URI[md5sum] = "ad669f06fcd541ab1ceae4dfba93770a"
SRC_URI[sha256sum] = "028946dddc6808b8eddb02e3cf42275f9997697e3b8e62e4a7fab6d2dedd6fce"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
