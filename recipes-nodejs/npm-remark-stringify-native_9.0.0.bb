SUMMARY = "NPM: remark-stringify"
DESCRIPTION = "remark plugin to compile Markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=146;endline=147;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/remark-stringify/-/remark-stringify-9.0.0.tgz"
SRC_URI[md5sum] = "54ea446a37c9ceb2a525016f4e83c518"
SRC_URI[sha256sum] = "5301799b68b635de99c0fb1468994efc588acbd415a4cbcac3297f30cd43114e"

NPM_PKGNAME = "remark-stringify"

inherit npmhelper
inherit native
