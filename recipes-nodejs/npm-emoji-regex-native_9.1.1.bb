SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-9.1.1.tgz"
SRC_URI[md5sum] = "51d641582df6d123111d5c4a10178da4"
SRC_URI[sha256sum] = "6cf8c6a7b3af7aca324d75ea02cd446d28da4f19919e629d19e0eebd4fd8c7bd"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
