SUMMARY = "NPM: emoji-regex"
DESCRIPTION = "A regular expression to match all Emoji-only symbols as per the Unicode Standard."
HOMEPAGE = "https://mths.be/emoji-regex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/emoji-regex/-/emoji-regex-9.2.0.tgz"
SRC_URI[md5sum] = "15839f4e258434236a625c178f5fac1a"
SRC_URI[sha256sum] = "c808bfd5aa587425fad541787d0cb50c32dc8e31cdec7d0b0790a81a0b93b131"

NPM_PKGNAME = "emoji-regex"

inherit npmhelper
inherit native
