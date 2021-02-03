SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-9.2.1.tgz"
SRC_URI[md5sum] = "2d19975e2c5c84a4fefaafaf597e8b5c"
SRC_URI[sha256sum] = "f182c244e2c9a5105f16827c31a79c3e218a43c9fedf2c4fc559dbc7a4c6917c"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
