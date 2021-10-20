SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.1.2.tgz"
SRC_URI[md5sum] = "4d5a080ad3b6bcebb3a3ba84c893ba9e"
SRC_URI[sha256sum] = "4cf28dd658571292b64e9728631f96a0617a6874e1f3d3e924ab8b212147b2a1"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
