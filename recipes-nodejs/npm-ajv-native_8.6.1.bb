SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.6.1.tgz"
SRC_URI[md5sum] = "90e705d485b02265ab875f66c1bf5188"
SRC_URI[sha256sum] = "c609d0355ac12fa45562823b9899decc33d4ecda2768aad0f92188c83c391871"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
