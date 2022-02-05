SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://ajv.js.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ed8db7ae36f56c8a5cfc218c41ac926"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.10.0.tgz"
SRC_URI[md5sum] = "0c89260507afff2a8f439feb64415159"
SRC_URI[sha256sum] = "b18edd44582297d3a5e3ec1c04747ea2c6c213f45b7db3a144d94e519ff908ef"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
