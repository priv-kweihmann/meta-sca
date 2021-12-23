SUMMARY = "NPM: @babel/helper-split-export-declaration"
DESCRIPTION = ""
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-split-export-declaration"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-split-export-declaration/-/helper-split-export-declaration-7.16.0.tgz"
SRC_URI[md5sum] = "9cdb0c676c78b6f2135e218d36148b10"
SRC_URI[sha256sum] = "6eab849c47eec5e4585c4ac278c894cdcc3e0197f671cc8aa2a3258897f9f384"

NPM_PKGNAME = "@babel/helper-split-export-declaration"

inherit npmhelper
inherit native
