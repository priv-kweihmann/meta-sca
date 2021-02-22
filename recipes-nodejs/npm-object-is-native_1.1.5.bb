SUMMARY = "NPM: object-is"
DESCRIPTION = "ES2015-compliant shim for Object.is - differentiates between -0 and +0"
HOMEPAGE = "https://github.com/es-shims/object-is"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/object-is/-/object-is-1.1.5.tgz"
SRC_URI[md5sum] = "2a9255ebb6cb1f6394581306469fe178"
SRC_URI[sha256sum] = "aa22c2675fb7d79de7240217af2c7b944d91e6b5154b32a159c2ec45a3010637"

NPM_PKGNAME = "object-is"

inherit npmhelper
inherit native
