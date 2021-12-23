SUMMARY = "NPM: object.values"
DESCRIPTION = "ES2017 spec-compliant Object.values shim."
HOMEPAGE = "https://github.com/es-shims/Object.values#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object.values/-/object.values-1.1.5.tgz"
SRC_URI[md5sum] = "9b0b1fc1c92a2d24b2b92e11f89f85ab"
SRC_URI[sha256sum] = "efa1123c610b37fdcf537baf9affbf52e7990a33e0584f8f2b52bbdb67418df4"

NPM_PKGNAME = "object.values"

inherit npmhelper
inherit native
