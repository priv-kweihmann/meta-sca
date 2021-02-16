SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.2.2.tgz"
SRC_URI[md5sum] = "8ad2a4454917f2f3cd9abebbb49a9e96"
SRC_URI[sha256sum] = "3c14df41b2e43054710cd2a2de00992a8b93ee945136748b12340824ce9d78d6"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
