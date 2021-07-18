SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.6.2.tgz"
SRC_URI[md5sum] = "7c985719d86244a8380c5a82aac58e49"
SRC_URI[sha256sum] = "ea9da16a6d995169837c5795f5b093f2c40f5ae427d3e3d24ff65249483707bb"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
