SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-code-frame"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.15.8.tgz"
SRC_URI[md5sum] = "4419cb80f9d8fbdad87f715862949dc5"
SRC_URI[sha256sum] = "17d8c21ced16ed60b55c6276317db7408ef70b0c55c29dec37be2578ade8bd69"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
