SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-10.1.0.tgz"
SRC_URI[md5sum] = "f9a44088a865e24a1173d3c7615e5469"
SRC_URI[sha256sum] = "a022699444fe8dda6e255a91e6cad99a0146e7bd284b8636efa48c240b6718fd"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
