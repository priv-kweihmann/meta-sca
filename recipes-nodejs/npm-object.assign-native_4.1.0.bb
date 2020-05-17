SUMMARY = "NPM: object.assign"
DESCRIPTION = "ES6 spec-compliant Object.assign shim. From https://github.com/es-shims/es6-shim"
HOMEPAGE = "https://github.com/ljharb/object.assign#readme"

DEPENDS = "npm-define-properties-native npm-function-bind-native npm-has-symbols-native npm-object-keys-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b439ca9e99134dee172a7cc6d989174"

SRC_URI = "https://registry.npmjs.org/object.assign/-/object.assign-4.1.0.tgz"
SRC_URI[md5sum] = "c3e7abc1f93764e8144ff4982c365ac7"
SRC_URI[sha256sum] = "0e791b6687f4c5f2ab5f5af71dc7835d43597ced458e9bc4bf5fff06d62543c3"

NPM_PKGNAME = "object.assign"

inherit npmhelper
inherit native
