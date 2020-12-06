SUMMARY = "NPM: is-arguments"
DESCRIPTION = "Is this an arguments object? It's a harder question than you think."
HOMEPAGE = "https://github.com/inspect-js/is-arguments"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-call-bind-native"

SRC_URI = "https://registry.npmjs.org/is-arguments/-/is-arguments-1.1.0.tgz"
SRC_URI[md5sum] = "8aadd1559ed29753e058b7bb48a96829"
SRC_URI[sha256sum] = "b175a429320ba6dd7a347c24ce64c1b9744aae2a334912efab13415700d0ff4e"

NPM_PKGNAME = "is-arguments"

inherit npmhelper
inherit native
