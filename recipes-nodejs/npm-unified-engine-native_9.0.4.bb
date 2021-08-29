SUMMARY = "NPM: unified-engine"
DESCRIPTION = "Engine to process multiple files with unified"
HOMEPAGE = "https://github.com/unifiedjs/unified-engine#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=b280acbcf1c2e5ef4ceb6852568d9961"

DEPENDS = "npm-concat-stream-native \
           npm-debug-native \
           npm-fault-native \
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
           npm-types-concat-stream-native \
           npm-types-debug-native \
           npm-types-is-empty-native \
           npm-types-js-yaml-native \
           npm-types-node-native \
           npm-types-unist-native \
           npm-unist-util-inspect-native \
           npm-vfile-message-native \
           npm-vfile-reporter-native \
           npm-vfile-statistics-native"

SRC_URI = "https://registry.npmjs.org/unified-engine/-/unified-engine-9.0.4.tgz"
SRC_URI[md5sum] = "398e35199f99fbfa5ceb9eaf2948d425"
SRC_URI[sha256sum] = "2dce03000868aa1cd72ed61468e0915bca23a8f7a7109049fad32d2a8eefc526"

NPM_PKGNAME = "unified-engine"

inherit npmhelper
inherit native
