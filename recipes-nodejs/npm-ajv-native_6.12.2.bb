SUMMARY = "NPM: ajv"
DESCRIPTION = "Another JSON Schema Validator"
HOMEPAGE = "https://github.com/epoberezkin/ajv"

DEPENDS = "npm-fast-deep-equal-native npm-fast-json-stable-stringify-native npm-json-schema-traverse-native npm-uri-js-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4973982316cdc12e988b814af2813df7"

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-6.12.2.tgz"
SRC_URI[md5sum] = "5dd80999e4c4c4dd6c3c16d107e926a5"
SRC_URI[sha256sum] = "38e1f77a7d990e793003a736436e87025fecd3595d51d474a54263e13828d04f"

S = "${WORKDIR}/package"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
