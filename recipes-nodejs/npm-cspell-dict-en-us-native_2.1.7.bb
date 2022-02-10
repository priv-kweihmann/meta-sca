SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.1.7.tgz"
SRC_URI[md5sum] = "cd1be6f43401b908dacbc0dc1e658496"
SRC_URI[sha256sum] = "e5c2431e6dcdf009af0a9fb0f326cbbcbba114ba947e78e5d87236d63b6c32c4"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
