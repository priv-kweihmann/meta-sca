SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.2.3.tgz"
SRC_URI[md5sum] = "28643f2f3d582e99abfac6076e023b3b"
SRC_URI[sha256sum] = "7da444ac65ee2567c89963c1182bb0160eb482f3ed477c6d6e2ecbf37c1644e3"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
