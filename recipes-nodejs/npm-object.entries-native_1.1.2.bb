SUMMARY = "NPM: object.entries"
DESCRIPTION = "ES2017 spec-compliant Object.entries shim."
HOMEPAGE = "https://github.com/es-shims/Object.entries#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-define-properties-native \
           npm-es-abstract-native \
           npm-has-native"

SRC_URI = "https://registry.npmjs.org/object.entries/-/object.entries-1.1.2.tgz"
SRC_URI[md5sum] = "7e14555d4af0c23798ff86593001c45f"
SRC_URI[sha256sum] = "2f282dce2dc430c868a67a81e06e71d9b701a01884d94442a45f66e8887c20c1"

NPM_PKGNAME = "object.entries"

inherit npmhelper
inherit native
