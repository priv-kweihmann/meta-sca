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

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.9.0.tgz"
SRC_URI[md5sum] = "651af05f8be798ab428be24b80b1301f"
SRC_URI[sha256sum] = "bc836207890070652d4619375d817a0d793d2f64927ed46ed5399480c1901c81"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
