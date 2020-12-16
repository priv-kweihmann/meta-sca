SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ""
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.12.11.tgz"
SRC_URI[md5sum] = "e2983b8b090ce2c0e424d730546254a7"
SRC_URI[sha256sum] = "8ebc9a298b026fd3feb84ff402b7d31504a311f2ca0ea1f9d63c0ddf6496cf6b"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
