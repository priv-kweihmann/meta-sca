SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.10.4.tgz"
SRC_URI[md5sum] = "90b90f474a596fc80b386315715d06ca"
SRC_URI[sha256sum] = "170aadf585958036a3f04add52a62458100a1852454d9e153fb133cadb8d1a20"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
