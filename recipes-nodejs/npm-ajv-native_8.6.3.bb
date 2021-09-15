SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.6.3.tgz"
SRC_URI[md5sum] = "cf8937295d13a0f497ab62dd729735cd"
SRC_URI[sha256sum] = "4b1bc6507d6a163f600a9c658f064471e7d10310c739196be0d4ab602a66899f"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
