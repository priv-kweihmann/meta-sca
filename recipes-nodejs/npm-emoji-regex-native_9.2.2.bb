SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-9.2.2.tgz"
SRC_URI[md5sum] = "51435a3287410754662f98fd4f269a48"
SRC_URI[sha256sum] = "1dc78dfa80b23abd0ca36501eaa3241ce1440c2478b2a9da20718a26bc67ae7e"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
