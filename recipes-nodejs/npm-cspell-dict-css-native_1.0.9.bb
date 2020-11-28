SUMMARY = "NPM: cspell-dict-css"
DESCRIPTION = "CSS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/css#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-css/-/cspell-dict-css-1.0.9.tgz"
SRC_URI[md5sum] = "cd631f9e26d20a5eaaa2b91f986c75bf"
SRC_URI[sha256sum] = "fc162e80ed731eaf7950d2c83b45a0fa7a1c6ed376436208b794608228deeed2"

NPM_PKGNAME = "cspell-dict-css"

inherit npmhelper
inherit native
