SUMMARY = "NPM: is-negated-glob"
DESCRIPTION = "Returns an object with a `negated` boolean and the `!` stripped from negation patterns. Also respects extglobs."
HOMEPAGE = "https://github.com/jonschlinkert/is-negated-glob"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5d7b190ec11a5e3199c3b3b45cde690"

SRC_URI = "https://registry.npmjs.org/is-negated-glob/-/is-negated-glob-1.0.0.tgz"
SRC_URI[md5sum] = "8e6a4912bcfb71405ca1a66388a59671"
SRC_URI[sha256sum] = "6d1a9bba211048603013af1e16728d631e239227c3dfe28ba13922b0b999627b"

NPM_PKGNAME = "is-negated-glob"

inherit npmhelper
inherit native
