SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.1.0.tgz"
SRC_URI[md5sum] = "17f52bb70d66f78ac9af3651e3d4c143"
SRC_URI[sha256sum] = "9b90ee6d329ee41ec16926e8a761fa74d8e17422e922c77d40a4a7291ff0366a"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
