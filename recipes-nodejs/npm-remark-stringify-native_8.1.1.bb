SUMMARY = "NPM: remark-stringify"
DESCRIPTION = "remark plugin to compile Markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=312;endline=313;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

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

SRC_URI = "https://registry.npmjs.org/remark-stringify/-/remark-stringify-8.1.1.tgz"
SRC_URI[md5sum] = "16a4d1036f0848b373ed169b51e6a502"
SRC_URI[sha256sum] = "9255be837dd04f1bb18e23fdb37b3078d2d8db18a66a469fa6955a2acbeec952"

NPM_PKGNAME = "remark-stringify"

inherit npmhelper
inherit native
