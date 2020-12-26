SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.2.0.tgz"
SRC_URI[md5sum] = "f64ce956a2dfc17a971258b108bb1f78"
SRC_URI[sha256sum] = "a5fe9036d165285df4df94fe94fc7d401379c8ab15bdcda2839bdd9769b4b622"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
