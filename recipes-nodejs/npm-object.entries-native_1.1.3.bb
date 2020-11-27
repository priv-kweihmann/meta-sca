SUMMARY = "NPM: object.entries"
DESCRIPTION = "ES2017 spec-compliant Object.entries shim."
HOMEPAGE = "https://github.com/es-shims/Object.entries#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-native"

SRC_URI = "https://registry.npmjs.org/object.entries/-/object.entries-1.1.3.tgz"
SRC_URI[md5sum] = "29924cecf20bcafb4660568b0dc011ab"
SRC_URI[sha256sum] = "0b1688e86d69f5008e8055df3c8c8ae9128050961456dde2d4292114cb758a99"

NPM_PKGNAME = "object.entries"

inherit npmhelper
inherit native
