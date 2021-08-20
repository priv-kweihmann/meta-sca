SUMMARY = "NPM: rehype-parse"
DESCRIPTION = "rehype plugin to parse HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=297;endline=298;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-hast-util-from-parse5-native \
           npm-parse5-native \
           npm-types-hast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-parse/-/rehype-parse-8.0.2.tgz"
SRC_URI[md5sum] = "0aef91526ca8c494ea6b57bf09f1a97d"
SRC_URI[sha256sum] = "bcb1e4067a6fdb8e430548ac4161b47e03d6371c1f250342fef320577b02d6e1"

NPM_PKGNAME = "rehype-parse"

inherit npmhelper
inherit native
