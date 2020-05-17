SUMMARY = "NPM: remark-parse"
DESCRIPTION = "remark plugin to parse Markdown"
HOMEPAGE = "https://remark.js.org"

DEPENDS = "npm-ccount-native npm-collapse-white-space-native npm-is-alphabetical-native npm-is-decimal-native npm-is-whitespace-character-native npm-is-word-character-native npm-markdown-escapes-native npm-parse-entities-native npm-repeat-string-native npm-state-toggle-native npm-trim-native npm-trim-trailing-lines-native npm-unherit-native npm-unist-util-remove-position-native npm-vfile-location-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=486;endline=487;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

SRC_URI = "https://registry.npmjs.org/remark-parse/-/remark-parse-8.0.2.tgz"
SRC_URI[md5sum] = "be9f921ac4de60380d4902c740c7ffa5"
SRC_URI[sha256sum] = "fc36e64cc019c007372bf4ce684f7671e1f7015ccce325dd433b9c9311a42119"

NPM_PKGNAME = "remark-parse"

inherit npmhelper
inherit native
