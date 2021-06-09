SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.6.0.tgz"
SRC_URI[md5sum] = "f6247581ac9306a86832cd3701c18698"
SRC_URI[sha256sum] = "8b80707b919dd4550d3c70bac0417a24ff23147da6532f2325f6d6e65208e030"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
