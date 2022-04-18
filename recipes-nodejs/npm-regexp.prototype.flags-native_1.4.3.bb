SUMMARY = "NPM: regexp.prototype.flags"
DESCRIPTION = "ES6 spec-compliant RegExp.prototype.flags shim."
HOMEPAGE = "https://github.com/es-shims/RegExp.prototype.flags#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6009913822e586406a8cf459157e868a"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-functions-have-names-native"

SRC_URI = "https://registry.npmjs.org/regexp.prototype.flags/-/regexp.prototype.flags-1.4.3.tgz"
SRC_URI[md5sum] = "61b7a182d81b12b7c8a9bc5105726ab0"
SRC_URI[sha256sum] = "444df1245ed8a3a8f5afbffed1e9c589e4878fc3bf9021cb5a6c127f38ccbd95"

NPM_PKGNAME = "regexp.prototype.flags"

inherit npmhelper
inherit native
