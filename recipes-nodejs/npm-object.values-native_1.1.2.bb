SUMMARY = "NPM: object.values"
DESCRIPTION = "ES2017 spec-compliant Object.values shim."
HOMEPAGE = "https://github.com/es-shims/Object.values#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-native"

SRC_URI = "https://registry.npmjs.org/object.values/-/object.values-1.1.2.tgz"
SRC_URI[md5sum] = "2a70c6cad91bb85c975ea9cdc4c3c837"
SRC_URI[sha256sum] = "c06523eea4f6ba9f060ee36882c9ad1d1a1d481808496b9734d240b6364aaf0d"

NPM_PKGNAME = "object.values"

inherit npmhelper
inherit native
