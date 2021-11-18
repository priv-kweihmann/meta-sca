SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.8.1.tgz"
SRC_URI[md5sum] = "dbdb073eeaa1d778b7f10f9445682e87"
SRC_URI[sha256sum] = "dcfc3af3413d5b373e8207df556e69ee5a1e3554054d6fd4fe5bbaf3669fc365"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
