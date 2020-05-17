SUMMARY = "NPM: unified-engine"
DESCRIPTION = "Engine to process multiple files with unified"
HOMEPAGE = "https://github.com/unifiedjs/unified-engine#readme"

DEPENDS = "npm-concat-stream-native npm-debug-native npm-fault-native npm-fn-name-native npm-glob-native npm-ignore-native npm-is-empty-native npm-is-hidden-native npm-is-object-native npm-js-yaml-native npm-load-plugin-native npm-parse-json-native npm-to-vfile-native npm-trough-native npm-vfile-reporter-native npm-vfile-statistics-native npm-x-is-function-native npm-x-is-string-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b280acbcf1c2e5ef4ceb6852568d9961"

SRC_URI = "https://registry.npmjs.org/unified-engine/-/unified-engine-4.0.1.tgz"
SRC_URI[md5sum] = "4b0c295e0e36c304fe8d2591bf526557"
SRC_URI[sha256sum] = "75fd1a5e9f7d036df051f913cc76340102ddbe3cfb7de1ead7bf1f1881ccfa54"

NPM_PKGNAME = "unified-engine"

inherit npmhelper
inherit native
