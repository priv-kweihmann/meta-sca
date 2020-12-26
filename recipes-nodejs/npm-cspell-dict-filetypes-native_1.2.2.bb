SUMMARY = "NPM: cspell-dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/filetypes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-filetypes/-/cspell-dict-filetypes-1.2.2.tgz"
SRC_URI[md5sum] = "4b88ee8009c5a2cf7e811446e5943ac9"
SRC_URI[sha256sum] = "e8078e8cd46f4cf1984443cd69a34c764aada55a42f828fabdddbef89d5b9f5b"

NPM_PKGNAME = "cspell-dict-filetypes"

inherit npmhelper
inherit native
