SUMMARY = "NPM: micromark-extension-gfm"
DESCRIPTION = "micromark extension to support GFM (GitHub Flavored Markdown)"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-extension-gfm-autolink-literal-native \
           npm-micromark-extension-gfm-footnote-native \
           npm-micromark-extension-gfm-strikethrough-native \
           npm-micromark-extension-gfm-table-native \
           npm-micromark-extension-gfm-tagfilter-native \
           npm-micromark-extension-gfm-task-list-item-native \
           npm-micromark-util-combine-extensions-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm/-/micromark-extension-gfm-2.0.0.tgz"
SRC_URI[md5sum] = "a83cf76816710b24f78c452f1bbcdcf0"
SRC_URI[sha256sum] = "5e52910d8ae8b5dc963ca563097dc5a48165b9d36b8e9fdf3af5f4421d14a3e5"

NPM_PKGNAME = "micromark-extension-gfm"

inherit npmhelper
inherit native
