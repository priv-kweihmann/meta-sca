SUMMARY = "NPM: regexp.prototype.flags"
DESCRIPTION = "ES6 spec-compliant RegExp.prototype.flags shim."
HOMEPAGE = "https://github.com/es-shims/RegExp.prototype.flags#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6009913822e586406a8cf459157e868a"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/regexp.prototype.flags/-/regexp.prototype.flags-1.4.1.tgz"
SRC_URI[md5sum] = "305e8d6fed0dc79667bd44ce07d45f39"
SRC_URI[sha256sum] = "edc4e3b8335949922fa4885f5a8bcc5892d1e764739c5788ca5e03c860efdcf4"

NPM_PKGNAME = "regexp.prototype.flags"

inherit npmhelper
inherit native
