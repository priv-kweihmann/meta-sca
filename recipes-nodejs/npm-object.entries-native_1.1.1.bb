SUMMARY = "NPM: object.entries"
DESCRIPTION = "ES2017 spec-compliant Object.entries shim."
HOMEPAGE = "https://github.com/es-shims/Object.entries#readme"

DEPENDS = "npm-define-properties-native npm-es-abstract-native npm-function-bind-native npm-has-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/object.entries/-/object.entries-1.1.1.tgz"
SRC_URI[md5sum] = "31c6f4c1bbc993c67c992e94cc3d8c36"
SRC_URI[sha256sum] = "d7bbd2fc3ae281b51e6224a1a7888d46113d80fcddd3dde036a859b0ed3b4c74"

NPM_PKGNAME = "object.entries"

inherit npmhelper
inherit native
