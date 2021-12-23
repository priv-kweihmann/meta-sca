SUMMARY = "NPM: has"
DESCRIPTION = "Object.prototype.hasOwnProperty.call shortcut"
HOMEPAGE = "https://github.com/tarruda/has"

DEPENDS = "npm-function-bind-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=d000afc3c9ff3501a5610197db76a246"

SRC_URI = "https://registry.npmjs.org/has/-/has-1.0.3.tgz"
SRC_URI[md5sum] = "b765203b0d733534ee6a58d84767223a"
SRC_URI[sha256sum] = "c38cf9eefce04e58ec3e945bfe448b9236d64f9337f6bf6e1f62e1c5b6b05573"

NPM_PKGNAME = "has"

inherit npmhelper
inherit native
