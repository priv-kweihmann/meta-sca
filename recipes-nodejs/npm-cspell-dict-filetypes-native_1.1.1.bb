SUMMARY = "NPM: cspell-dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/filetypes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-filetypes/-/cspell-dict-filetypes-1.1.1.tgz"
SRC_URI[md5sum] = "ae6512fc623def513c2d0319825eeb65"
SRC_URI[sha256sum] = "f2662b7a3ab0ff481cca79276b20b460ed48f3ebda76c65cac27973fdd5252a9"

NPM_PKGNAME = "cspell-dict-filetypes"

inherit npmhelper
inherit native
