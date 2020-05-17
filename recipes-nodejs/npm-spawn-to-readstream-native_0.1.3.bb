SUMMARY = "NPM: spawn-to-readstream"
DESCRIPTION = "Converts spawn to a ReadStream, buffers the error and emits it"
HOMEPAGE = "https://github.com/alessioalex/spawn-to-readstream"

DEPENDS = "npm-limit-spawn-native npm-through2-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=176f49adca8b0da8a7dde6810631de42"

SRC_URI = "https://registry.npmjs.org/spawn-to-readstream/-/spawn-to-readstream-0.1.3.tgz"
SRC_URI[md5sum] = "7fcafddddc6421c089aef52399406470"
SRC_URI[sha256sum] = "7016a28bc0233f5a825bf8fa101c45815f989c9b707c19369d81fc5f933e89f1"

NPM_PKGNAME = "spawn-to-readstream"

inherit npmhelper
inherit native
