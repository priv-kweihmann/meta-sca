SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-fast-json-stable-stringify-native \
           npm-json-schema-traverse-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-6.12.3.tgz"
SRC_URI[md5sum] = "6847b40b0d28e9afc2f04625d7fcd2c0"
SRC_URI[sha256sum] = "0d2f99fe41b710d69fe4eae4203d0bbcc0ee428448aec1d06dd2f1d89de9963f"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
