SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.0.4.tgz"
SRC_URI[md5sum] = "a061c7fe0c7e5245a89c303c4db976f9"
SRC_URI[sha256sum] = "eb168571d5e3eadd13976c569f0f0bcca244ee7b880c6fc339660b489d375db2"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
