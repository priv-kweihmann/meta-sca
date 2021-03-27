SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.0.0.tgz"
SRC_URI[md5sum] = "f0745589bb7f6e211c2052ac391b53c8"
SRC_URI[sha256sum] = "89711d228368c468fdd9d68549d8e59b117d204403b989b917675b60c1bb3fe3"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
