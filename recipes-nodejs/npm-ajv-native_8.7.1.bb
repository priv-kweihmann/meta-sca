SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.7.1.tgz"
SRC_URI[md5sum] = "5cac8f9c009692c3d03fd7cbc4bf7ce2"
SRC_URI[sha256sum] = "5746bfebd72073159ca236f101d87a6a9dcc033157b6747419a048b70839a777"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
