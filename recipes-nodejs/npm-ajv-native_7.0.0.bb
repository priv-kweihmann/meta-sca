SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.0.0.tgz"
SRC_URI[md5sum] = "cadd74fb7a791fbcbcdf94f15f9df2f5"
SRC_URI[sha256sum] = "67d33c8708b8a515e5ffd185dfaf82ba1e3c39357426bb7644ddb1d0d2d0bd22"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
