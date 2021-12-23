SUMMARY = "NPM: weasel-words"
DESCRIPTION = "detect weasel words"


DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=27;md5=477dfa54ede28e2f361e7db05941d7a7"

SRC_URI = "https://registry.npmjs.org/weasel-words/-/weasel-words-0.1.1.tgz"
SRC_URI[md5sum] = "68c80b6853abb6af10d431deb88b2b8d"
SRC_URI[sha256sum] = "e733a3257e64716220ba1a58a9fad82135488f8278aed9543569476ae514b03d"

NPM_PKGNAME = "weasel-words"

inherit npmhelper
inherit native
