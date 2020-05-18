SUMMARY = "NPM: unified-engine"
DESCRIPTION = "Engine to process multiple files with unified"
HOMEPAGE = "https://github.com/unifiedjs/unified-engine#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=b280acbcf1c2e5ef4ceb6852568d9961"

DEPENDS = "npm-concat-stream-native \
           npm-debug-native \
           npm-fault-native \
           npm-figures-native \
           npm-glob-native \
           npm-ignore-native \
           npm-is-buffer-native \
           npm-is-empty-native \
           npm-is-plain-obj-native \
           npm-js-yaml-native \
           npm-load-plugin-native \
           npm-parse-json-native \
           npm-to-vfile-native \
           npm-trough-native \
           npm-unist-util-inspect-native \
           npm-vfile-reporter-native \
           npm-vfile-statistics-native"

SRC_URI = "https://registry.npmjs.org/unified-engine/-/unified-engine-8.0.0.tgz"
SRC_URI[md5sum] = "de74a1adeb2406e6aa27a41fae8f9912"
SRC_URI[sha256sum] = "4f9dd4c997b6651c3dab6f8ce210ea35117d3cd261cbf1be747666ce604f4247"

NPM_PKGNAME = "unified-engine"

inherit npmhelper
inherit native
