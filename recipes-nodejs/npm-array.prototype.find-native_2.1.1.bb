SUMMARY = "NPM: array.prototype.find"
DESCRIPTION = "Array.prototype.find ES6 polyfill."
HOMEPAGE = "https://github.com/paulmillr/Array.prototype.find#readme"

DEPENDS = "npm-define-properties-native npm-es-abstract-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b73ae65ff9513a76f206f931ac1685d3"

SRC_URI = "https://registry.npmjs.org/array.prototype.find/-/array.prototype.find-2.1.1.tgz"
SRC_URI[md5sum] = "0d0f35c03da94c73fcdbf995042a3c8c"
SRC_URI[sha256sum] = "114d3f2505b00f0412172b3ffa1bc4896e2a00f886a77546c47a9f93cee56013"

NPM_PKGNAME = "array.prototype.find"

inherit npmhelper
inherit native
