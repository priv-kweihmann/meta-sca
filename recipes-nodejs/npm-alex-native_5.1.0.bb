SUMMARY = "NPM: alex"
DESCRIPTION = "Catch insensitive, inconsiderate writing"
HOMEPAGE = "http://alexjs.com"

DEPENDS = "npm-meow-native npm-remark-frontmatter-native npm-remark-message-control-native npm-remark-parse-native npm-remark-retext-native npm-retext-english-native npm-retext-equality-native npm-retext-profanities-native npm-unified-diff-native npm-unified-engine-native npm-unified-native npm-update-notifier-native npm-vfile-native npm-vfile-reporter-native npm-vfile-sort-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82fd7b0a70b89a370d3bcef312cfd54d"

SRC_URI = "https://registry.npmjs.org/alex/-/alex-5.1.0.tgz"
SRC_URI[md5sum] = "7d690cde67685a52bdc016d54bc75bfe"
SRC_URI[sha256sum] = "7062299d551272dca62fb15cd646930db5fe0b4c6bac4f1efe10078c018e4ac4"

NPM_PKGNAME = "alex"

inherit npmhelper
inherit native
