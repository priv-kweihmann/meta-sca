SUMMARY = "NPM: cspell-dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/filetypes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-filetypes/-/cspell-dict-filetypes-1.1.0.tgz"
SRC_URI[md5sum] = "69fd59c78b2250b3f50b07b6e53b5b9f"
SRC_URI[sha256sum] = "892aa71560a6e95eefaa912d52069a1217afa74bdcdc2d630362f70b7d780de8"

NPM_PKGNAME = "cspell-dict-filetypes"

inherit npmhelper
inherit native
