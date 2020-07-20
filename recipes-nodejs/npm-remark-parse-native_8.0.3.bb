SUMMARY = "NPM: remark-parse"
DESCRIPTION = "remark plugin to parse Markdown"
HOMEPAGE = "https://remark.js.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=490;endline=491;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

DEPENDS = "npm-ccount-native \
           npm-collapse-white-space-native \
           npm-is-alphabetical-native \
           npm-is-decimal-native \
           npm-is-whitespace-character-native \
           npm-is-word-character-native \
           npm-markdown-escapes-native \
           npm-parse-entities-native \
           npm-repeat-string-native \
           npm-state-toggle-native \
           npm-trim-native \
           npm-trim-trailing-lines-native \
           npm-unherit-native \
           npm-unist-util-remove-position-native \
           npm-vfile-location-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/remark-parse/-/remark-parse-8.0.3.tgz"
SRC_URI[md5sum] = "9edeece249fb8441c1c49c0f69ed06cc"
SRC_URI[sha256sum] = "b3530824f18b809e69c4205dceb8a6a239675e2660b7ff8ddd398f2fa2f31b96"

NPM_PKGNAME = "remark-parse"

inherit npmhelper
inherit native
