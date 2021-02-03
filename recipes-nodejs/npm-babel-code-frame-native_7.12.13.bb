SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-code-frame"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.12.13.tgz"
SRC_URI[md5sum] = "6727735f1d373c0716142eb14e7260e3"
SRC_URI[sha256sum] = "b5faeba1c9a62366179479a572b09a898a78e5d4dd07e06c98318a48dac0236f"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
