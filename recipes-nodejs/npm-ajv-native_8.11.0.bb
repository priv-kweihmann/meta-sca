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

SRC_URI = "https://registry.npmjs.org/ajv/-/ajv-8.11.0.tgz"
SRC_URI[md5sum] = "aa2797cced8f34ae6e25da55e5614ebe"
SRC_URI[sha256sum] = "d2a0bf8207c77695f22105d09379583f21840eff6d62d845edc7fda2aecc8fa2"

NPM_PKGNAME = "ajv"

inherit npmhelper
inherit native
