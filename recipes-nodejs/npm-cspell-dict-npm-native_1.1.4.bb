SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.1.4.tgz"
SRC_URI[md5sum] = "301ecfac73d45df5579cab93c2f45300"
SRC_URI[sha256sum] = "57079fcfe69bdfb5bca5a18333089a55bbe8a58f955c996fafcab92b0d4af0fd"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
