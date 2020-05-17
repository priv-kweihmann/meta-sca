SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-8.0.0.tgz"
SRC_URI[md5sum] = "598b731d8d33cfff04377ad55da187b0"
SRC_URI[sha256sum] = "b5ccd9fbfb08098eefbeb6b6b4b40db6db3acf9243e327e039925aa8661cb107"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
