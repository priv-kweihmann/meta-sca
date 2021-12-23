SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-10.0.0.tgz"
SRC_URI[md5sum] = "56b05619f62ad8acfe7c0523052b469b"
SRC_URI[sha256sum] = "89ecde7c30c8a1cccc5aa0bb11189e068488bea9c0c61b337c576558749943a8"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
