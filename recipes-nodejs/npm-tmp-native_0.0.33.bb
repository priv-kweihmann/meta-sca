SUMMARY = "NPM: tmp"
DESCRIPTION = "Temporary file and directory creator"
HOMEPAGE = "http://github.com/raszi/node-tmp"

DEPENDS = "npm-os-tmpdir-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4502395b4fdb20719bf54bfb416efe5d"

SRC_URI = "https://registry.npmjs.org/tmp/-/tmp-0.0.33.tgz"
SRC_URI[md5sum] = "094f64689467b6dfcafa6c2a83723081"
SRC_URI[sha256sum] = "d23b215e6ce454f076e163a3feb7a1b548ddf44be3a41353f74837722b11d6c5"

NPM_PKGNAME = "tmp"

inherit npmhelper
inherit native
