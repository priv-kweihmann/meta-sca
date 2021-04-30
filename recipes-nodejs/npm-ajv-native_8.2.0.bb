SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.2.0.tgz"
SRC_URI[md5sum] = "0c6022650b7b570e668ec8b7faf2b3b0"
SRC_URI[sha256sum] = "ca1fa0fe737aaa2d580fbdad8c802d22537823e3ac2dbecc782e29ccdfe42ddc"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
