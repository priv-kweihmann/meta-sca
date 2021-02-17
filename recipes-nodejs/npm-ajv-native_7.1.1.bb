SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.1.1.tgz"
SRC_URI[md5sum] = "306f40b3d384f181815b853c5becaebd"
SRC_URI[sha256sum] = "a4aa75c9e737242b5c539de5ff62d7f2fe76912af431517e45f429d36ce66476"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
