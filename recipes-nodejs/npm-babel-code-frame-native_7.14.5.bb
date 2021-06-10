SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-code-frame"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.14.5.tgz"
SRC_URI[md5sum] = "0def3a7132c6e147da661c986862869b"
SRC_URI[sha256sum] = "b8fdc1e69ca04a7902380515602c120c852b5034ba5baf4d1c2cba2098559098"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
