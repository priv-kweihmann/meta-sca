SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.10.3.tgz"
SRC_URI[md5sum] = "43529dfe5b32512d151522b8521f948c"
SRC_URI[sha256sum] = "0c3a7b4b9672b930f4ab24280c7d9bf6cedd38979c4b74727679c09bb1467bfb"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
