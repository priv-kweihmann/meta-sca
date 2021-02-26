SUMMARY = "NPM: object.values"
DESCRIPTION = "ES2017 spec-compliant Object.values shim."
HOMEPAGE = "https://github.com/es-shims/Object.values#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-native"

SRC_URI = "https://registry.npmjs.org/object.values/-/object.values-1.1.3.tgz"
SRC_URI[md5sum] = "90a5bdbedd9f05e60832818f2f5e152a"
SRC_URI[sha256sum] = "3517fe824a045eb8d23c6773d76bf68153c1540d4a57835ac83192afa6a5cdfd"

NPM_PKGNAME = "object.values"

inherit npmhelper
inherit native
