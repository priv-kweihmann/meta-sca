SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.4.0.tgz"
SRC_URI[md5sum] = "665dc4886ec68b84eaeb628f1cf6325d"
SRC_URI[sha256sum] = "748aa6b27a1ca46f119c42ddb7902072467c56f576b16c7c0a4f87e4490b3ed6"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
