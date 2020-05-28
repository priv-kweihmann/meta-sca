SUMMARY = "NPM: @babel/code-frame"
DESCRIPTION = "Generate errors that contain a code frame that point to source locations."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-highlight-native"

SRC_URI = "https://registry.npmjs.org/@babel/code-frame/-/code-frame-7.10.1.tgz"
SRC_URI[md5sum] = "900ef0ca75935a8dbf4c03846857f519"
SRC_URI[sha256sum] = "9874079fcfb26d25649436b3316791b75085b08ac73d80f0d2972e0993b5ef9a"

NPM_PKGNAME = "@babel/code-frame"

inherit npmhelper
inherit native
