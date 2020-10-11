SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-fast-json-stable-stringify-native \
           npm-json-schema-traverse-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-6.12.6.tgz"
SRC_URI[md5sum] = "e8b326ac3dad8e87f6f82058db0a2ead"
SRC_URI[sha256sum] = "9975345b80dbf809b9bfe0c698e45c0d5223c281d3b258c74528ccfc6d13134a"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
