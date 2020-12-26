SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.2.0.tgz"
SRC_URI[md5sum] = "c57151cc869be543efbe1793886a5c17"
SRC_URI[sha256sum] = "f26a243939752b9c707f1cc81ebfa2fdeb172eb21edcba4b6fa78e9cd8d1ba22"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
