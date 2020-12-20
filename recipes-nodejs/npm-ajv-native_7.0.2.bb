SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/ajv-validator/ajv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

DEPENDS = "npm-fast-deep-equal-native \
           npm-json-schema-traverse-native \
           npm-require-from-string-native \
           npm-uri-js-native"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-7.0.2.tgz"
SRC_URI[md5sum] = "751ff3340526fb22e7c4e4c27b62b29d"
SRC_URI[sha256sum] = "f2449cb0717137ae15dc63bbf7c38bb6c0d9d2b69aeff98824e2f23dac4aae26"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
