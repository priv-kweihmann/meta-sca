SUMMARY = "NPM: cspell-dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/filetypes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-filetypes/-/cspell-dict-filetypes-1.1.4.tgz"
SRC_URI[md5sum] = "3d7c5bd0a9119eb14d0a633e5e259636"
SRC_URI[sha256sum] = "28e59e652083025d68fb40b75932c261a50572d6244e3d5eb7f723d2217e6cac"

NPM_PKGNAME = "cspell-dict-filetypes"

inherit npmhelper
inherit native
