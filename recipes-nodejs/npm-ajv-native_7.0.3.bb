SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.0.3.tgz"
SRC_URI[md5sum] = "08e03f0bd390c92a9e815325a45e97fc"
SRC_URI[sha256sum] = "080a2a506b4e03a42b42eb9af37a6e6a376abed8507c6ed593718be4008ad472"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
