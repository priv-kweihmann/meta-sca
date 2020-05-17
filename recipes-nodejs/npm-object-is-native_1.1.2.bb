SUMMARY = "NPM: object-is"
DESCRIPTION = "ES2015-compliant shim for Object.is - differentiates between -0 and +0"
HOMEPAGE = "https://github.com/es-shims/object-is"

DEPENDS = "npm-define-properties-native npm-es-abstract-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

SRC_URI = "https://registry.npmjs.org/object-is/-/object-is-1.1.2.tgz"
SRC_URI[md5sum] = "5bb2d3642ca8fd459f466f372a52aa53"
SRC_URI[sha256sum] = "83ad0dc408cb3e3db1e89590db82e452a76d83af9cc55a48fb32c2323cac9d12"

NPM_PKGNAME = "object-is"

inherit npmhelper
inherit native
