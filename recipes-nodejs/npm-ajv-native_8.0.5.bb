SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.0.5.tgz"
SRC_URI[md5sum] = "5548cc484cdff597a625663420444d62"
SRC_URI[sha256sum] = "17fcb8fc9b876e98e28368f0a2da11f7d17559e8397a08f2dbc20998be3de6d8"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
