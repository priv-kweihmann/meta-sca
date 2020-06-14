SUMMARY = "NPM: remark-stringify"
DESCRIPTION = "remark plugin to compile Markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=314;endline=315;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-ccount-native \
           npm-is-alphanumeric-native \
           npm-is-decimal-native \
           npm-is-whitespace-character-native \
           npm-longest-streak-native \
           npm-markdown-escapes-native \
           npm-markdown-table-native \
           npm-mdast-util-compact-native \
           npm-parse-entities-native \
           npm-repeat-string-native \
           npm-state-toggle-native \
           npm-stringify-entities-native \
           npm-unherit-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/remark-stringify/-/remark-stringify-8.1.0.tgz"
SRC_URI[md5sum] = "7880246a92336f3290c81f6f68b917e5"
SRC_URI[sha256sum] = "28b158f40a500e78c20c56ed0d28753e477403fff18bc445a85b7bdf3522eec1"

NPM_PKGNAME = "remark-stringify"

inherit npmhelper
inherit native
