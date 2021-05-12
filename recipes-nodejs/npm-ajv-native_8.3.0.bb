SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.3.0.tgz"
SRC_URI[md5sum] = "45adf277657154767ffe78af505059e7"
SRC_URI[sha256sum] = "ce8b2b54b06379ec3608ea09dd5500bedc3c9beca03200428abbbee4fbc8722a"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
