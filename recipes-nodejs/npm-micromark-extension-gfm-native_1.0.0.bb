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
           npm-micromark-util-combine-extensions-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm/-/micromark-extension-gfm-1.0.0.tgz"
SRC_URI[md5sum] = "2ad7316d3ed666aa325bb9f9b7804145"
SRC_URI[sha256sum] = "123bca187e2fab8938534cea8da6a5c302ccd3dc6883b53adaef294901478092"

NPM_PKGNAME = "micromark-extension-gfm"

inherit npmhelper
inherit native
