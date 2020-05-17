SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-9.0.0.tgz"
SRC_URI[md5sum] = "dc8414ef32851dd4260f195444f20187"
SRC_URI[sha256sum] = "1d52f03552701131efa58f34d3333e9cfb8227069e3fb6cc035c1e4c24736eac"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
