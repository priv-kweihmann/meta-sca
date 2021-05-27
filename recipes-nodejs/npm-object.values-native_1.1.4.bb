SUMMARY = "NPM: object.values"
DESCRIPTION = "ES2017 spec-compliant Object.values shim."
HOMEPAGE = "https://github.com/es-shims/Object.values#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object.values/-/object.values-1.1.4.tgz"
SRC_URI[md5sum] = "bd81af5190989a4e27daa0077ffc5d15"
SRC_URI[sha256sum] = "083682bd01cf38a99285cdc81abdfa1c7eedf85573c46f37bacdf654b72c6035"

NPM_PKGNAME = "object.values"

inherit npmhelper
inherit native
