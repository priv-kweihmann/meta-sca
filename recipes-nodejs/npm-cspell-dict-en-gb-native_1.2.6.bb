SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.2.6.tgz"
SRC_URI[md5sum] = "a3fa388cae68fa086bd41d9335c881fe"
SRC_URI[sha256sum] = "6290efdefa8438bd23eed7b39ab92cdc0471120fc6dc35322ed746b0958d9e6c"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
