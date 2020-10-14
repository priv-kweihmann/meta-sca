SUMMARY = "NPM: remark-parse"
DESCRIPTION = "remark plugin to parse Markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=128;endline=129;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-mdast-util-from-markdown-native"

SRC_URI = "https://registry.npmjs.org/remark-parse/-/remark-parse-9.0.0.tgz"
SRC_URI[md5sum] = "e1ac94b830b0d3219cda75be0ea72e9e"
SRC_URI[sha256sum] = "805ddaa9b28ce7fb9fc74015bde6b2d478ca6f08829aea65f616076307dffa3a"

NPM_PKGNAME = "remark-parse"

inherit npmhelper
inherit native
