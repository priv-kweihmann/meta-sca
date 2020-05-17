SUMMARY = "NPM: remark-stringify"
DESCRIPTION = "remark plugin to compile Markdown"
HOMEPAGE = "https://remark.js.org"

DEPENDS = "npm-ccount-native npm-is-alphanumeric-native npm-is-decimal-native npm-is-whitespace-character-native npm-longest-streak-native npm-markdown-escapes-native npm-markdown-table-native npm-mdast-util-compact-native npm-parse-entities-native npm-repeat-string-native npm-state-toggle-native npm-stringify-entities-native npm-unherit-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=308;endline=309;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

SRC_URI = "https://registry.npmjs.org/remark-stringify/-/remark-stringify-8.0.0.tgz"
SRC_URI[md5sum] = "e345171ec7b5983e4e0315f72a575887"
SRC_URI[sha256sum] = "cc60ec5ddb9ed8f79f6ba5a8740ff9953e3aeec271b9aa4188cfd12b2737843e"

NPM_PKGNAME = "remark-stringify"

inherit npmhelper
inherit native
