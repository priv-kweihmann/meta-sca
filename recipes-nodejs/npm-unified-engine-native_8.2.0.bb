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

SRC_URI = "https://registry.npmjs.org/unified-engine/-/unified-engine-8.2.0.tgz"
SRC_URI[md5sum] = "8ac31dfd2377cf3985740020db10d975"
SRC_URI[sha256sum] = "39c2eba1105e19499b335c6ccb139aafa3a2ed5a8a446fab51a9eaee0a91df29"

NPM_PKGNAME = "unified-engine"

inherit npmhelper
inherit native
