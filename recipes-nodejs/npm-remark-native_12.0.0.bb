SUMMARY = "NPM: remark"
DESCRIPTION = "Markdown processor powered by plugins part of the unified collective"
HOMEPAGE = "https://remark.js.org"

DEPENDS = "npm-remark-parse-native npm-remark-stringify-native npm-unified-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=185;endline=186;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

SRC_URI = "https://registry.npmjs.org/remark/-/remark-12.0.0.tgz"
SRC_URI[md5sum] = "d9e9801a83e06bd94bb4b280195b176e"
SRC_URI[sha256sum] = "dcc749171bfe39a4627ca5d1f7909057a719d9af8aaa4c3ec74fbe220965c655"

NPM_PKGNAME = "remark"

inherit npmhelper
inherit native
