SUMMARY = "NPM: md5"
DESCRIPTION = "js function for hashing messages with MD5"
HOMEPAGE = "https://github.com/pvorb/node-md5#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f975764919f5b2859c839414bb6a6f3a"

DEPENDS = "npm-charenc-native \
           npm-crypt-native \
           npm-is-buffer-native"

SRC_URI = "https://registry.npmjs.org/md5/-/md5-2.3.0.tgz"
SRC_URI[md5sum] = "fa767e58a15e1ab3ceaf56ddafb17a01"
SRC_URI[sha256sum] = "dcf1c987696c36f3a52bb2c0933b1156b779b406bebb2bf5b4096e7f2cf4f32a"

NPM_PKGNAME = "md5"

inherit npmhelper
inherit native
