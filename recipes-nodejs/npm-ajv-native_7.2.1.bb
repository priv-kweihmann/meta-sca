SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.2.1.tgz"
SRC_URI[md5sum] = "2a9dc966656f0dcf6408b15d54283c76"
SRC_URI[sha256sum] = "b906b9095241b9e868bc9e4687acbb56a6d384412310f89a8649f37c0a8996d5"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
