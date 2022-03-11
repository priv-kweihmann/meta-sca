SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-10.0.1.tgz"
SRC_URI[md5sum] = "427821454a60b3cfb135f3c1b4463be9"
SRC_URI[sha256sum] = "9d3d44c1f455ddc656dbf58d7773810d073ec52d51dc577b658b74571d9beef1"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
