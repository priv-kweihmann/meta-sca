SUMMARY = "NPM: object.entries"
DESCRIPTION = "ES2017 spec-compliant Object.entries shim."
HOMEPAGE = "https://github.com/es-shims/Object.entries#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object.entries/-/object.entries-1.1.4.tgz"
SRC_URI[md5sum] = "2fdba1e23984071d7312a5c271577a92"
SRC_URI[sha256sum] = "e61c588826f30c4d34805be13fdbc36e964f9e0dcc78f917956562e5813131ca"

NPM_PKGNAME = "object.entries"

inherit npmhelper
inherit native
