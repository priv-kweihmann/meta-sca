SUMMARY = "NPM: object-is"
DESCRIPTION = "ES2015-compliant shim for Object.is - differentiates between -0 and +0"
HOMEPAGE = "https://github.com/es-shims/object-is"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/object-is/-/object-is-1.1.4.tgz"
SRC_URI[md5sum] = "4cdcee8324587738e5762c541b81a60d"
SRC_URI[sha256sum] = "7eab830f225e1490634c6f5d82450595599d66effa63254e15223f513c410fa8"

NPM_PKGNAME = "object-is"

inherit npmhelper
inherit native
