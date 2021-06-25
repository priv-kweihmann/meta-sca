SUMMARY = "NPM: micromark-extension-gfm-autolink-literal"
DESCRIPTION = "micromark extension to support GFM autolink literals"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-autolink-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-autolink-literal/-/micromark-extension-gfm-autolink-literal-1.0.0.tgz"
SRC_URI[md5sum] = "b1524272996adebcaf22011a6da7841b"
SRC_URI[sha256sum] = "59de8386ab9fe233309273151ad0558f704c891ba732e8966814d340d9daecb4"

NPM_PKGNAME = "micromark-extension-gfm-autolink-literal"

inherit npmhelper
inherit native
