SUMMARY = "NPM: micromark-extension-gfm"
DESCRIPTION = "micromark extension to support GFM (GitHub Flavored Markdown)"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-extension-gfm-autolink-literal-native \
           npm-micromark-extension-gfm-strikethrough-native \
           npm-micromark-extension-gfm-table-native \
           npm-micromark-extension-gfm-tagfilter-native \
           npm-micromark-extension-gfm-task-list-item-native \
           npm-micromark-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm/-/micromark-extension-gfm-0.3.3.tgz"
SRC_URI[md5sum] = "a178ca0f52b7e0a5abb7d0f0520047c5"
SRC_URI[sha256sum] = "a9bad74dce686858d3a1b0edc6143ab53b65935b85f66ff38cafb237435ada90"

NPM_PKGNAME = "micromark-extension-gfm"

inherit npmhelper
inherit native
